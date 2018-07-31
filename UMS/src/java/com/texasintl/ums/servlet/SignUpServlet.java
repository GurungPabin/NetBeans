/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.texasintl.ums.servlet;

import com.texasintl.ums.db.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Niraj Karanjeet
 */
public class SignUpServlet extends HttpServlet {

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String fn = request.getParameter("fullname");
        String gn = request.getParameter("gender");
        String dob = request.getParameter("dateofbirth");
        String pn = request.getParameter("phoneno");
        String ad = request.getParameter("address");
        String un = request.getParameter("username");
        String ps = request.getParameter("password");
        String em = request.getParameter("email");
        
       PrintWriter hi = response.getWriter(); 
            hi.println(un+" have just signed in.");
            saveSignUp(fn,gn,dob,pn,ad,un,ps,em);
     
    }
    
    public void saveSignUp(String a,String b,String c,String d,String e,String f,String g,String h){
        try{
            Connection myCon = DatabaseConnection.getConnection();
            Statement stat = myCon.createStatement();
            String sql="insert into signup_table"+
                        "(Full_Name,Gender,Dateofbirth,PhoneNumber,Address,Username,Password,Email)"
                   +"values('"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"')";
            stat.executeUpdate(sql);
            System.out.println("SignUp complete.");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
}
}