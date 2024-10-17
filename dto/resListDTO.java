package dto;

import dto.resBusDTO;

public class resListDTO extends resBusDTO{
		private String cardNum = null;
		private String receipt = null;
		public String getCardNum() {
			return cardNum;
		}
		public void setCardNum(String cardNum) {
			this.cardNum = cardNum;
		}
		public String getReceipt() {
			return receipt;
		}
		public void setReceipt(String receipt) {
			this.receipt = receipt;
		}
	}

