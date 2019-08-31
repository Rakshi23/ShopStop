package com.quinnox.basics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ServletInterfaceDemo
 */
@WebServlet("/ServletInterfaceDemo")
public class ServletInterfaceDemo implements Servlet {
	ServletConfig config=null;
    /**
     * Default constructor. 
     */
    public ServletInterfaceDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("servlet is intialized");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("servlet is destroyed");
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		
		return config;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		
		return "copyright 2010-2019"; 
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		o.print("<html><body>");
		o.print("<b>Hello simple servlet</b>");
		o.print("</body></html>");
	}

}
