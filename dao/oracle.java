package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class oracle {
	private String username = "System";
	private String password = "11111111";
	private String url = "jdbc:oracle:thin@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	public Connection conn = null;
	
	public void load(){
		init();
	}
	private void init() {
		try {
			Class.forName(driverName);
			System.out.println("오라클 드라이버 로드 성공");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private boolean conn() {
		try {
			conn = DriverManager.getConnection
					("jdbc:oracle:thin@localhost:1521:orcl","system","11111111");
			System.out.println("커넥션 자원 획득 성공");
			return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
