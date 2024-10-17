package service;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class busSeat extends JFrame {
	busSeat(){
		JFrame res = new JFrame();
		JPanel bus = new JPanel();
		JLabel driver = new JLabel("운전석");
		JLabel exit = new JLabel("출입구");
		GridLayout grid = new GridLayout(9,4,3,3);
		setLayout(grid);
		JButton[] Bus = new JButton[36];
		String [] seat = {"1","2","2-1","3","4","5","5-1","6","7","8","8-1","9","10","11","11-1",
				"12","13","14","14-1","15","16","17","17-1","18","19","20","20-1","21","22","23",
				"23-1","24","25","26","27","28"};
		setBackground(Color.gray);
		for(int i = 0; i < Bus.length; i++) {
			Bus[i]= new JButton(seat[i]);
			Bus[i].setName(""+(i+1));
			add(Bus[i]);
			if(Bus[i].getName().equals("2-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getName().equals("5-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getName().equals("8-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getName().equals("11-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getName().equals("14-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getName().equals("17-1")) {
				Bus[i].setVisible(false);
			}else if(Bus[i].getName().equals("20-1")){
				Bus[i].setVisible(false);
			}else if(Bus[i].getName().equals("23-1")) {
				Bus[i].setVisible(false);
			}
		}
		
		
		
		setSize(600,700);
		}	
	}



//public class busSeat{
//	public static void main(String[] args) {
//		busSeat frame = new busSeat();
//	}
//}