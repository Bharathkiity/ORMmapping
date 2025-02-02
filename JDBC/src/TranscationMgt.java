import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TranscationMgt {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String driver, url, username, password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/db12634";
		username = "root";
		password = "root";//disable auto commit
		String query1 = "update accounts set balance=balance+2000 where accno=1122333";
		String query2 = "update accounts set balance=balance-200000 where accno=4455666";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		// 1.disable auto commit
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		// 2.add to batch
		st.addBatch(query1);
		st.addBatch(query2);

		// 3.excute9
		int[] result = st.executeBatch();
		// 4.commit or rollback
		if (result[0] == 1 && result[1] == 1) {
			con.commit();
			System.out.println("success");
		} else {
			con.rollback();
			System.out.println("transcation is failed");
		}
		st.close();
		con.close();

	}
}
