package _04_a_OOPInheritance_Challenge;
import java.util.Calendar;
public class _15_InheritanceChallenge1 {
	//ini inheritance chalange masalah utk Worker,Employement,AnualSalary,hourlySalary 
	//bagian pertama ini murni lewat manual dari class instance smua per-class 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employeex indra = new Employeex("Indra Suryawan","16/10/1979","","12/01/2001");
      System.out.println(indra);
      
      SalariedEmployee indraSalary = new SalariedEmployee("Indra Suryawan","16/10/1979","","12/01/2001");
      indraSalary.setAnnualSalary(12000);
      indraSalary.collectPay();
      //public SalariedEmployee(String name, String birthDate, String endDate,  String hireDate) 
      SalariedEmployee.getAmountSalary(indra, indraSalary);
      
      //System.out.println(indraSalary);
	}

}
//class Worker

class Worker {
	 private String name;
	 private String birthDate;
	 protected String endDate; //harus protected supaya bis adipakai sama
	 //anak2 yg extend dbiawab secara langsung!
	 
	
	 public Worker(String name,String birthDate,String endDate) {
		 this.name = name;
		 this.birthDate = birthDate;
		 this.endDate = endDate;
	 }
	
	 
	 //getter setter 
	 public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}
		public String getEndDate() {
			return endDate;
		}
		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
	 
	 //method 
	  public int getAge(String birthDate ) {
		  //plit dan tampung sbgai data String[]
		  String[] dateParts = birthDate.split("/");
		  //extract year 
		  int year = Integer.parseInt(dateParts[2]);
		  //get current YEar dinamicaly 
		  Calendar mycalendar = Calendar.getInstance();
		  int currentYear = mycalendar.get(Calendar.YEAR);
		  return currentYear -year;
	  }
	 //method collectPay
	  public double collectPay() {
		  //colectpaid is the basic 
		  return 5000.0; // gak ada itungannya awal2 
	  }
	  
     //method terminate 
	  public void terminate(String endDate)//Jadi gini sbnarnya ini ada 3 tingkat nah utk subclas ke-2 
 {
		  this.endDate = endDate;
	  }
	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}
	 
	  //overide to string 
	  
}

//class Employeex
  class Employeex extends Worker {
	  private long employeeId;
	  private  String hireDate;
	  private static int employeeCount =1;
	
	  public Employeex(String name,String birthDate,String endDate,String hireDate) {
			super(name,birthDate,endDate);
			this.employeeId = employeeCount++;
			this.hireDate = hireDate;
		}
	  
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "Employeex [employeeId=" + employeeId +" ,name ="+super.getName()  +", hireDate=" + hireDate + "]";
	}
	  
	
	  
  }

//class SalariedEMployee 
  
  class SalariedEmployee extends Employeex{
	  private double  annualSalary;
	  private boolean isRetired;
	  
	  
	//worker (name,birthDate,endDate) 
		//Employee(employeeId,hireDate
		public SalariedEmployee(String name, String birthDate, String endDate,  String hireDate) {
			super(name, birthDate, endDate,  hireDate);
			// TODO Auto-generated constructor stub
		}
		
		public double getAnnualSalary() {
			return annualSalary;
		}

	    


		public void setAnnualSalary(double annualSalary) {
			this.annualSalary = annualSalary;
		}
		//INI seNEGAJA PAKE STATIC masukin DISINI NAH OLEH CHATGPT GAK BAGUS DARI SEGI OPP 
		//NNTI KITA REFACTOR DI _15C_InheritanceChallengeChatGTP 
		//nah utk inheritanceChallengeUdemy1 itu adalah kita contoh dari udemy 
		//dimana pointnya adalah polymorpisme pemakaian colectPay() dari parenClass method 
		//nah dipakai oleh subclass anak method tsb tapi isinya masing2 beda makanya kita 
		//disubclass gunakan @override diatas collectPay method title pada subclass2 yg pakai method parent ini ! 

       public static void getAmountSalary(Employeex empl,SalariedEmployee slrdEmp) {
    	   String[] dateparts  = empl.getHireDate().split("/");
    	   int yearHire = Integer.parseInt(dateparts[2]);
    	   Calendar crYear = Calendar.getInstance();
    	   int currentYear = crYear.get(Calendar.YEAR);
    	   int lnYear = currentYear -yearHire;
    	  
    	   double result = 0.0;
    	  if (lnYear < 5) {
    		   result = empl.collectPay() + slrdEmp.annualSalary;
    	  } else if ((5 <= lnYear) && ( lnYear < 10)  ) {
    		  //if  10 year already 
    		  result = 1.5 * empl.collectPay() +slrdEmp.annualSalary;
    	  } else {
    		  result = 2.5* empl.collectPay() + slrdEmp.annualSalary;
    	  }
    	  System.out.println("your name         :" + empl.getName());
    	  System.out.println("your hire since   :" + empl.getHireDate());
    	  System.out.println("your lengthWork   :" + lnYear);
    	  System.out.println("your anualSalary  :" + slrdEmp.getAnnualSalary());
    	  System.out.println("your total Salary inc collectPaid :"+result);
       }
	  //getter setter 
	   
	
   


	public boolean isRetired() {
		return isRetired;
	}


	public void setRetired(boolean isRetired) {
		this.isRetired = isRetired;
	}
	
	  //method yg anak bisa ambil object parent trus dipassing itu polymorphise
	  public void retired(Worker wrk) {
		  if (wrk.endDate != "") {
			  setRetired(true);
			  
		  }
	  }



	
	  
	  
	  @Override
	public String toString() {
		return "Name Employee " + super.getName() +"SalariedEmployee =" + annualSalary + ", isRetired=" + isRetired + "]";
	}

	  
	  
  }

  class HourlyEmployee  extends Employeex {
	  private double hourlyPayRate;
	  
	  public HourlyEmployee(String name, String birthDate, 
			  String endDate, 
			   String hireDate,double hourlyPayRate) {
		  super(name,birthDate,endDate,hireDate);
		  //ada yg kurang  ini hourlyRate blum initial 
		  this.hourlyPayRate = hourlyPayRate;
	  }
	
	 //getter setter 
	  public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}

	//method 
	  public double getDoublePay() {
		  return hourlyPayRate *2; // soalnya double paid 
	  }

	@Override
	public String toString() {
		return "HourlyEmployee [hourlyPayRate=" + hourlyPayRate + "]";
	}
	  
	  //toString 
	  
	  
  }

/*
soal :class Worker  anak 1 --> Employee 
                                      anak2 -----SalariedEmployee
                                            ---- HourlyEmployee 

//INI seNEGAJA PAKE STATIC masukin DISINI NAH OLEH CHATGPT GAK BAGUS DARI SEGI OPP 
		//NNTI KITA REFACTOR DI _15C_InheritanceChallengeChatGTP 
		//nah utk inheritanceChallengeUdemy1 itu adalah kita contoh dari udemy 
		//dimana pointnya adalah polymorpisme pemakaian colectPay() dari parenClass method 
		//nah dipakai oleh subclass anak method tsb tapi isinya masing2 beda makanya kita 
		//disubclass gunakan @override diatas collectPay method title pada subclass2 yg pakai method parent ini ! 
*/