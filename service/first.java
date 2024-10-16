package service;

import service.logIn;
import service.signUp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

// 처음 열자마자 보이는 화면 
// 버스 예약 시스템이라는 문구와 로그인 혹은 회원가입 버튼
public class first extends JFrame{
	
	private JPanel title = new JPanel();
	private JLabel F = new JLabel("버스 예약 조회 프로그램");
	
	public first() {
		title.add(F);
		JPanel chang1 = new JPanel();
		JButton logIn = new JButton("로그인");
		JButton signUp = new JButton("회원가입");
		setSize(600, 800);
		chang1.add(logIn);
		add(chang1);
		chang1.add(signUp);
		add(chang1);
		
		// 화면 중앙에 배치하는 작업
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		
		logIn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new logIn();
				setVisible(false);	
			}
			
		});
		
		signUp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new signUp();
				setVisible(false);
			}
			
		});
				
	}
}
