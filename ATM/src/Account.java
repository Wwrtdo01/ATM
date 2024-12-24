
public class Account {
	private int number;
	private String name;
	private double balance;
	private int numViewBalance=0;
	private int numDeposits=0;
	private int numWithdraws=0;
	private int numTransfers=0;
	private double totalInAccount=0;
	private double totalOutAccount=0;
	public double TotalCharges=0;
	public int TotalViewBalance;
	public int TotalDeposits=0;
	public int TotalWithdraws=0;
	public int TotalTransfers=0;
	
	public Account(int number, String name, double balance) {
		this.number=number;
		this.name=name;
		this.balance=balance;
		TotalViewBalance=0;
		TotalViewBalance+=numViewBalance;
		
	}
	private boolean isAvaliable (double amount) { 
		if(amount<=0) {
		return false;
	        }
	
	double feeWi=0.01*amount;
	double feeTr=0.025*amount;
	if(balance>=(amount+feeWi)||balance>=(amount+feeTr)) {
		return true;
	}
	else {
		return false;
	}
	}
	/*public boolean getisAvaliable(double amount) {
			if(amount<=0) {
				return false;
			}
			
			double feeWi=0.01*amount;
			double feeTr=0.025*amount;
			if(balance>=(amount+feeWi)||balance>=(amount+feeTr)) {
				return true;
			}
			else {
				return false;
			}
	}*/
	public boolean deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			numDeposits++;
			//TotalDeposits=0;// will check it later.
			TotalDeposits+=numDeposits;
			totalInAccount+=amount;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean withdraw(double amount) {
		if(isAvaliable(amount)) {
		double feeAm=0.01*amount; 
		balance=balance-amount-feeAm;
		TotalCharges+=feeAm;
		numWithdraws++;
		//TotalWithdraws=0;
		TotalWithdraws+=numWithdraws;
		totalOutAccount+=amount+feeAm;
		return true;
		}
		else {
			return false;
		}
	}
	public boolean transfer(Account obj, double amount) {
		if(isAvaliable(amount)) {
		String op="";
		// I will come back to it.
		double feeAm=0.025*amount;
		balance=balance-amount-feeAm;//from acc.
		obj.balance +=amount;
		totalOutAccount+=amount+feeAm;
		TotalCharges+=feeAm;
		numTransfers++;
		//TotalTransfers=0;
		TotalTransfers+=numTransfers;
		obj.totalInAccount=amount;
		return true;
		}
		else {
			return false;
		}
	}
	public void displayBalance() {
		System.out.println(" ");
		System.out.println("Account Info:>");
		System.out.println("number: "+number+" \tname:"+name+"\tbalance:"+balance);
		System.out.println(" ");
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		numViewBalance++;
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getNumViewBalance() {
		return numViewBalance;
	}
	public void setNumViewBalance(int numViewBalance) {
		this.numViewBalance = numViewBalance;
	}
	public int getNumDeposits() {
		return numDeposits;
	}
	public void setNumDeposits(int numDeposits) {
		this.numDeposits = numDeposits;
	}
	public int getNumWithdraws() {
		return numWithdraws;
	}
	public void setNumWithdraws(int numWithdraws) {
		this.numWithdraws = numWithdraws;
	}
	public int getNumTransfers() {
		return numTransfers;
	}
	public void setNumTransfers(int numTransfers) {
		this.numTransfers = numTransfers;
	}
	public double getTotalInAccount() {
		return totalInAccount;
	}
	public void setTotalInAccount(double totalInAccount) {
		this.totalInAccount = totalInAccount;
	}
	public double getTotalOutAccount() {
		return totalOutAccount;
	}
	public void setTotalOutAccount(double totalOutAccount) {
		this.totalOutAccount = totalOutAccount;
	}
	public void displayStatistics() {
		System.out.println("The number of  view balance: "  + numViewBalance+  "  deposits:  " +numDeposits+   "    withdraws: "  +numWithdraws+ "    transfers: "  +numTransfers);  
		System.out.println(" totalInAccount: " + totalInAccount+  "   totalOutAccount:  " +totalOutAccount);   
	}
	public void reset() {
		numViewBalance=0;numDeposits=0;numWithdraws=0;numTransfers=0;
		totalInAccount=0;totalOutAccount=0;TotalCharges=0;
		TotalViewBalance=0;TotalDeposits=0;TotalWithdraws=0;
		TotalTransfers=0;
	}
	
	

}
