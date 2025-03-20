package OOPs;

public class DematAccount extends BankAccount{

	private int stockHoldings;
	public DematAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DematAccount(String name, String accNum, double amt, int stocks) {
		super(name, accNum, amt);
		this.stockHoldings=stocks;
	}
	//buy stocks
	public void buyStocks(int quantity, double pricePerStock) {
		double totalCost=quantity*pricePerStock;
		if(getBalance()>=totalCost) {
			setBalance(getBalance()-totalCost);
			stockHoldings+=quantity;
		}
		else {
			System.out.println("Insufficient balance to buy stocks.");
		}
	}
	public void sellStocks(int quantity, double pricePerStock) {
		double totalCost=quantity*pricePerStock;
		if(stockHoldings<quantity) {
			System.out.println("Insufficient stocks.");
		}
		else {
			setBalance(getBalance()+totalCost);
			stockHoldings-=quantity;
		}
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Stock Holdings: "+stockHoldings );
	}
	
	

}
