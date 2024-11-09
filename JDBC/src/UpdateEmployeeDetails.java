import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployeeDetails {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver, url, username, password;
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/edb12634";
        username = "root";
        password = "root";

        String updateQuery = "update employee set name = ? ,email=?,mobile=?,sal=? where id = ?";
        
        Scanner sc = new Scanner(System.in);
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement st = con.prepareStatement(updateQuery);
        System.out.println("enter the employee ID to update:");
        int id = sc.nextInt();
        
        System.out.println(" enter the new name:");
        String name = sc.next();
        System.out.println("enter the new email:");
        String email = sc.next();
        System.out.println("enter the new mobile:");
        long mobile = sc.nextLong();
        System.out.println("enter the new sal:");
        double sal = sc.nextDouble();
        
       
        st.setString(1, name); 
        st.setString(2, email); 
        st.setLong(3,mobile);
        st.setDouble(4,sal);
        st.setInt(5, id);
        
        
        int status = st.executeUpdate();
        if (status >= 1) {
            System.out.println("updated successfully.");
        } else {
            System.out.println("Update failed");
        }
        
        // Clean up resources
        st.close();
        con.close();
        sc.close();
    }
}
