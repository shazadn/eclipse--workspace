import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConn {
	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Lidl", "root", "password");
		Statement stmt = conn.createStatement();
		//String sql = "create database Lidl";
		//String sql = "create table stores(name varchar(50))";
		//String sql = "insert into stores values('salford')"; 
		String sql = "select * from stores";
		stmt.execute(sql);
		ResultSet rs = stmt.executeQuery(sql);
		
		
		while((rs.next())) {
			System.out.println(rs.getString("name"));
		}
		 conn.close(); 
		
		
	
		
	}
}
