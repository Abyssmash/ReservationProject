package service;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class notice extends JFrame{
	JPanel in = new JPanel();
	JPanel o = new JPanel();
	JLabel no = new JLabel("<html> 할인 승차권으로 승차 시 <br>반드시 할인의 기준이 되는 신분증을 지참해야하며, <br>부정승차시 해당 요금의 10배를 부과할 수 있습니다.</html>");
	JButton ok = new JButton("확인");
	
	notice(){
		this.add(in,"Center");
		this.add(o,"South");
		in.add(no);
		o.add(ok);
		
		
		
		
		setSize(400,300);	
		// 화면 중앙에 배치하는 작업
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
			(windowSize.height - frameSize.height) / 2);	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	// X버튼 누르면 닫히게
			setVisible(true);
			
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new payBus();
				setVisible(false);
			}
			
		});
	}
	public static void main(String[] args) {
		notice frame = new notice();
	}
}
