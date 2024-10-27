package dao;

import java.util.ArrayList;
import dao.oracle;
import dto.BusDTO;
import dto.reservationDTO;
import dto.signUpDTO;
import dto.userDTO;

public class BusDAO extends oracle implements DBdao{
	public static BusDAO busdao = null;
	// CRUD 구성 
	
	private BusDAO() {
		load();
	}
	public static BusDAO getInstance() {
		if(busdao == null) {
			busdao = new BusDAO();
		}
		return busdao;
	}
//	DAO
//	  포함될 메소드
//	- 버스 조회(R: select)(데이터 미리 입력: 배차시간 모든 지역 동일)
//	- 예약 삭제 (Delete)
//	- 회원가입 (Create)
//	- 버스 좌석 정보 예약 반영, 일주일 간격 버스 배차(update)
//	- 예약 조회 (select)
	public void add(reservationDTO reslistdto) {
		if(conn()) {
			try {
				
			System.out.println("예약이 완료되었습니다.");
			}catch(ClassNotFoundException e) {
				
			}
		}
		 
	}
	public ArrayList<reservationDTO>selectAll(){
//		seatNum = null;
//		private String resNum = null;
//		private String userId = null;
//		private String date = null;
//		private String hour = null;
//		private String departure
//		cardNum = null;
//		private String receipt
		ArrayList <reservationDTO> l = new ArrayList<reservationDTO>();
		reservationDTO temp = new reservationDTO();
		temp.setResNum("1");
		temp.setUserId("나나");
		temp.setDate("20241031");
		temp.setHour("13:40");
		temp.setDeparture("서울");
		temp.setDestination("부산");
		temp.setSeatNum("1");
		temp.setCardNum("1000200030004000");
		temp.setReceipt("30000원");
		l.add(temp);
		return l;
	}
	@Override
	public void add(BusDTO resbusdto) {
		// TODO Auto-generated method stub
	}
	@Override
	public void add(signUpDTO signupdto) {
		// TODO Auto-generated method stub
		if(conn()) {
			try {
				
			}catch(ClassNotFoundException e) {
				
			}
		}
	}
	@Override
	public void add(userDTO userdto) {
		// TODO Auto-generated method stub
		
	}
	public void delete(reservationDTO reslistdto) {
		System.out.println("예약이 취소되었습니다.예약번호: "+ reslistdto.getResNum());
	}
	
}
