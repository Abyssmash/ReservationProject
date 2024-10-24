package service;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class delete extends JFrame{
	JPanel o = new JPanel();
	JLabel in = new JLabel(" 예약이 취소되었습니다. 메뉴 화면으로 돌아갑니다.<br>결제하신 카드사의 영업일에 따라 환불은 영업일 기준 3~5일 소요됩니다.");
	JButton ok = new JButton("확인");
	
	delete(){
		super("예약 취소 완료");
		this.setLayout(new BorderLayout());
		add(in,BorderLayout.CENTER);
		add(ok,BorderLayout.SOUTH);
		
		
		setSize(300,200);
		// 화면 중앙에 배치하는 작업
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.width) / 2);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new resList();
				setVisible(false);
			}
		});
	}
}
