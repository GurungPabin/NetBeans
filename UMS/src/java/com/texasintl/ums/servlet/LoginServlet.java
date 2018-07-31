
package com.texasintl.ums.servlet;

/**
 *
 * @author Niraj Karanjeet
 */

import com.texasintl.ums.db.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException,ServletException{
    response.setContentType("text/html");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    
   PrintWriter show = response.getWriter();
   show.println("Username : "+username);
   show.println("Password : "+password);
    save(username,password);

}

public void save(String un,String ps){
    try{
    Connection myCon = DatabaseConnection.getConnection();
    System.out.println("Connection object from DB connection: "+myCon);
    Statement myStat = myCon.createStatement();
     		String sql = "insert into login_table"
     		           +"(password,username)"
     		           +"values('"+un+"','"+ps+"')";
     		myStat.executeUpdate(sql);
     		System.out.println("Insert complete.");
     	}catch(Exception exc){
     		exc.printStackTrace();
     	}
}
}