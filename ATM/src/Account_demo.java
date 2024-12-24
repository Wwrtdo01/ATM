// St.N: Ahmed Khalid Alghamdi. id: 445102252. D. Bander Alfayyadh. :Thurs,10-12
import java.util.*;
public class Account_demo {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
	
		System.out.println("***********************************");
		System.out.println("*    Welcome to AHMED ATM !       *" );
		System.out.println("*                                 *");
		System.out.println("***********************************");
		System.out.println("");
		Account A1 = new Account(11111111,"Ahmed",5000);
		Account A2 = new Account(4459668,"Khalid",10000);
		Account A3 = new Account(22943107,"Saleh",7500);
		int Max=0;// at admin to calculate the most pop op.
		
		String op=" ";
		double amount=0;
		while(!op.equalsIgnoreCase("exit")) {
		System.out.println("Please Choose one of the following : ");
		System.out.println(" ");
		System.out.println("login using the (Account) => ");
		System.out.println("or..");
		System.out.println("login as an (admin) =>");
		System.out.println(" ");
		System.out.print("Enter your option: ");
		op=kb.next();
		while (op.equalsIgnoreCase("account")){
			System.out.println(" ");
			System.out.println("1)");
			A1.displayBalance();
			System.out.println("2)");
			A2.displayBalance();
			System.out.println("3)");
			A3.displayBalance();
			System.out.println("Enter your account :> 1 , 2 or 3 :> ");
				op = kb.next();
				if(op.equals("1"))// means account 1 : Ahmed. 
					{ A1.reset();// to reset when he come to account second time, and the below all the same.
					while(!op.equalsIgnoreCase("no")) {
						System.out.println("1) View Balance => ");
						System.out.println("2) Deposit Money =>");
						System.out.println("3) Withdraw Money =>");
						System.out.println("4) Transfer Money => ");
						System.out.print("Choose 1, 2, 3, 4 or (no : return) >: ");
						op = kb.next();
						if(op.equals("1"))// view B
							{
							System.out.println(" ");
							System.out.println("Your balance:> "+A1.getBalance());
							System.out.println(" ");
						}
						else if(op.equals("2"))// D
							{
							System.out.println("How much money do you want to add?");
							System.out.println(" ");
							System.out.print("Enter the amount :>");
							 amount = kb.nextDouble();
							if(A1.deposit(amount)) {
								System.out.println("Successful deposit!");
							}
							else {
								System.out.println(" ");
								System.out.println("invalid amount!");
								System.out.println(" ");
							}
						}
						else if(op.equals("3")){// W
							System.out.println("How much money do you want to withdraw?");
							System.out.println(" ");
							System.out.print("Enter the amount :>");
							 amount = kb.nextDouble();
							 if(A1.withdraw(amount)) {
									System.out.println("Successful withdraw!");
									//A1.withdraw(amount);
							 }
							 else {
								 System.out.println(" ");
									System.out.println("invalid input! / There is no enough money!");
									System.out.println(" ");
							 }
						}
						else if(op.equals("4")) {//T
							System.out.print("Enter amount: ");
							amount=kb.nextDouble();
							System.out.print("To_Account:> A2 or A3 ");
							op=kb.next();
							if(op.equalsIgnoreCase("A2")&&A1.transfer(A2, amount)||op.equalsIgnoreCase("A3")&&A1.transfer(A3, amount)) {
								System.out.println(" ");
								System.out.println("Successful Transfer!");
								System.out.println(" ");
							}
							else {
								System.out.println(" ");
							System.out.println("invalid input! / There is no enough money!");
							System.out.println(" ");
						         }
						}
						System.out.println("Do you want anothor perform? (yes or no):");
						op = kb.next();
						if(op.equalsIgnoreCase("no")) {
							System.out.println("**********************");
							System.out.println("Transactions summary!");
							System.out.println("**********************");
							System.out.println(" ");
							A1.displayStatistics();
							System.out.println(" ");
						}
							
					}
				}
				// else if Account 2 .
				if(op.equals("2")){A2.reset();    // means account 2 : khalid.
				while(!op.equalsIgnoreCase("no")) {
					System.out.println("1) View Balance => ");
					System.out.println("2) Deposit Money =>");
					System.out.println("3) Withdraw Money =>");
					System.out.println("4) Transfer Money => ");
					System.out.print("Choose 1, 2, 3, 4 or (no : return) >: ");
					op = kb.next();
					if(op.equals("1"))// view B
						{
						System.out.println(" ");
						System.out.println("Your balance:> "+A2.getBalance());
						System.out.println(" ");
					}
					else if(op.equals("2"))// D
						{
						System.out.println("How much money do you want to add?");
						System.out.println(" ");
						System.out.print("Enter the amount :>");
						 amount = kb.nextDouble();
						if(A2.deposit(amount)) {
							System.out.println("Successful deposit!");
						}
						else {
							System.out.println(" ");
							System.out.println("invalid amount!");
							System.out.println(" ");
						}
					}
					else if(op.equals("3")){// W
						System.out.println("How much money do you want to withdraw?");
						System.out.println(" ");
						System.out.print("Enter the amount :>");
						 amount = kb.nextDouble();
						 if(A2.withdraw(amount)) {
								System.out.println("Successful withdraw!");
								//A2.withdraw(amount);
						 }
						 else {
							 System.out.println(" ");
								System.out.println("invalid input! / There is no enough money!");
								System.out.println(" ");
						 }
					}
					else if(op.equals("4")) {//T
						System.out.print("Enter amount: ");
						amount=kb.nextDouble();
						System.out.print("To_Account:> A1 or A3 ");
						op=kb.next();
						if(op.equalsIgnoreCase("A1")&&A2.transfer(A1, amount)||op.equalsIgnoreCase("A3")&&A2.transfer(A3, amount)) {
							System.out.println(" ");
							System.out.println("Successful Transfer!");
							System.out.println(" ");
						}
						else {
							System.out.println(" ");
						System.out.println("invalid input! / There is no enough money!");
						System.out.println(" ");
					         }
					}
					if(op.equalsIgnoreCase("no")) {
						System.out.println("**********************");
						System.out.println("Transactions summary!");
						System.out.println("**********************");
						System.out.println(" ");
						A2.displayStatistics();
						System.out.println(" ");
					}
				}
				}
				// A3: Saleh.
				if(op.equals("3")) {A3.reset();
				while(!op.equalsIgnoreCase("no")) {
					System.out.println("1) View Balance => ");
					System.out.println("2) Deposit Money =>");
					System.out.println("3) Withdraw Money =>");
					System.out.println("4) Transfer Money => ");
					System.out.print("Choose 1, 2, 3, 4 or (no : return) >: ");
					op = kb.next();
					if(op.equals("1"))// view B
						{
						System.out.println(" ");
						System.out.println("Your balance:> "+A3.getBalance());
						System.out.println(" ");
					}
					else if(op.equals("2"))// D
						{
						System.out.println("How much money do you want to add?");
						System.out.println(" ");
						System.out.print("Enter the amount :>");
						 amount = kb.nextDouble();
						if(A3.deposit(amount)) {
							System.out.println("Successful deposit!");
						}
						else {
							System.out.println(" ");
							System.out.println("invalid amount!");
							System.out.println(" ");
						}
					}
					else if(op.equals("3")){// W
						System.out.println("How much money do you want to withdraw?");
						System.out.println(" ");
						System.out.print("Enter the amount :>");
						 amount = kb.nextDouble();
						 if(A3.withdraw(amount)) {
								System.out.println("Successful withdraw!");
						 }
						 else {
							 System.out.println(" ");
								System.out.println("invalid input! / There is no enough money!");
								System.out.println(" ");
						 }
					}
					else if(op.equals("4")) {//T
						System.out.print("Enter amount: ");
						amount=kb.nextDouble();
						System.out.print("To_Account:> A1 or A2 ");
						op=kb.next();
						if(op.equalsIgnoreCase("A1")&&A3.transfer(A1, amount)||op.equalsIgnoreCase("A2")&&A3.transfer(A2, amount)) {
							System.out.println(" ");
							System.out.println("Successful Transfer!");
							System.out.println(" ");
						}
						else {
							System.out.println(" ");
						System.out.println("invalid input! / There is no enough money!");
						System.out.println(" ");
					         }
					}
					if(op.equalsIgnoreCase("no")) {
						System.out.println("**********************");
						System.out.println("Transactions summary!");
						System.out.println("**********************");
						System.out.println(" ");
						A3.displayStatistics();
						System.out.println(" ");
					}
				}
		}
				
				}// end while Account.
		while (op.equalsIgnoreCase("admin")) {
			System.out.println(" ");
			while(!op.equalsIgnoreCase("C")) {
			System.out.println("A) View total profit:> ");
			System.out.println("B) Most popular operation:> ");
			System.out.println("C) Exit:> ");
			System.out.println("Enter your option (A ,B or C): ");
			op = kb.next();
			if(op.equalsIgnoreCase("A")) {

				System.out.println("The all amount gaind from withdraw and transfares... :"+(A1.TotalCharges+A2.TotalCharges+A3.TotalCharges));
				System.out.println(" ");
			}
			
			else if(op.equalsIgnoreCase("B")) {
				int TotalViewBalance=(A1.getNumViewBalance()+A2.getNumViewBalance()+A3.getNumViewBalance());
				int TotalDeposits=(A1.getNumDeposits()+A2.getNumDeposits()+A3.getNumDeposits());
				int TotalWithdraws=(A1.getNumWithdraws()+A2.getNumWithdraws()+A3.getNumWithdraws());
				int TotalTransfers=(A1.getNumTransfers()+A2.getNumTransfers()+A3.getNumTransfers());
				Max=Math.max(Math.max(TotalViewBalance, TotalDeposits),Math.max(TotalWithdraws, TotalTransfers));
				System.out.println("The number of times:> "+Max);
				if(Max==0) {
					System.out.println("There is no any operation!");
				}
				if(Max==TotalViewBalance&&Max!=0) {
					System.out.println("The most popular operation is :> (view balance)");
				}
				if(Max==TotalDeposits&&Max!=0) {
					System.out.println("The most popular operation is :> (deposit)");
				}
				if(Max==TotalWithdraws&&Max!=0) {
					System.out.println("The most popular operation is :> (withdraw)");
				}
				if(Max==TotalTransfers&&Max!=0) {
					System.out.println("The most popular operation is :> (transfere)");
				}
				System.out.println(" ");
				A1.reset();// to reset the the all counters if he come to admin directly without passing through the accounts.
				A2.reset();// the same up
				A3.reset();// the same up
			}
			}
			}
		System.out.println("To return to (Account Selection Menu) enter:> :(yes)\nTo end the ATM enter:> (exit)");
		op=kb.next();
	}
		System.out.println("******************************************");
		System.out.println("THANK YOU FOR USING AHMED BANK!");
		System.out.println(" ");
		System.out.println("YOU ARE ALWAYS WELCOME!");
		System.out.println("******************************************");	
	}
}
