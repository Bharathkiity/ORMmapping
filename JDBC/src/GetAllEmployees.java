import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllEmployees {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		String driver,url,username,password;
		driver="com.mysql.cj.jdbc.Driver";
		url="jdbc:mysql://localhost:3306/edb12634";
		username="root";
		password="root";
		
		String selectQuery="select *from employee";
		
		//1.load the driver
		//Class.forName(driver);
		//2.Establish Connection
		Connection con=DriverManager.getConnection(url,username,password);
		//3.Create statement object
		Statement st=con.createStatement();
		//4.process query(select)
		ResultSet rs=st.executeQuery(selectQuery);
		//cursor point
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("email")+" "+rs.getLong("mobile")+" "+rs.getDouble("salary"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("email"));
			System.out.println(rs.getLong("mobile"));
			System.out.println(rs.getDouble("salary"));
			System.out.println("====================");
		}
		//5.close resources
		rs.close();
		st.close();
		con.close();
}
}
