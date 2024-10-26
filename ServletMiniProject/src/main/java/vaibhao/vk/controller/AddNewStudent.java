package vaibhao.vk.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vaibhao.vk.model.Student;
import vaibhao.vk.service.StudentServiceImpl;

/**
 * Servlet implementation class AddNewStudent
 */
@WebServlet("/addnewstudent")
public class AddNewStudent extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewStudent() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        RequestDispatcher r=request.getRequestDispatcher("adminmaster.html");
        r.include(request, response);
        out.println("<form name='frm' action='' method='get'>");
        out.println("<br>");
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<title>Add New Student</title>");
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">");
        out.println("<style>");
        out.println(".container {");
        out.println("    max-width: 500px;");
        out.println("    margin: 50px auto;");
        out.println("}");
        out.println(".form-group {");
        out.println("    margin-bottom: 20px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div class=\"container\">");
        out.println("<h2 class=\"mb-4\">Add New Student</h2>");
        
        out.println("<form>");
        
        out.println("<div class=\"form-group\">");
        out.println("<label for=\"name\">Name</label>");
        out.println("<input type=\"text\" id=\"name\" name=\"name\" class=\"form-control\" placeholder=\"Enter name\">");
        out.println("</div>");
        
        out.println("<div class=\"form-group\">");
        out.println("<label for=\"email\">Email</label>");
        out.println("<input type=\"email\" id=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Enter email\">");
        out.println("</div>");
        
        out.println("<div class=\"form-group\">");
        out.println("<label for=\"contact\">Contact</label>");
        out.println("<input type=\"text\" id=\"contact\" name=\"contact\" class=\"form-control\" placeholder=\"Enter contact\">");
        out.println("</div>");
        
        out.println("<button type=\"submit\" name='s' class=\"btn btn-primary\">Add New Student</button>");
        
        out.println("</form>");
        out.println("</div>");

        out.println("<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>");
        out.println("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>");
        
        out.println("</body>");
        out.println("</html>");
        out.println("</form>");
  
	  }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
