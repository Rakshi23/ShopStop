package com.quinnox.basics;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionWelcome
 */
@WebServlet("/SessionWelcome")
public class SessionWelcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionWelcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			
			HttpSession session=request.getSession(false);
			String myName=(String)session.getAttribute("usname");
			String myPass=(String)session.getAttribute("uspass");
			pw.println("session is is:"+session.getId()+"<br/>");
			pw.println("time is is:"+new Date(session.getLastAccessedTime())+"<br/>");
			
			pw.print("name:"+myName+"pass:"+myPass);
			pw.close();
			
		}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
