package vaibhao.vk.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher r=request.getRequestDispatcher("adminmaster.html");
		r.include(request, response);
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		out.println("<form action=' ' method='get'>" );
		out.println("<div class='container mt-5'> ");
		out.println("<div class='form-group'>");
		out.println("<input type='text' name='name' value='"+name+"' class='form-control' placeholder='enter the name'/>");
		out.println("</div>");
		
		out.println("<div  class='form-group'>");
		out.println("<input type='email' name='email' value='"+email+"'  class='form-control' placeholder='enter the email'/>");
		out.println("</div>");
		
		out.println("<div  class='form-group'>");
		out.println("<input type='contact' name='contact'   value='"+contact+"' class='form-control' placeholder='enter the contact'/>");
		out.println("</div>");
		
		out.println("<div  class='form-group'>");
		out.println("<input type='submit' name='s' value='Update Student Records' class='form-control btn btn-outline-danger btn-block' />");
		out.println("</div>");
		out.println("</div>");
		out.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
