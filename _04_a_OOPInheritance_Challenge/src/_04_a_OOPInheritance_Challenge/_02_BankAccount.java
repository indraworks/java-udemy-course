package _04_a_OOPInheritance_Challenge;

public class _02_BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      //instanciate object account
		Account accountIndra = new Account();
		accountIndra.setAccountBalance(3000);
		accountIndra.setEmail("indrasuryawan@gmail.com");
		accountIndra.setCustomerName("Indra Suryawan");
		accountIndra.setPhoneNumber("085212886886");
		
		
		System.out.println("mybalance awal = "+ accountIndra.getAccountBalance());
		accountIndra.withdrawFund(6000);
		accountIndra.withdrawFund(784.567);
	}

}

class Account {
	private int accountNumber;
	private double accountBalance = 0.0;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public void depositeFund(double ammountNumber) {
		accountBalance += ammountNumber;
		System.out.println("this account add deposite: "+ammountNumber+" total balance = "+accountBalance);
	}
	
	public void withdrawFund(double ammountNumber) {
		if(accountBalance - ammountNumber  < 0){
			 System.out.println("your balance insufficient");
		} else {
			accountBalance-= ammountNumber;
			System.out.println("this account witdrawal :"+ammountNumber +"you current balance :"+accountBalance);
		}
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}

/*
disni tugas buat new Class Bank Account 
1)buat field 
accountNumber
accountBalance 
customerName
email
phoneNumber 
2)buat getter setter nya 
3) buat functuon 
   atau mehode 
     -depositeFund utk utk add money account 
     -withdrawFund utk tarik money account
4) customer gak bisa tarik uang jika uang < 0 
   dari hasil pengurangan  
   hasil akhir print balance yg sekarang! 
   utk balance gunakan setBalance ktika buka rekening atau instance 
   
*/