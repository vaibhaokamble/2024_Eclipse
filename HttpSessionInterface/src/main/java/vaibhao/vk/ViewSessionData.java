package vaibhao.vk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/view")
public class ViewSessionData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ViewSessionData() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		//Object obj=session.getAttribute("u");
		//String username=obj.toString();
		String username=session.getAttribute("u").toString();
		String password=session.getAttribute("p").toString();
		out.println("<h1>Data from session is </h1>");
		out.println("User name : "+username+"<br>");
		out.println("Password is : "+password+"<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
