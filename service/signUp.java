package service;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

// 회원가입창 
// 마지막 확인 시 예약 또는 조회 화면으로 넘어감
public class signUp extends JFrame{
	signUp(){
		super("회원가입");
		JPanel signUp = new JPanel();
		JButton accept = new JButton("확인");
		JLabel userId = new JLabel("아이디");
		JLabel userPwd = new JLabel("비밀번호");
		JLabel userName = new JLabel("이름");
		JLabel userBirth = new JLabel("생년월일");
		JLabel userEmail = new JLabel("이메일주소");
		JLabel userPnum = new JLabel("전화번호");
		JTextField id = new JTextField();
		JTextField pwd = new JTextField();
		JTextField name = new JTextField();
		JTextField birth = new JTextField();
		JTextField email = new JTextField();
		JTextField pnum = new JTextField();
		JCheckBox gender1 = new JCheckBox("여자");
		JCheckBox gender2 = new JCheckBox("남자");
		
		setSize(600, 700);
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
