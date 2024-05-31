package vaibhao.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // You don't need to implement this method for this servlet
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String pwd = request.getParameter("pwd");
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = GetConnection.getConnection();
            String checkUserSql = "SELECT * FROM assistant WHERE email = ?";
            ps = c.prepareStatement(checkUserSql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next() && rs.getString("password").equals(pwd)) {
                HttpSession session = request.getSession();
                session.setAttribute("name", rs.getString("name"));
                session.setAttribute("aid", rs.getInt("aid"));
                response.sendRedirect("welcome.html");
            } else {
                response.setContentType("text/html");
                out.println("<br><br><br><h1 align=center><font color=\"red\">Invalid email or password. Please try again.</font></h1><script type=\"text/javascript\">");
                out.println("redirectURL = \"login.html\";setTimeout(\"location.href = redirectURL;\",\"3000\");");
                out.println("</script>");
            }
        } catch (SQLException e) {
            response.setContentType("text/html");
            out.println("<br><br><br><h1 align=center><font color=\"red\">An error occurred. Please try again later.</font></h1><script type=\"text/javascript\">");
            out.println("redirectURL = \"login.html\";setTimeout(\"location.href = redirectURL;\",\"3000\");");
            out.println("</script>");
            e.printStackTrace();
        } finally {
            // Close PreparedStatement and Connection in a finally block
            try {
                if (ps != null) {
                    ps.close();
                }
                if (c != null) {
                    c.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
