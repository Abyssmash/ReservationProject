package service;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

// 월, 일, 출발지, 도착지 입력 후 시간 버튼 뜨게 만들기 (시간 버튼은 그리드 레이아웃)
// 출발지와 도착지는 텍스트로 입력하게 하기

public class dateHour extends JFrame {
	dateHour(){
		super("버스 예약 정보");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel year = new JLabel("2024년");
		//------------날짜 시작
		JLabel month = new JLabel("월");
		Integer[] arrMonth = new Integer[12];
		for(int i = 0; i < arrMonth.length; i++) {
			arrMonth[i] = i+1;
		}
		
		JComboBox<Integer> jcbmnt = new JComboBox<Integer>(arrMonth);
		
		JLabel date = new JLabel("일");
		Integer[] arrDate = new Integer[31];
		for(int i = 0; i < arrDate.length; i++) {
			arrDate[i] = i+1;
		}
		JComboBox<Integer> jcbdate = new JComboBox<Integer>(arrDate);
		//-----------날짜 끝
		
		//-----------출발지 도착지 시작
		JLabel departure = new JLabel("출발지");
		String[] dpt = {"서울","광주","대구","대전","부산","원주","전주"};
		JLabel destination = new JLabel("도착지");
		String[] dst = {"서울","광주","대구","대전","부산","원주","전주"};
		
		JComboBox dptCombo = new JComboBox(dpt);
		this.add(dptCombo);
		
		JComboBox dstCombo = new JComboBox(dst);
		this.add(dstCombo);
		
		this.setLocationRelativeTo(null);
		this.setSize(300, 300);
		this.setVisible(true);
		
		JButton input3 = new JButton("확인");
		
		// 화면 중앙에 배치하는 작업
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		
		// 그리드 버튼 중 1개라도 누르면 payBus 클래스로 넘어가게 설정
		
		input3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new payBus();
				setVisible(false);
			}
		});
			class service{
			public void main(String[] args) {
				new dateHour();
			}
		}
	}
}
