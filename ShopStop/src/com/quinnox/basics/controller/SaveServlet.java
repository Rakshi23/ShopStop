package com.quinnox.basics.controller;

import java.io.IOException;

import com.quinnox.basics.DAO.CustomerDAO;
import com.quinnox.basics.model.*;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quinnox.basics.model.Customer;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("Text/html");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		
		Customer c=new Customer();
		c.setName(name);
		c.setPassword(password);
		c.setEmail(email);
		c.setCountry(country);
		int status=CustomerDAO.insertCustomer(c);
		if(status>0)
		{
			pw.print("<p> Record saved successfully</p>");
			request.getRequestDispatcher("login.html").include(request,response);
		}
		else
		{
			pw.print("<p> Sorry !!! unable to save Record</p>");
		}
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
