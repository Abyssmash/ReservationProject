package service;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

// 회원가입창 
// 마지막 확인 시 예약 또는 조회 화면으로 넘어감
public class signUp extends JFrame{
	signUp(){
		super("회원가입");
		JPanel signUp = new JPanel();
		JButton accept = new JButton("확인");
		setSize(600, 800);
		accept.add(signUp);
		add(accept);
		
		// 화면 중앙에 배치하는 작업
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);	
		
		accept.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new resBus();
				setVisible(false);
			}
		});
	}
}
