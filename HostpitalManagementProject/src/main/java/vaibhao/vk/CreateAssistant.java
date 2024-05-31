package vaibhao.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateAssistant")
public class CreateAssistant extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public CreateAssistant() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String pwd = request.getParameter("pwd");
        PrintWriter out = response.getWriter();
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = GetConnection.getConnection();
            String sql = "INSERT INTO assistant(name, email, phone, password) VALUES (?, ?, ?, ?)";
            ps = c.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, pwd);
            
            int rowsAffected = ps.executeUpdate();
            
            if (rowsAffected == 1) {
                response.sendRedirect("login.html");
            } else {
                response.setContentType("text/html");
                out.println("<br><br><br><h1 align=center><font color=\"red\">TRY AGAIN<br>REDIRECTING BACK REGISTRATION PAGE</font></h1><script type=\"text/javascript\">");
                out.println("redirectURL = \"newAssistant.html\";setTimeout(\"location.href = redirectURL;\",\"6060\");");
                out.println("</script>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.setContentType("text/html");
            out.println("<br><br><br><h1 align=center><font color=\"red\">TRY AGAIN<br>REDIRECTING BACK REGISTRATION PAGE</font></h1><script type=\"text/javascript\">");
            out.println("redirectURL = \"newAssistant.html\";setTimeout(\"location.href = redirectURL;\",\"6060\");");
            out.println("</script>");
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
