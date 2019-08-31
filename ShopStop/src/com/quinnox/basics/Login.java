package com.quinnox.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		response.sendRedirect("http://www.quinnox.com");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		response.setContentType("Text/html");
		String user=request.getParameter("u");
		String pass=request.getParameter("p");
		
		if(user.equals("arjun")&& pass.equals("redhat"))
		{
			//pw.println("welcome"+user+"<br><br>");
			//pw.println("login sucess..!");
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request,response);
		}
		else
		{
			//pw.println("login failed...!");
			//pw.close();
			pw.println("<html><body text='red'><h3>Login failed</h3></body></html>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}
