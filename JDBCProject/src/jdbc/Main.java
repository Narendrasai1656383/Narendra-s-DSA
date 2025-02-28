package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nani1","root","root@123");
			System.out.println("Connected to the database!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
