import java.sql.*;

public class UpdateSalary{
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            
            Statement stmt = con.createStatement();
            System.out.println("Table before UPDATE query:");            
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
            while (rs.next()) 
            { 
                int id = rs.getInt("empid"); 
                int salary = rs.getInt("salary"); 
                System.out.println(id + " " + salary);
            }

            // UPDATE
            String updateQuery = "UPDATE employee SET salary=? WHERE empid=?";
            PreparedStatement ps2 = con.prepareStatement(updateQuery);
            ps2.setInt(1, 87000);
            ps2.setInt(2, 107);
            ps2.executeUpdate();

            System.out.println("Updated Table after UPDATE query:");
            rs = stmt.executeQuery("SELECT * FROM employee");
            while (rs.next()) 
            { 
                int id = rs.getInt("empid"); 
                int salary = rs.getInt("salary"); 
                System.out.println(id + " " + salary);
            }

            con.close();
            System.out.println("UPDATE operations done!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
