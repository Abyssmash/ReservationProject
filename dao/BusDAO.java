package dao;

public class BusDAO {
	private String username = "System";
	private String password = "11111111";
	private String url = "jdbc:oracle:thin@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	public static BusDAO busdao = null;
	
	private BusDAO() {
		init();
	}
	public static BusDAO getInstance() {
		if(busdao == null) {
			busdao = new BusDAO();
		}
		return busdao;
	}
	private void init() {
		try {
				Class.forName(driverName);
				System.out.println("오라클 드라이버 로드 성공");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
