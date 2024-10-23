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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

// 월, 일, 출발지, 도착지 입력 후 시간 버튼 뜨게 만들기 (시간 버튼은 그리드 레이아웃)

public class dateHour extends JFrame {
	JPanel main1 = new JPanel();
	JPanel main2 = new JPanel();
	JPanel one = new JPanel();
	JPanel two = new JPanel();
	JPanel hour = new JPanel();
	JPanel thr = new JPanel();
	JLabel ser = new JLabel("버스 예약 정보를 선택해주세요. 2024년만 예약 가능합니다.");
	JLabel month = new JLabel("월");
	JLabel date = new JLabel("일");
	JLabel departure = new JLabel("출발지");
	JLabel destination = new JLabel("도착지");
	JButton input3 = new JButton("확인");
	ImageIcon img = new ImageIcon("Image/res.png");
	JLabel in = new JLabel(img, JLabel.CENTER);
	//"09:00","11:20","13:40","15:30","17:00","19:30"
	JButton h1 = new JButton("09:00");
	JButton h2 = new JButton("11:20");
	JButton h3 = new JButton("13:40");
	JButton h4 = new JButton("15:30");
	JButton h5 = new JButton("17:00");
	JButton h6 = new JButton("19:30");
	BorderLayout b = new BorderLayout();
	JLabel result = new JLabel();
	
	dateHour(){
		super("버스 예약 정보");
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
		// 패널에 버튼 추가
		
		
		//---------시간 버튼 
		// 시간대 09:00, 11:20, 13:40, 15:30, 17:00, 19:30
		// 행이 3 열이 2 가로세로 여백 3
		main1.setLayout(new BorderLayout());
		main1.add(one);
		main1.add(two);
		main2.setLayout(new BorderLayout());
		main2.add(hour);
		main2.add(thr);
		this.add(one,"North");
		this.add(two,"Center");
		this.add(hour,"South");
		this.add(thr,"South");
		//one.setLayout(new FlowLayout());
		one.add(ser,"North");
		one.add(in,"Center");
		//two.setLayout(new FlowLayout());
		two.add(jcbmnt);
		two.add(month);
		two.add(jcbdate);
		two.add(date);
		two.add(departure);
		two.add(dptCombo);
		two.add(destination);
		two.add(dstCombo);
		//hour.setLayout(new FlowLayout());
//		GridLayout H = new GridLayout(3,2,3,3);
//		JButton[] Hr = new JButton[6];
//		String[] hr = {"09:00","11:20","13:40","15:30","17:00","19:30"};
//		for(int i = 0; i < Hr.length; i++) {
//			Hr[i] = new JButton(hr[i]);
//			Hr[i].setName(hr[i]);
//			add(Hr[i]);
//		}
		hour.setLayout(new GridLayout(2,3));;
		hour.add(h1);
		hour.add(h2);
		hour.add(h3);
		hour.add(h4);
		hour.add(h5);
		hour.add(h6);
		//thr.setLayout(new BorderLayout());
		thr.add(input3,"North");
		
		this.setLocationRelativeTo(null);
		this.setSize(500, 700);
		this.setVisible(true);
		// 화면 중앙에 배치하는 작업
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	// X버튼 누르면 닫히게
		setVisible(true);
		
		// input3 버튼을 누르면 창이 꺼지고 busSeat 창이 나오게 설정
		
		input3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new busSeat();
				setVisible(false);
			}
		});
	}
		public static void main(String[] args) {
			dateHour frame = new dateHour();
		}
	}

