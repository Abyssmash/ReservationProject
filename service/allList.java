package service;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Reader;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

// 조회 버튼을 누르면 나오는 class
// 로그인한 아이디로 예약한 모든 내역을 보여준다. (날짜, 시간, 버스 좌석, 결제 내역)
// 예약하지 않았을 때는 예약한 내역이 없다는 문구가 나오고 resList 화면으로 넘어감
public class allList extends JFrame {
	allList(){
		super("조회 목록");
		JPanel title = new JPanel();
		JPanel info = new JPanel();
		JPanel acc = new JPanel();
		JLabel l = new JLabel("조회 목록");
		//JTextArea list = new JTextArea("<html>+ID: <br>예약번호: <br>좌석번호: 
		//<br>탑승일: <br>탑승시간: <br>출발지: 
		//<br>도착지: <br>카드번호: <br>결제금액: /<html>");
		JButton delete = new JButton("취소");
		JButton ok = new JButton("확인");
		
		JLabel res = new JLabel("예약번호");
		JTextField a = new JTextField("1");
		JLabel id = new JLabel("ID");
		JTextField b = new JTextField("나나");
		JLabel date= new JLabel("탑승일자");
		JTextField c = new JTextField("20241031");
		JLabel hour = new JLabel("탑승시간");
		JTextField d = new JTextField("13:40");
		JLabel dep = new JLabel("출발지");
		JTextField e = new JTextField("서울");
		JLabel des = new JLabel("도착지");
		JTextField f = new JTextField("부산");
		JLabel seat = new JLabel("좌석 번호");
		JTextField g= new JTextField("1");
		JLabel card = new JLabel("카드 번호");
		JTextField h = new JTextField("1000200030004000");
		JLabel pay = new JLabel("결제금액");
		JTextField i = new JTextField("30000원");
		// 예약 취소는 시간 되면 하기....
		// 모든 텍스트 area에 DB에 저장된 정보 가져오기
		// 라벨 + 텍스트 박스 형식으로 가운데 배치
		// 맨 아래에 확인 버튼이 오게 만들기
//		temp.setResNum("1");
//		temp.setUserId("나나");
//		temp.setDate("20241031");
//		temp.setHour("13:40");
//		temp.setDeparture("서울");
//		temp.setDestination("부산");
//		temp.setSeatNum("1");
//		temp.setCardNum("1000200030004000");
//		temp.setReceipt("30000원");
//		l.add(temp);
		title.add(l);
		info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
		info.add(res);
		info.add(a);
		info.add(id);
		info.add(b);
		info.add(date);
		info.add(c);
		info.add(hour);
		info.add(d);
		info.add(dep);
		info.add(e);
		info.add(des);
		info.add(f);
		info.add(seat);
		info.add(g);
		info.add(card);
		info.add(h);
		info.add(pay);
		info.add(i);
		acc.add(ok);
		acc.add(delete);
		
		
		// ID 예약번호 좌석번호 탑승일 탑슬시간 출발지 도착지 카드번호 결제금액
		this.add(title, "North");
		this.add(info,"Center");
		this.add(acc,"South");
		
		setSize(600,700);
		// 화면 중앙에 배치하는 작업
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);	//  사용자에게 보여주기	
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new resList();
				setVisible(false);
			}
		});
		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("예약이 취소되었습니다.");
				new delete();
				setVisible(false);
			}
			
		});
	}	
	public static void main(String[] args) {
		allList frame = new allList();
	}
}
