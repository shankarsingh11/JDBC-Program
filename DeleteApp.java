package comPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteApp {

	public static void main(String[] args) throws SQLException {
	
		// JDBC4.X Autoloading features enable(Driver)
		
	    // step1. Load and register the driver
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//		       System.out.println("loading the driver...");
			
			
	    // step2. Establish the Connection
//		        String url = "jdbc:mysql:///mystudent";
//		       String url = "jdbc:mysql://localhost/mystudent";
		
		       String url = "jdbc:mysql://localhost:3306/mystudent";
		        String username = "root";
		        String pwd = "shankar9560@@##$$";
		        
		      Connection connection =  DriverManager.getConnection(url,username,pwd);
		      System.out.println("Connection object created...");
		// step3.Create Statement Object and send the Query
		      Statement stmnt = connection.createStatement();
		      System.out.println("statement object created...");
		// Step4. Execute the query and Process the resultSet
		     String SqlDeleteQuery = "delete from student where id = 4";
		    int   rowAffected= stmnt.executeUpdate(SqlDeleteQuery);
		    System.out.println("No of row affected is ::" + rowAffected);
		   
		//Step5. Handle SQLException if generated
			 
		//Step6.close the resources	
		  
		    stmnt.close();
		    connection.close();
		     System.out.println("closing the resources...");
	}

}
