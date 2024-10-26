package vaibhao.vk.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vaibhao.vk.modul.Student;
import vaibhao.vk.service.StudentService;
import vaibhao.vk.service.StudentServiceImpl;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher r = request.getRequestDispatcher("adminmaster.html");
		r.include(request, response);
		StudentService studentService = new StudentServiceImpl();
		List<Student> studList = studentService.getAllStudentRecords();
		out.println("<div class='container'><table class='table mt-5' > ");
		out.println(
				"<tr><th scope='col'>NAME</th><th scope='col'>EMAIL</th><th scope='col'>CONTACT</th><th scope='col'>DELETE</th><th scope='col'>UPDATE</th></tr>");
		for (Student student : studList) {
			int id = student.getId();
			String name = student.getName();
			String email = student.getEmail();
			String contact = student.getContact();
			out.println("<tr scope='row'>");
			out.println("<td>" + name + "</td>");
			out.println("<td>" + email + "</td>");
			out.println("<td>" + contact + "</td>");
			out.println("<td> <a href='delete?studentid="+id+"'>DELETE</a></td>");
			out.println("<td> <a href='update?name="+name+"&email="+email+"&contact="+contact+"'>UPDATE</a></td>");
			out.println("</tr>");
		}
		out.println("</table> </div>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
