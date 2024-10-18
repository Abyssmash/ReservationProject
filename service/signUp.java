package service;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
	JPanel title = new JPanel();
	JPanel signUp = new JPanel();
	JPanel ok = new JPanel();
	JLabel t = new JLabel("회원가입");
	JLabel userId = new JLabel("아이디");
	JLabel userPwd = new JLabel("비밀번호");
	JLabel userName = new JLabel("이름");
	JLabel userBirth = new JLabel("생년월일");
	JLabel userEmail = new JLabel("이메일주소");
	JLabel userPnum = new JLabel("전화번호");
	JTextField id = new JTextField(20);
	JTextField pwd = new JTextField(20);
	JTextField name = new JTextField(20);
	JTextField birth = new JTextField(20);
	JTextField email = new JTextField(20);
	JTextField pnum = new JTextField(20);
	JCheckBox gender1 = new JCheckBox("여자");
	JCheckBox gender2 = new JCheckBox("남자");
	JButton accept = new JButton("확인");
	
	signUp(){
		super("회원가입");
		this.add(title,"North");
		this.add(signUp,"Center");
		this.add(ok,"South");
		title.setLayout(new FlowLayout());
		title.add(t);
		title.setBackground(Color.lightGray);
		signUp.setLayout(new FlowLayout());
		signUp.add(userId);
		signUp.add(id);
		signUp.add(userPwd);
		signUp.add(pwd);
		signUp.add(userName);
		signUp.add(name);
		signUp.add(userBirth);
		signUp.add(birth);
		signUp.add(userEmail);
		signUp.add(email);
		signUp.add(userPnum);
		signUp.add(pnum);
		signUp.add(gender1);
		signUp.add(gender2);
		ok.add(accept);
		
		
		setSize(250, 450);
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
				new resList();
				setVisible(false);
			}
		});
	}
	public static void main(String[] args) {
		signUp frame = new signUp();
	}
}
