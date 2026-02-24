package oops;

public abstract class BankAccount {
private String holdername;
private double balance;

public BankAccount(String holdername,double balance) {
	this.holdername=holdername;
	this.balance=balance;
}

public double getBalance() {
	return balance;
}
public void deposit(double ammount) {
	balance+=ammount;
	System.out.println("deposited ammount"+ balance);
}

public abstract  void Withdraw(double ammount);





}

 class SavingAccount extends BankAccount{
	 public SavingAccount(String name,double balance) {
		 super(name,balance);
	 }
	 @Override
	 public void  Withdraw(double ammount) {
		 if(ammount <=getBalance()) {
			 System.out.println("withdraw ammount  from savings"+ammount);
			 
			 
		 }
		 else {
			 System.out.println("insufficient balance in savings");
		 }
	 }
	
}
 
 class CurrentAccount extends BankAccount{
	 public  CurrentAccount(String name,double balance) {
		 super(name,balance);
	 }
	 
	 public  void Withdraw(double ammount) {
		 System.out.println("withdraw ammount  from current account"+ammount);
		 
		 
		 
	 }
 
 public static void main(String[] args) {
	 BankAccount acc1=new SavingAccount("pooja",5000);
	 BankAccount acc2=new CurrentAccount("rahul",2000);
	 
	 acc1.deposit(1000);
	 acc1.Withdraw(4000);
	 
	 acc2.Withdraw(5000);
 }
 }
 