package service;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

// 조회 버튼을 누르면 나오는 class
// 로그인한 아이디로 예약한 모든 내역을 보여준다. (날짜, 시간, 버스 좌석, 결제 내역)
// 예약하지 않았을 때는 예약한 내역이 없다는 문구가 나오고 resList 화면으로 넘어감
public class allList extends JFrame {
	allList(){
		super("조회 목록");
		JLabel info = new JLabel("조회 목록");
		JTextArea userID = new JTextArea();
		JTextArea resNum = new JTextArea();
		JTextArea seatNum = new JTextArea();
		JTextArea date = new JTextArea();
		JTextArea hour = new JTextArea();
		JTextArea departure = new JTextArea();
		JTextArea destination = new JTextArea();
		JTextArea cardNum = new JTextArea();
		JTextArea receipt = new JTextArea();
		JButton ok = new JButton("확인");
		// 예약 취소는 시간 되면 하기....
		
		// 모든 텍스트 area에 DB에 저장된 정보 가져오기
		// 라벨 + 텍스트 박스 형식으로 가운데 배치
		// 맨 아래에 확인 버튼이 오게 만들기
		
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
	}
}
