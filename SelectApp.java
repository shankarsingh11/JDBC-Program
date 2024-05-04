package comPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {

	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// JDBC4.X Autoloading features enable(Driver)
		
    // step1. Load and register the driver
//		 Class.forName("com.mysql.cj.jdbc.Driver");
//	       System.out.println("loading the driver...");
		
		
    // step2. Establish the Connection
//	        String url = "jdbc:mysql:///mystudent";
//	       String url = "jdbc:mysql://localhost/mystudent";
	       String url = "jdbc:mysql://localhost:3306/mystudent";
	        String username = "root";
	        String pwd = "shankar9560@@##$$";
	        
	      Connection connection =  DriverManager.getConnection(url,username,pwd);
	      System.out.println("Connection object created...");
	// step3.Create Statement Object and send the Query
	      Statement stmnt = connection.createStatement();
	      System.out.println("statement object created...");
	// Step4. Execute the query and Process the resultSet
	     String SqlSelectQuery = "select id,name,email from student";
	    ResultSet rs= stmnt.executeQuery(SqlSelectQuery);
	     System.out.println("ResultSet object created...");
	    System.out.println("id\tname\temail");
	    while(rs.next()) {
//	    	int id = rs.getInt(1);
//	    	String name = rs.getString(2);
//	    	String email = rs.getString(3);
	    	
	    	int id = rs.getInt("id");
        	String name = rs.getString("name");
 	    	String email = rs.getString("email");
	    	  System.out.println(id+"\t"+name+"\t"+email);
	    }
	//Step5. Handle SQLException if generated
		 
	//Step6.close the resources	
	    rs.close();
	    stmnt.close();
	    connection.close();
	     System.out.println("closing the resources...");
	    
	}

}
