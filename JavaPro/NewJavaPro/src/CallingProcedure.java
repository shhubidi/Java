import java.sql.*;

public class CallingProcedure {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            //insertion
            CallableStatement cs = con.prepareCall("{call inserting_values(?,?,?)}");

            cs.setInt(1, 106);
            cs.setString(2, "Rahul");
            cs.setInt(3, 90);
            
            cs.execute();
            System.out.println("Stored procedure executed successfully!");


            //deletion
            cs = con.prepareCall("{call deleting_values(?)}");

            cs.setInt(1, 102);
            cs.execute();
            System.out.println("procedure called for deletion successfully!");

            //update
            cs = con.prepareCall("{call updating_values(?,?,?)}");

            cs.setInt(1, 104);
            cs.setString(2, "Raghav");
            cs.setInt(3, 70);

            cs.execute();
            System.out.println("procedure called for updating values successfully!");

            
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) 
            { 
                int id = rs.getInt("prn"); 
                String name = rs.getString("name"); 
                int marks = rs.getInt("marks"); 
                System.out.println(id + " " + name + " " + marks);
            }
            
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}