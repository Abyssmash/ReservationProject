package dao;

public class BusDAO {
	private String username = "System";
	private String password = "11111111";
	private String url = "jdbc:oracle:thin@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	public static BusDAO busdao = null;
	
	// CRUD 구성 
	
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
//	DAO
//	  포함될 메소드
//	- 버스 조회(R: select)(데이터 미리 입력: 배차시간 모든 지역 동일)
//	- 예약 삭제 (Delete)
//	- 회원가입 (Create)
//	- 버스 좌석 정보 예약 반영, 일주일 간격 버스 배차(update)
//	- 예약 조회 (select)
	public void add() {
		
	}
	public ArrayList<>selectAll(){
		
	}
	public void mod() {
		
	}
	public void delete() {
		
	}
	
}
