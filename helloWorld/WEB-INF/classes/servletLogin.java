import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class servletLogin extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html");
			PrintWriter show = response.getWriter();
			String un = request.getParameter("username");
			String ps = request.getParameter("password");

			show.println("Welcome "+un+" ,you have just logged in."+"<br/>");
			//show.println("Password : "+ps+"<br/>");
			saveData(un, ps);
		
	}

     private void saveData(String username, String passsword){
     	try{
     		Connection myCon = DatabaseConnection.getConnection();
               System.out.println("Connection object from DB connection: "+myCon);
     		Statement myStat = myCon.createStatement();
     		String sql = "insert into user_table"
     		           +"(Password,Username)"
     		           +"values ('"+passsword+"','"+username+"')";
     		myStat.executeUpdate(sql);
     		System.out.println("Insert complete.");
     	}catch(Exception exc){
     		exc.printStackTrace();
     	}
     }

	}




