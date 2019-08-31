package com.quinnox.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieServlet
 */
@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieServlet() {
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
			String name=request.getParameter("username");
			String password=request.getParameter("userpassword");
			pw.print("hello here"+name);
			pw.print("your password"+password);
			Cookie c1=new Cookie("userName",name);
			Cookie c2=new Cookie("userPassword",password);
			
			response.addCookie(c1);
			response.addCookie(c2);
			pw.print("<a href='WelcomeCookie'>view Details</a>");
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
