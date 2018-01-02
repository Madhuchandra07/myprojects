

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try{  
			  
		        response.setContentType("text/html");  
		        PrintWriter out = response.getWriter();  
		          
		        String n=request.getParameter("userName");  
		        out.println("Welcome "+n);  
		    /*      
		        //creating form that have invisible textfield  
		        out.print("<form action='servlet2' method='post'>");  
		        out.print("<input type='hidden' name='uname' value='rockstar'>"); 
		        out.print("<input type='text' name='username'>");
		        out.print("<input type='submit' value='go'>");  
		        out.print("</form>"); */ 
		        
		        out.println("<a href='./servlet2?uname="+n+"'>visit</a>");
		        out.print("<hr>");
		        
		        
		        out.close();  
		  
		                }
		 catch(Exception e){System.out.println(e);}  
		    }  
		
		
		
	}


