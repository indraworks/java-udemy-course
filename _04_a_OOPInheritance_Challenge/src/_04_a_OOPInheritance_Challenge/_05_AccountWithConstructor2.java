package _04_a_OOPInheritance_Challenge;

public class _05_AccountWithConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			System.out.println("constructor empty called!");
		}
		//ini cusntroctor dgn parameter 
		public AccountNew(String number,double balance,String customerName,String customerEmail,String customerPhone) {
			    this.number = number;
			    this.balance = balance;
			    this.customerName = customerName;
			    this.customerEmail = customerEmail;
			    this.customerPhone = customerPhone;
		}
		
		//ini constructor ke 3 hnya name,email,phone saja paramnya 
		public AccountNew(String customerName,String customerEmail,String customerPhone) {
		   
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

}


/*
disini kita mengenal utk bagian ke-2 adlaah 
constructor dgn parameter ,jadi dalam class jika tidak ada dibuat constructor maka class otomatis 
secara inplisit buat constructor,jika class sudah dideclare di tukis construtor maka default constructor 
yg implicit tidak dibuat oleh java/class tsb.
constuctor overloadning adalah constructor dgn nama yg sama ada lebih dari >1 di dalam 1 buah class
tetepi tiap2 constructor yg dideclare tadi beda2 gak sama atau uniq parameter2nya utk masing2 construcor 
yg dideclare tsb 

class X {
   public X(int x,y,z);
   public X(){};
   public X(int x){};
   public X (int x,int y){};
   public X(int y){};

}

diatas d diberikan contoh 
ada 3 constructor 
yg pertama langsung  diiisi nilai tak ada parameternya 
nah utk pengisian urut disesuaikan dgn field2 yg dibuat 
yg kedua ,constructor berisi param smua field 
yg ketiga ,constucotr hanya berisi name,email.phone si penabung /userAccount

diatas maka disebut constructor overloading!


*/