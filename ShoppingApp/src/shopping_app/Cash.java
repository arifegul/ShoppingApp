package shopping_app;

public class Cash implements PaymentMethod {

    String custname;
    String custadr;
    String price;

	public String getprice() {
		return price;
	}
        
        public String getcustadr() {
		return custadr;
	}

	public String getcustname() {
		return custname;
	}


	public void Cash(String custname, String custadr, String price) {
	
		this.custname = custname;
                this.custadr = custadr;
		this.price = price;
	}

	@Override
	public boolean pay(double amount) {
		return true; 
	}
}
