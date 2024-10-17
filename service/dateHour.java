package service;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

// 월, 일, 출발지, 도착지 입력 후 시간 버튼 뜨게 만들기 (시간 버튼은 그리드 레이아웃)

public class dateHour extends JFrame {
	JFrame DH = new JFrame();
	JPanel dH = new JPanel();
	JLabel year = new JLabel("2024년");
	JLabel month = new JLabel("월");
	JLabel date = new JLabel("일");
	JLabel departure = new JLabel("출발지");
	JLabel destination = new JLabel("도착지");
	JButton input3 = new JButton("확인");
	
	dateHour(){
		super("버스 예약 정보");
		Container sup = DH.getContentPane();
		sup.add(year, BorderLayout.NORTH);
		// 패널에 버튼 추가
		this.setLayout(new FlowLayout());
		
		//------------날짜 시작
		Integer[] arrMonth = new Integer[12];
		for(int i = 0; i < arrMonth.length; i++) {
			arrMonth[i] = i+1;
		}
		
		JComboBox<Integer> jcbmnt = new JComboBox<Integer>(arrMonth);
		
		Integer[] arrDate = new Integer[31];
		for(int i = 0; i < arrDate.length; i++) {
			arrDate[i] = i+1;
		}
		JComboBox<Integer> jcbdate = new JComboBox<Integer>(arrDate);
		//-----------날짜 끝
		
		//-----------출발지 도착지 시작
		String[] dpt = {"서울","광주","대구","대전","부산","원주","전주"};
		String[] dst = {"서울","광주","대구","대전","부산","원주","전주"};
		
		JComboBox dptCombo = new JComboBox(dpt);
		this.add(dptCombo);
		
		JComboBox dstCombo = new JComboBox(dst);
		this.add(dstCombo);
		//----------출발지 도착지 끝
		
		//---------시간 버튼 
		// 시간대 09:00, 11:20, 13:40, 15:30, 17:00, 19:30
		// 행이 3 열이 2 가로세로 여백 3
		GridLayout hour = new GridLayout(3,2,3,3);
		setLayout(hour);
		JButton[] Hr = new JButton[6];
		String[] hr = {"09:00","11:20","13:40","15:30","17:00","19:30"};
		for(int i = 0; i < Hr.length; i++) {
			Hr[i] = new JButton(hr[i]);
			Hr[i].setName(hr[i]);
			add(Hr[i]);
		}
		
		this.setLocationRelativeTo(null);
		this.setSize(600, 700);
		this.setVisible(true);
		
		// 화면 중앙에 배치하는 작업
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	// X버튼 누르면 닫히게
		setVisible(true);
		
		// input3 버튼을 누르면 창이 꺼지고 paybus 창이 나오게 설정
		
		input3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new payBus();
				setVisible(false);
			}
		});
	}
		public static void main(String[] args) {
			dateHour frame = new dateHour();
		}
	}

