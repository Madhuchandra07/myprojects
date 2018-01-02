

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterForm
 */
@WebServlet("/servlet1")
public class RegisterForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		 String m=request.getParameter("userid");       
		String n=request.getParameter("userName");  
		String p=request.getParameter("userPass");  
		String e=request.getParameter("userEmail");  
		String c=request.getParameter("userCountry");  
		
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");  
			  
			PreparedStatement ps=con.prepareStatement("insert into RegisterUser values(?,?,?,?,?)");  
			ps.setString(1, m); 
			ps.setString(2,n); 
			ps.setString(3,p);  
			ps.setString(4,e);  
			ps.setString(5,c);  
			          
			int i=ps.executeUpdate();  
			if(i>0)  
			out.print("You are successfully registered...");  
			      
			          
			}catch (Exception e2) {System.out.println(e2);}  
			          
			out.close();  
		
		
		
	}

}
