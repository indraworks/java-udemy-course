package _04_a_OOPInheritance_Challenge;

public class _05_AccountWithConstructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountNew indraAccount = new AccountNew();
		indraAccount.setCustomerName("Indra Suryawan");
		indraAccount.setBalance(2500);
		indraAccount.setNumber("70");
		indraAccount.depositBalance(307903);
		indraAccount.withDrawBalance(876.45);
		indraAccount.setCustomerEmail("indra@gmail.com");
		indraAccount.setCustomerPhone("085212886886");
		System.out.println(indraAccount.toString());
		
		indraAccount.withDrawBalance(304.45);
		indraAccount.withDrawBalance(795.97322);
		System.out.println("test to string");
System.out.println(indraAccount.toString());
		
		
	}

}

class AccountNew {
	private String number;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	
	//cunstructor dibuat jika constuctor tidak dibuat 
	//maka java sudah otomatis buat default constructor (secara inmplisit)
	public AccountNew() {
		//nama construtor sama dgn nama class! 
		System.out.println("constructor called!");
	}
	//ini cusntroctor dgn parameter 
	public AccountNew(String number,double balance,String customerName,String customerEmail,String customerPhone) {
		    this.number = number;
		    this.balance = balance;
		    this.customerName = customerName;
		    this.customerEmail = customerEmail;
		    this.customerPhone = customerPhone;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
			
	//getter & setter 
	
	
	//method  balance variable object param yg masuk kita namain nilaiDeposit
	
	public void depositBalance(double fill) {
		balance +=fill;
		System.out.println("deposit amount = "+fill +"mybalance right now = "+balance);
	}
	
	public void withDrawBalance(double value) {
		
		balance -= value;
		if(balance < 0) {
			System.out.println("your balance not sufficient enought!");
		} else {
			System.out.println("you take money amount ="+ value +",your current balance ="+balance);
		}
		
	}
	//method printf-field atau dikenal dgn toString() utk semua field bawaan java :
	@Override
	public String toString() {
		return "selengkapnya : AccountNew [getNumber()=" + getNumber() +"\n" +
	          ", getBalance()=" + getBalance() +"\n"+ ", getCustomerName()="
				+ getCustomerName() + "\n"+ ", getCustomerEmail()=" +
	          getCustomerEmail() + "\n"+ ", getCustomerPhone()="+
				getCustomerPhone() + "]\n";
	}
	
	
	
}
/*
jadi begini constructor adalah sbuah functuon yg dijalankan atau diexcute
perrama kali setelah sbuah object dibuat!/atau diinstance dalam sbuah class
yg di panggil(dimana object class tersebut dicetak)
triger pertama ya jalankan constructor ini !


*/