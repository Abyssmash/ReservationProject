package service;

import service.resBus;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
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
	
	private JPanel title = new JPanel();
	private JLabel F = new JLabel("로그인");
	
	logIn(){
		super("로그인");
		title.add(F);
		add("North",F);
		JPanel logIn = new JPanel();
		JButton ok = new JButton("확인");
		JTextField i = new JTextField(20);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 윈도우 종료
		logIn.add(logIn);
		add(logIn);
		
		Container L = getContentPane();
		L.setLayout(new BorderLayout());
		
		this.add(L,"Center");
		this.add(ok,"North");
		
		L.add(new JLabel("ID"));
		L.add(new JTextField(20));
		L.add(new JLabel("PWD"));
		L.add(new JTextField(20));
		
		
		setSize(600, 800);
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
				new resBus();
				setVisible(false);	// 사용자에게 가리기
			}
		});
		
	}
}
