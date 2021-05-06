package exam.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Hello world!
 *
 */
public class App {
//	   static final String DB_URL = "jdbc:mysql://localhost:3306/";
	   static final String DB_URL = "jdbc:mysql://localhost:3306/DISCOTHEQUE";
	   static final String USER = "root";
	   static final String PASS = "";
	   
	   
    public static void main( String[] args )
    {
    	try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    	         Statement stmt = conn.createStatement();
    	      ) {
    		     // CREATE DATABASE
//    	         String sql = "CREATE DATABASE DISCOTHEQUE";
//    		     stmt.executeUpdate(sql);
//    		 	 System.out.println("Database created successfully...");
    		
    		     // CREATE TABLE
//    	         String req = "CREATE TABLE DISQUE " +
//		                   "(id INTEGER not NULL, " +
//		                   " titre VARCHAR(255), " + 
//		                   " artiste VARCHAR(255), " + 
//		                   " label VARCHAR(255), " +
//		                   " année INTEGER)";
//		                   " PRIMARY KEY ( id ))"; 
//    	         stmt.executeUpdate(req);
//    			 System.out.println("Created table in given database...");
    		     
    		     // INSERT
    	         System.out.println("Inserting records into the table...");          
    	         String sql = "INSERT INTO DISQUE VALUES (100, 'titre1', 'artiste1', 'label1', 1990)";
    	         stmt.executeUpdate(sql);
    	         sql = "INSERT INTO DISQUE VALUES (101, 'titre2', 'artiste2', 'label2', 1990)";
    	         stmt.executeUpdate(sql);
    	         sql = "INSERT INTO DISQUE VALUES (102, 'titre3', 'artiste3', 'label3', 1990)";
    	         stmt.executeUpdate(sql);
    	         sql = "INSERT INTO DISQUE VALUES (103, 'titre4', 'artiste4', 'label4', 1990)";
    	         stmt.executeUpdate(sql);
    	          	  
    	      } catch (SQLException e) {
    	         e.printStackTrace();
    	      } 
    	   }    
}