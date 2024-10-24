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

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

// 월, 일, 출발지, 도착지 입력 후 시간 버튼 뜨게 만들기 (시간 버튼은 그리드 레이아웃)

public class dateHour extends JFrame {
	
	
	dateHour(){
		super("버스 예약 정보");
		//------------날짜 시작
		Integer[] arrMonth = new Integer[12];
		for(int i = 0; i < arrMonth.length; i++) {
			arrMonth[i] = i+1;
		}
		
		JComboBox<Integer> mon = new JComboBox<Integer>(arrMonth);
		
		Integer[] arrDate = new Integer[31];
		for(int i = 0; i < arrDate.length; i++) {
			arrDate[i] = i+1;
		}
		JComboBox<Integer> day = new JComboBox<Integer>(arrDate);
		//-----------날짜 끝
		
		//-----------출발지 도착지 시작
		String[] dpt = {"서울","광주","대구","대전","부산","원주","전주"};
		String[] dst = {"서울","광주","대구","대전","부산","원주","전주"};
		
		JComboBox dep = new JComboBox(dpt);
		this.add(dep);
		
		JComboBox des = new JComboBox(dst);
		this.add(des);
		//----------출발지 도착지 끝
		// 패널에 버튼 추가
		JPanel main1 = new JPanel();
		JPanel main2 = new JPanel();
		JPanel sub1 = new JPanel();
		JPanel sub2 = new JPanel();
		JPanel sub3 = new JPanel();
		JPanel sub4 = new JPanel();
		JPanel sub5 = new JPanel();
		JLabel title = new JLabel("버스 예약 정보를 선택해주세요. 2024년만 예약 가능합니다.");
		JLabel month = new JLabel("월");
		JLabel date = new JLabel("일");
		JLabel departure = new JLabel("출발지");
		JLabel destination = new JLabel("도착지");
		JButton ok = new JButton("확인");
		ImageIcon img = new ImageIcon("Image/res.png");
		JLabel pic = new JLabel(img, JLabel.CENTER);
		//"09:00","11:20","13:40","15:30","17:00","19:30"
		JButton h1 = new JButton("09:00");
		JButton h2 = new JButton("11:20");
		JButton h3 = new JButton("13:40");
		JButton h4 = new JButton("15:30");
		JButton h5 = new JButton("17:00");
		JButton h6 = new JButton("19:30");
		
		sub1.add(title);
		sub2.add(pic);
		sub3.add(mon);
		sub3.add(month);
		sub3.add(day);
		sub3.add(date);
		sub3.add(departure);
		sub3.add(dep);
		sub3.add(destination);
		sub3.add(des);
		sub4.add(h1);
		sub4.add(h2);
		sub4.add(h3);
		sub4.add(h4);
		sub4.add(h5);
		sub4.add(h6);
		sub5.add(ok);
		
		this.add(main1, BorderLayout.CENTER);
		this.add(main2, BorderLayout.SOUTH);
		main1.setLayout(new BoxLayout(main1, BoxLayout.Y_AXIS));
		main1.add(sub1);
		main1.add(sub2);
		main1.add(sub3);
		main2.setLayout(new BoxLayout(main2, BoxLayout.Y_AXIS));
		main2.add(sub4);
		main2.add(sub5);
		//---------시간 버튼 
		// 시간대 09:00, 11:20, 13:40, 15:30, 17:00, 19:30
		// 행이 3 열이 2 가로세로 여백 3
		
		this.setSize(600, 700);
		this.setVisible(true);
		// 화면 중앙에 배치하는 작업
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	// X버튼 누르면 닫히게
		setVisible(true);
		
		// input3 버튼을 누르면 창이 꺼지고 busSeat 창이 나오게 설정
		
		ok.addActionListener(new ActionListener() {
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

