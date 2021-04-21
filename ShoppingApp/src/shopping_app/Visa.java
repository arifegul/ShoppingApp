package shopping_app;
    
import java.util.Date;

public class Visa implements PaymentMethod {

	String cardname;
	String cardNumber;
        String price;
        String cvv;
	Date finish;

	public String getName() {
		return cardname;
	}

	public String getCardNumber() {
		return cardNumber;
	}
        
        public String getprice() {
		return price;
	}
        
        public String getcvv() {
		return cvv;
	}

	public Date getfinish() {
		return finish;
	}

	public void Visa(String cardname, String cardNumber, String price, String cvv, Date finish) {
		this.cardname = cardname;
		this.cardNumber = cardNumber;
                this.price = cardNumber;
                this.cvv = cvv;
		this.finish = finish;
	}

	@Override
	public boolean pay(double amount) {
		return true; 
	}
}
