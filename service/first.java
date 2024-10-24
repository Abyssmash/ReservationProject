package service;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.accessibility.AccessibleContext;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.plaf.PanelUI;

// 처음 열자마자 보이는 화면 
// 버스 예약 시스템이라는 문구와 로그인 혹은 회원가입 버튼
public class first extends JFrame {
	
	first() {
		super("버스 예약 시스템");
		JPanel title = new JPanel();
		JButton logIn = new JButton("로그인");
		JButton signUp = new JButton("회원가입");
		JPanel chang1 = new JPanel();
		ImageIcon icon = new ImageIcon("Image/first.png");
		JLabel img = new JLabel(icon, JLabel.CENTER);
		
		title.setLayout(new BorderLayout());
		title.add(img);
		chang1.setBackground(Color.LIGHT_GRAY);
		chang1.add(logIn);
		chang1.add(signUp);
		this.add(title,"Center");
		this.add(chang1,"South");
		
		setSize(600, 500);
		setLocation(500,100);
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
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
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		]
//	}
	public static void main(String[] args) {
		first frame = new first();
	}
}
