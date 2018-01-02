package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//general settings
		//request details are username and password, those requests are stored in request object.
		
		//response object usually empty, we have to add response to the response object , then that response object will be displayed in client browser
		//to add response into response object we need printwriter.
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("hi this is my first application");
		writer.println("<br>");
		writer.println("this is get request");
		
		//request data gathering logics
		String uname = request.getParameter("uname");
		
		String upwd =request.getParameter("upwd");
		
		//business logics
		if(uname.equals("durga")&&upwd.equals("ratan"))
		{
			writer.println("Login success");
			writer.println("<br>");
			writer.println("user name : "+uname);
			writer.println("<br>");
			writer.println("user password :  "+upwd);
		}
			else
			{
				writer.println("Login fail");
			}
		}
		
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
