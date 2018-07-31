
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection{
	public static Connection getConnection(){
		Connection cn = null;
		String url=null;
		String driverClass = null;
		try{
			url = "jdbc:mysql://localhost:3306/nepal_db";
			driverClass = "com.mysql.jdbc.Driver";
			Class.forName(driverClass);
			cn = DriverManager.getConnection(url,"root","");
			System.out.println("Connected !");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("Connection object: "+cn);
		return cn;
	}
		
	public static void main(String args[]){
		Connection cn = DatabaseConnection.getConnection();
	}
}