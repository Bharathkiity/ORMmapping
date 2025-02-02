import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMultipleRows {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver, url, username, password;
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/edb12634";
        username = "root";
        password = "root";

        String insertQuery = "insert into employee (id, name,email,mobile, salary) VALUES (?,?,?, ?, ?)";
        
        Scanner sc = new Scanner(System.in);
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement st = con.prepareStatement(insertQuery);
        while (true) {
            System.out.println("Please enter id:");
            int id = sc.nextInt();
            System.out.println("Please enter name:");
            String name = sc.next();
            System.out.println("Please enter email:");
            String email = sc.next();
            System.out.println("Please enter mobile:");
            long mobile = sc.nextLong();
            System.out.println("Please enter salary:");
            double salary = sc.nextDouble();
            System.out.println("==========N============");
            
            
            st.setInt(1, id);         
            st.setString(2, name); 
            st.setString(3,email);
            st.setLong(4,mobile);
            st.setDouble(5, salary);   
            
           
            int status = st.executeUpdate();
            if (status >= 1) {
                System.out.println("Record inserted successfully.");
            } else {
                System.out.println("Insertion failed.");
            }
            
            System.out.println("Do you want to insert another record(yes/no):");
            String option = sc.next();
            option.equalsIgnoreCase("yes");
        }
        
       
    
    }
}
