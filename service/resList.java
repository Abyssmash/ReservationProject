package service;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

// 예약 또는 조회 서비스
// 회원가입 시 사용 가능 혹은 로그인 시 사용 가능
public class resList extends JFrame {
	
	resList(){
		super("예약 및 조회 서비스");
		JPanel resList = new JPanel();
		JButton res = new JButton("예약");
		JButton list = new JButton("조회");
		setSize(600,700);
		resList.add(res);
		resList.add(list);
		add(resList);
		
		// 화면 중앙에 배치하는 작업
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setVisible(true);	
		
		// 예약 선택 시 예약 화면으로 이동하고 현재 창은 종료
		res.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new dateHour();
				setVisible(false);	
			}	
		});
		// 조회 선택 시 조회 화면으로 이동하고 현재 창은 종료
		list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new allList();
				setVisible(false);
			}
		});
	}
}
