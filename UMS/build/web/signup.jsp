<%-- 
    Document   : signup
    Created on : Jul 15, 2018, 10:38:26 AM
    Author     : Niraj Karanjeet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <center>
	<h4>SignUp here</h4>

	<form method ="get" action="./SignUpServlet" >
		<table>

            <tr>
			<td>Full Name:</td>
			<td>
				<input type="text" name="name">
			</td>
			</tr>
 
            <tr>
			<td>Gender:</td>
			<td>
            <br><input type="radio" value="Male" name="gender">Male</br>
            <br><input type="radio" value="Female" name="gender">Female</br>
            <br><input type="radio" value="Others" name="gender">Others</br>
            </td>
			</tr>

            <tr>
				<td>Date Of Birth:</td>
				<td>
					<input type="Date" name="dateOfBirth">
				</td>
			</tr>

			<tr>
				<td>Phone Number:</td>
				<td>
					<input type="Number" name="number">
				</td>
			</tr>


            <tr>
				<td>Address</td>
				<td>
					<input type="Address" name="address">
				</td>
			</tr>

			<tr>
			<td>Username:</td>
			<td>
				<input type="text" name="username">
			</td>
			</tr>

			<tr>
				<td>Password:</td>
				<td>
					<input type="Password" name="password">
				</td>
			</tr>

			<tr>
				<td>Email:</td>
				<td>
					<input type="Email" name="email">
				</td>
			</tr>

            

			<td>
				<input type="submit" value="SignUp" name="SignUp" >
			</td>
		</table>

	</form>
	
</center>

</body>
</html>
