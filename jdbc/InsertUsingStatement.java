package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {

    public static void main(String[] args) throws SQLException {
        String URL = "jdbc:mysql://localhost:3307/junejava";
        String USER = "root";
        String PASS = "root";

        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        Statement st = conn.createStatement();

        String insert1 = "INSERT INTO customer VALUES (10,'Sushant')";
        String insert2 = "INSERT INTO customer VALUES (6,'Prathamesh')";
        String insert3 = "INSERT INTO customer VALUES (7,'Akshay')";
        String insert4 = "INSERT INTO customer VALUES (8,'Gaus')";
        String insert5 = "INSERT INTO customer VALUES (9,'Asif')";

        st.addBatch(insert1);
        st.addBatch(insert2);
        st.addBatch(insert3);
        st.addBatch(insert4);
        st.addBatch(insert5);

        try {
            int rows[] = st.executeBatch();
            if (rows.length > 0) {
                System.out.println(rows.length + " rows inserted successfully!");
            } else {
                System.out.println("No rows inserted!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close resources
            st.close();
            conn.close();
        }
    }
}
