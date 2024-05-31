package vaibhao.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">"); // Add CSS link
        out.println("<div class='container'>");
        out.println("<a href='index.html' class='btn'>Add New Employee</a>");
        out.println("<h1>Employees List</h1>");

        List<Emp> list = EmpDao.getAllEmployees();

        out.print("<table border='1' width='100%' class='employee-table'>");
        out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
        for (Emp e : list) {
            out.print("<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getPassword() + "</td><td>"
                    + e.getEmail() + "</td><td>" + e.getCountry() + "</td><td><a href='EditServlet?id=" + e.getId()
                    + "' class='btn'>edit</a></td><td><a href='DeleteServlet?id=" + e.getId()
                    + "' class='btn'>delete</a></td></tr>");
        }
        out.print("</table>");
        out.println("</div>");

        out.close();
    }
}
