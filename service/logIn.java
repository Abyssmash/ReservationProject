package service;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

// 로그인 입력 후 회원 예약 또는 조회 서비스 이용 가능
public class logIn extends JFrame{
	
	JPanel title = new JPanel();
	JLabel F = new JLabel("로그인");
	JPanel logIn = new JPanel();
	JButton ok = new JButton("확인");
	JLabel ID= new JLabel("ID");
	JLabel PWD = new JLabel("PASSWORD");
	JTextField id = new JTextField(20);
	JTextField pwd = new JTextField(20);
	JPanel o = new JPanel();
	
	logIn(){
		super("로그인");
		this.add(title,"North");
		this.add(logIn,"Center");
		title.setLayout(new FlowLayout());
		title.add(F,"North");
		title.setBackground(Color.lightGray);
		logIn.setLayout(new FlowLayout());
		logIn.add(ID);
		logIn.add(id);
		logIn.add(PWD);
		logIn.add(pwd);
		this.add(o,"South");
		o.add(ok);
		
		
		setSize(330, 200);
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
				setVisible(false);	// 사용자에게 가리기
			}
		});
	}
	public static void main(String[] args) {
		logIn frame = new logIn();
	}
	
//	@Override
//                       	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
}
