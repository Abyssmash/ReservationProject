package service;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 신분과 카드 번호를 입력하고 확인을 누르면
// 결제되었다는 메시지와 함께 예약됨.
public class payBus extends JFrame {
	JPanel pay = new JPanel();
	JLabel w = new JLabel("결제 정보");
	JLabel c = new JLabel("카드 선택");
	JLabel cNum = new JLabel("카드 번호");
	JLabel p = new JLabel("결제 금액");
	JButton ok = new JButton("확인");
	
		payBus(){
			super("결제 정보");
			// 카드 선택
			String[] cardP = {"붕붕카드","레츠고카드","달려카드"};
			JComboBox cardPCom = new JComboBox(cardP);
			this.add(cardPCom);
	}
		public static void main(String[] args) {
			payBus frame = new payBus();
		}
}
