package service;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

// 신분과 카드 번호를 입력하고 확인을 누르면
// 결제되었다는 메시지와 함께 예약됨.
public class payBus extends JFrame {
	

		payBus(){
			super("결제 정보");
			// 카드 선택
			String[] cardP = {"붕붕카드","레츠고카드","달려카드"};
			JComboBox cardPCom = new JComboBox(cardP);
			this.add(cardPCom);
			
			JPanel main1 = new JPanel();
			JPanel main2 = new JPanel();
			JPanel sub1 = new JPanel();
			JPanel sub2 = new JPanel();
			JPanel sub3 = new JPanel();
			JPanel sub4 = new JPanel();
			JPanel sub5 = new JPanel();
			JPanel sub6 = new JPanel();
			JLabel info = new JLabel("결제 정보");
			JLabel card = new JLabel("카드 선택");
			JLabel cNum = new JLabel("카드 번호");
			JLabel o = new JLabel("* 카드번호 16자리를 '-'없이 입력해주세요. *");
			JLabel pay = new JLabel("결제 금액");
			JTextField num = new JTextField(20);
			JButton ok = new JButton("확인");
			JTextField ch = new JTextField("30,000");
			JLabel won = new JLabel("원");
			ImageIcon img = new ImageIcon("Image/payBus.png");
			JLabel pic = new JLabel(img, JLabel.CENTER);
			
			sub1.add(pic);
			sub2.add(info);
			sub3.add(card);
			sub3.add(cardPCom);
			sub4.add(cNum);
			sub4.add(num);
			sub4.add(o);
			sub5.add(pay);
			sub5.add(ch);
			sub5.add(won);
			sub6.add(ok);
			
				
			
			this.add(main1,BorderLayout.CENTER);
			this.add(main2,BorderLayout.SOUTH);
			main1.setLayout(new BoxLayout(main1, BoxLayout.Y_AXIS));
			main1.add(sub1);
			main1.add(sub2);
			main1.add(sub3);
			main1.add(sub4);
			main2.setLayout(new BoxLayout(main2, BoxLayout.Y_AXIS));
			main2.add(sub5);
			main2.add(sub6);
			
			setSize(600,700);
			// 화면 중앙에 배치하는 작업
			Dimension frameSize = getSize();
			Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((windowSize.width - frameSize.width) / 2,
					(windowSize.height - frameSize.height) / 2);	
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
					setVisible(true);
			
					
			ok.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new payOk();
					setVisible(false);
				}
				
			});
	}
		// 확인용
		public static void main(String[] args) {
			payBus frame = new payBus();
		}
}
