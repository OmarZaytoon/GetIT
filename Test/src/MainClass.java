import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		String nameString="omar, monther, zaytoon, ";
		int end=0;
		for(int i=0;i<3;i++) {
			end=nameString.indexOf(',');
			System.out.println(end);
			String name=nameString.substring(0, end);
			System.out.println(name);
			nameString=nameString.substring(end+2,nameString.length());
			System.out.println(nameString);
		}
	}	    
}
/*
 * 	try {
	         long startTime1 = System.nanoTime();
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/getit?autoReconnect=true&useSSL=false","root","$RootGetIT123$");
	         long elapsedTime1 = System.nanoTime() - startTime1;
	         long startTime2 = System.nanoTime();
			String query="Insert into user (username,password,name,phone,email,entery_date,latitude,longitude,follower_number) values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			String username="u1",password="p",name="o",phone="1",email="e",entery_date="2020-01-01 10:10:10",latitude="12.5921",longitude="12.52351",folower_number="42";
			 long a=-1000000000;  
			for(int i=0;i<1000000000;i++) { 
				username=String.valueOf(a);
				password=String.valueOf(a);
				phone=String.valueOf(a);
				a++;
				ps.setString(1, username);
				ps.setString(2, password);
				ps.setString(3, name);
				ps.setString(4, phone);
				ps.setString(5, email);
				ps.setString(6, entery_date);
				ps.setString(7, latitude);
				ps.setString(8, longitude);
				ps.setString(9, folower_number);
				ps.executeUpdate();
				System.out.println(ps.toString());
			}
	         long elapsedTime2 = System.nanoTime() - startTime1;
		
		
	         System.out.println("Total execution time to create connection to database in millis: "
	                 + elapsedTime1/1000000);
	         System.out.println("Total execution time to create 10 Million user  in database in millis: "
	                 + elapsedTime2/1000000);
	         
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

 */
