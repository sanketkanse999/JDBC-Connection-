package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnection {

	public static void main(String[] args)  {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","your_password");
		Statement stmt = con.createStatement();
		System.out.println("Connection Established!!!!!");
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
				
	}

}  