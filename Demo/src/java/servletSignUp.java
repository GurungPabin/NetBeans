import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javafx.beans.binding.Bindings;

public class servletSignUp extends HttpServlet{
	protected void doGet(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html");
			PrintWriter show = response.getWriter();

			String fn = request.getParameter("name");
			String gn = request.getParameter("gender");
			String dob = request.getParameter("dateOfBirth");
			String nm = request.getParameter("number");
			String ad = request.getParameter("address");
			String un = request.getParameter("username");
			String ps = request.getParameter("password");
			String em = request.getParameter("email");
			
                        if(fn !=null && gn!=null && dob!=null && nm.length()<9 && ad!=null && un!=null && ps.length()<7 && em!=null)
                        {
                            show.println("Welcome "+fn+" ,you have just signed up."+"<br/>");
                            
                        }
                        
                        else{
                            RequestDispatcher rd = request.getRequestDispatcher("/signup.html");
                            rd.include(request,response);
                            show.println("Enter all your information to sign up right now!!.");
                        }
			/*show.println("Gender : "+gn+"<br/>");
			show.println("Date Of Birth : "+dob+"<br/>");
			show.println("Phone Number : "+nm+"<br/>");
			show.println("Address : "+ad+"<br/>");
			show.println("Username : "+un+"<br/>");
			show.println("Password : "+ps+"<br/>");
			show.println("Email : "+em+"<br/>");
*/
			save(fn,gn,dob,nm,ad,un,ps,em);
				
	}
	private void save(String u, String g,String d,String n,String a,String uname,String p,String e){
     	try{
     		Connection myCon = DatabaseConnection.getConnection();
               System.out.println("Connection object from DB connection: "+myCon);
     		Statement myStat = myCon.createStatement();
     		String sql = "insert into signup_table"
     		           +"(Full_Name,Gender,Dateofbirth,PhoneNumber,Address,Username,Password,Email)"
     		           +"values ('"+u+"','"+g+"','"+d+"','"+n+"','"+a+"','"+uname+"','"+p+"','"+e+"')";
     		myStat.executeUpdate(sql);
     		System.out.println("SignUp complete.");
     	}catch(Exception exc){
     		exc.printStackTrace();
     	}
     }
	}




