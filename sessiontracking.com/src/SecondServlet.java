

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/Servlet2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			response.setContentType("text/html");
			PrintWriter out= response.getWriter();
			/*Cookie ck[]=request.getCookies();
			out.print("Hello:"+ck);*/
			/*Cookie ck[]=request.getCookies();  
			for(int i=0;i<ck.length;i++){  
			 out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());
			}*/
			/*Cookie ck=new Cookie("uname","");//deleting value of cookie  
			ck.setMaxAge(0);//changing the maximum age to 0 seconds  
			response.addCookie(ck);*/
			
			Cookie ck1[]=request.getCookies();
			out.print("Hello:"+ck1[0].getValue());
			
			out.close();	
			
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
	}
}
		
		
		
	


