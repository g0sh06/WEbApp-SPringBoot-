package WebApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Servlet implementation class Testdbservlet
 */
public class Testdbservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	  String user = "springstudent";
	  String pass = "springstudent";
	  
	  String jdbcURL = "jdbc:mysql//localhost:3306/web_customer_tracker?useSSL=false";
	  String driver = "com.mysql.jdbc.Driver";
	  
	  try {
		  PrintWriter out = response.getWriter();
	  
	      out.println("Conenctiong to database:" + jdbcURL);  
	      
	      Class.forName(driver);
	      
	      Connection myConn = DriverManager.getConnection(jdbcURL, user, pass);
	      
	      out.println("SUCCESS!!!");
	      
	      myConn.close();
	  
	  }	  
	  catch(Exception exc){
		  exc.printStackTrace();
		  throw new ServletException(exc); 
	  }
	
	
	
	}

}
