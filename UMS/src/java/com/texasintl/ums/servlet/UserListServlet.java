
package com.texasintl.ums.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import com.texasintl.ums.db.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author Niraj Karanjeet
 */
public class UserListServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
        Connection myCon = DatabaseConnection.getConnection();
        Statement stat = myCon.createStatement();
        String viewUserQuery = "SELECT * FROM signup_table";
        ResultSet rs = stat.executeQuery(viewUserQuery);
        ArrayList<UserDto> userDtoList = new ArrayList<>();
        while(rs.next()){
            UserDto userDto = new UserDto();
            int Id = rs.getInt("id");
            userDto.setId(Id);
            String fullname = rs.getString("Full_Name");
            userDto.setFullName(fullname);
            String username = rs.getString("Username");
            userDto.setFullName(username);
            
            userDtoList.add(userDto);
            
            request.setAttribute("userDtoListObj", userDtoList);
            RequestDispatcher rd = request.getRequestDispatcher("./userList.jsp");
            rd.forward(request,response);
            
        }
        
        
        
    }catch(Exception ex){
        ex.printStackTrace();
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
