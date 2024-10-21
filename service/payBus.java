package service;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
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
	JPanel title = new JPanel();
	JPanel pay = new JPanel();
	JPanel acc = new JPanel();
	JLabel w = new JLabel("결제 정보");
	JLabel c = new JLabel("카드 선택");
	JLabel cNum = new JLabel("카드 번호");
	JLabel p = new JLabel("결제 금액");
	JButton ok = new JButton("확인");
	JLabel o = new JLabel("번호 16자리를 입력해주세요.");
	JTextField num = new JTextField(20);
	JTextField coin = new JTextField(20);
	ButtonGroup b = new ButtonGroup();
	JRadioButton m1 = new JRadioButton("초등학생");
	JRadioButton m2 = new JRadioButton("청소년");
	JRadioButton m3 = new JRadioButton("성인");
	JRadioButton m4 = new JRadioButton("보훈");
	JTextArea a = new JTextArea();

		payBus(){
			super("결제 정보");
			// 카드 선택
			String[] cardP = {"붕붕카드","레츠고카드","달려카드"};
			JComboBox cardPCom = new JComboBox(cardP);
			this.add(cardPCom);
			JRadioButton [] m = new JRadioButton[4];
			String[] money = {"10000" , "14000", "20000" ,"12000"};
			for(int i = 0; i < money.length; i++) {
				
			}
			this.add(title,"North");
			this.add(pay,"Center");
			this.add(acc,"South");
			title.add(w);
			pay.setLayout(new FlowLayout());
			b.add(m1);
			b.add(m2);
			b.add(m3);
			b.add(m4);
			pay.add(m1);
			pay.add(m2);
			pay.add(m3);
			pay.add(m4);
			pay.add(c);
			pay.add(cardPCom);
			pay.add(cNum);
			pay.add(o);
			pay.add(num);
			pay.add(p);
			pay.add(coin);
			acc.add(ok);

			
	class item implements ItemListener{
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					if(e.getItem()==m1)
				}
				}
				
			
			
			
			setSize(350,700);
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
			}
		// 확인용
		public static void main(String[] args) {
			payBus frame = new payBus();
		}
}
