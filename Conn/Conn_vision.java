package Conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn_vision {
	private static Connection con;
	public static Connection conn() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		String conInfo="jdbc:oracle:thin:@192.168.0.110:1522:orcl";
		String conInfo="jdbc:oracle:thin:@localhost:1521:xe";
		con = DriverManager.getConnection(conInfo, "whyNot", "whywhy");
		System.out.println("정상 접속 성공!!");
		return con;
	}
}
