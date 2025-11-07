package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String URL = "jdbc:mysql://localhost:3307/junejava";
		String USER = "root";
		String PASS = "root";
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		Statement st=conn.createStatement();
		String query="create table customer(cid int primary key, cname varchar(20)) ";
		st.execute(query);
		System.out.println("Table create");
		st.close();
		

	}

}
