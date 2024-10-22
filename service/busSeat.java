package service;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.ItemSelectable;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class busSeat extends JFrame {
	
	busSeat(){
		super("버스 좌석 선택");
		// 운전석 출입구 문구가 위쪽 양쪽에 배치되게 설정하기
		GridLayout grid = new GridLayout(9,4,3,3);
		setLayout(grid);
		JButton[] Bus = new JButton[36];
		String [] seat = {"1","2","2-1","3","4","5","5-1","6","7","8","8-1","9","10","11","11-1",
				"12","13","14","14-1","15","16","17","17-1","18","19","20","20-1","21","22","23",
				"23-1","24","25","26","27","28"};
		setBackground(Color.cyan);
		
		for(int i = 0; i < Bus.length; i++) {
			Bus[i]= new JButton(seat[i]);
			Bus[i].setName(""+(i+1));
			add(Bus[i]);
			
			if(Bus[i].getActionCommand().equals("2-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getActionCommand().equals("5-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getActionCommand().equals("8-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getActionCommand().equals("11-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getActionCommand().equals("14-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getActionCommand().equals("17-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getActionCommand().equals("20-1")){
				Bus[i].setVisible(false);
			}else if(Bus[i].getActionCommand().equals("23-1")) {
				Bus[i].setVisible(false);
			}
			
//			b.addItemListener(new ItemListener() {
//				@Override
//				public void itemStateChanged(ItemEvent e) {
//					if(e.getStateChange()==ItemEvent.SELECTED)
//						b.setEnabled(false);
//					else
//						
//				}
//			});

			// 버튼을 하나라도 눌렀을때 창이 닫히고 결제하는 창이 나오게 하기
			Bus[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new notice();
					setVisible(false);
				}
			});
		}
		
		setSize(600,700);
		// 화면 중앙에 배치하는 작업
		Dimension frameSize = getSize();
		Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((windowSize.width - frameSize.width) / 2,
				(windowSize.height - frameSize.height) / 2);	
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				setVisible(true);				
	}
	// 확인용
	public static void main(String[] args) {
		busSeat frame = new busSeat();
	}
}