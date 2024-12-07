package org.example;
import javax.xml.transform.Result;
import java.sql.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String password = "Sat@1234";
        String query = "SELECT * FROM customers";
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {

            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
            System.out.println(rs.getDate(6));
            System.out.println(rs.getString(7));
            System.out.println(rs.getString(8));
            System.out.println(rs.getString(9));
            System.out.println(rs.getString(10));
            System.out.println("-------------------------");
        }

        con.close();
    }
}