package assingment_october;

import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college", "root", "Akshay@2002");

            // Create statement object
            Statement st = con.createStatement();

            // Execute query
            ResultSet rs = st.executeQuery("SELECT * FROM students");

            System.out.println("ID | Name | Age | Course");
            System.out.println("-----------------------------------");

            // Loop through all rows
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String course = rs.getString("course");

                System.out.println(id + " | " + name + " | " + age + " | " + course);
            }

            // Close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
