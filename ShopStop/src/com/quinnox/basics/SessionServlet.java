package com.quinnox.basics;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		
		
		PrintWriter pw=response.getWriter();
		response.setContentType("Text/html");
		String user=request.getParameter("u");
		String password=request.getParameter("p");
		
		if(user.equals("arjun")&& password.equals("redhat"))
		{
			pw.print("Welcome"+user);
			pw.println("<br><br>");
			pw.print("Here is  your password"+password);
			pw.println("<br><br>");
			
			HttpSession session=request.getSession();
			session.setAttribute("usname",user);
			session.setAttribute("uspass", password);
			pw.println("session is is:"+session.getId()+"<br/>");
			pw.println("time is is:"+new Date(session.getLastAccessedTime())+"<br/>");
		}
		else
		{
			pw.println("<html><body text='red'><h3>Login failed</h3></body></html>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
		pw.print("<a href='SessionWelcome'>View details</a>");
		pw.close();
			//pw.println("welcome"+user+"<br><br>");
			//pw.println("login sucess..!");
	}
catch(Exception exp)
		{
	System.out.print(exp);
		}
	}
	/**}
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
