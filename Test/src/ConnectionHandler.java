

import java.io.IOException;   
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConnectionHandler {

public ConnectionHandler(){
		
	}
	
	  public Connection getConnection() throws IOException{
		   
	        Connection connection = null;
	        try {
	        		    		
		        // Load the JDBC driver
//		        String driverName = "org.gjt.mm.mysql.Driver"; // MySQL MM JDBC driver
	        	String driverName = "org.gjt.mm.mysql.Driver";// MySQL MM JDBC driver
		        Class.forName(driverName);
		
		        // Create a connection to the database
		        // String serverName = "localhost";
//		        String mydatabase = "jpost";
		        String serverName = "localhost:3306";
		        String mydatabase = "getit";
		        int connTimeout =60;
		        String url = "jdbc:mysql://" + serverName + "/" + mydatabase; // a JDBC URL
		        
		        
		
//		         String username = "jpost";
//		         String password = "jpost123";
		         String username = "root";
		         String password = "$RootGetIT123$";
		         String unicode= "?useUnicode=yes&characterEncoding=UTF-8";
		         String autoReconnect = "&autoReconnect="+true;
		         
		         DriverManager.setLoginTimeout((int) connTimeout); 
		          connection = DriverManager.getConnection(url+unicode+autoReconnect, username, password);


		        
//	                if(connection!=null) {
//	                	System.out.println("connection successful");
//	                }	   else {
//	                	System.out.println("connection faild");
//
//	             	
//                }     
		           
		        
		    } catch (ClassNotFoundException e) {
		        // Could not find the database driver
		        e.printStackTrace();
		    } catch (SQLException e) {
		        // Could not connect to the database
		    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		    	Date date = new Date();
		    	System.out.println(dateFormat.format(date)+" :: Not Able to connect");
		        e.printStackTrace();
	        } 
	        
	        return connection;
	
	
}
	  
	    
	    public void closeConnection(Connection connection){
	        try {
	            if(connection != null){
	                connection.close();
	                connection = null;
	            }
	        }
	        catch (SQLException e) {
	            connection = null;
	        }
	  }}

