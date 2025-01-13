package _04_a_OOPInheritance_Challenge;

import java.util.Calendar;

public class _15c_InherintanceChallengeChatGPT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		SalariedEmployee1 indra = new SalariedEmployee1("indra","16/10/1983","01/01/2004");
		System.out.println("indra calculate salary as below :");
		indra.calculatedSalary();
		System.out.println("indra retired :");
		SalariedEmployee1 indra1 = new SalariedEmployee1("indra1","16/10/1983","01/08/2025","01/01/2004",13000.00,true);
		//why the param variable passing the parantheses not work as the isRetired = true? 
		//it is only work when i used retire function ,wpuld you analysis this snipet?so ican flexible put the date of endDate for the employee pansion?
		
		indra1.calculatedSalary();
		
		
		
		

	}

}


class Worker1 {
	 private String name;
	 private String birthDate;
	 protected String endDate; //harus protected supaya bis adipakai sama
	 //anak2 yg extend dbiawab secara langsung!
	 
	
	 public Worker1(String name,String birthDate,String endDate) {
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
	 //method collectPay dri Worker 
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
	 
	 
	  
}
	



class Employee1 extends Worker1  {
	private long employeeId;
	  private  String hireDate;
	  private static int employeeCount =1;
	  
	  public Employee1(String name,String birthDate,String hireDate){
		  //untk isi hanya name,birthDate dan endDate
		  this(name,birthDate,"Unknown",hireDate);
	  }
	
	  public Employee1(String name,String birthDate,String endDate,String hireDate) {
			super(name,birthDate,endDate);
			this.employeeId = employeeCount++;
			this.hireDate = hireDate;
		}

	  
	  //getter & setter   
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


	  
	  
}

class SalariedEmployee1  extends Employee1{
	//fields
	  private double  annualSalary;
	  private boolean isRetired;
	  
	  //chain constructor jika blum pensiun 
	  //dia ini pegawai basic smua 14000.500 1thnya dan blum pensiun jadi
	  //utk variable endDate default= "unknown"
	  //utk variable boolean isretired = false /blum pensiun!
	  public SalariedEmployee1(String name,String birthDate,String hireDate) {
		  this(name,birthDate,"unknown",hireDate,14000.500,false);
	  }
	  
	  //constructor sudah pensiun ada endDate 
	  public SalariedEmployee1(String name,String birthDate,String endDate,String hireDate,
			  double annualSalary,
			  boolean isRetired) {
		     super(name,birthDate,endDate,hireDate);
		     this.annualSalary = annualSalary;
		     this.isRetired = isRetired;
		    
	  }
	
	  //getter setter 
	  
	  
	  //methode collectPay() dari Worker dipakai sama anak sub-subclass 
	  //kita harus pakai anotation @overried 
	  @Override 
	   public double collectPay() {
		  //nilai yg diaterima gaji bulanan dibagi 26 minggu 
		  double paycheck = annualSalary / 26;
		  //jika pansiun dapat 0.9 dari gaji
		  double adjustedPay = (isRetired)?0.9*paycheck : paycheck;
		  //convert ke integer 
		  return (int) adjustedPay;
	
		  
	      }
	  
	  public void retire() {
		  terminate("12/12/2025");
		  isRetired = true;
	  }
	  
	  //refactor getAmountSalary 
	  public void calculatedSalary() {
		  //langung bisa ambil access prive hireDate dgn func getHireDate di parentClass!
		  String[] dateParts = getHireDate().split("/");
		  int yearHired = Integer.parseInt(dateParts[2]);
		  Calendar calendar = Calendar.getInstance();
		  int currYear = calendar.get(Calendar.YEAR);
		  int yearsWorked = currYear - yearHired;
		  
		  double basePay = collectPay(); //using instance collectPay method
		  double totalSalary;
		  if(yearsWorked < 5) {
			  totalSalary = basePay + annualSalary;
			  
		  } else if (yearsWorked < 10) {
			  totalSalary = 1.5*basePay + annualSalary;
		  } else {
			  totalSalary = 2.5 * basePay + annualSalary;
			  
		  }
		  if (isRetired != false) {
			  totalSalary = 0.9*annualSalary +basePay;
		  }
		  //jadi gak perlu itu si object dipassing di paranteses jadi param 
		  //kmudian paramObjec.fieldnya! salah ini  !! kita langsung bisa method parentnya di minta 
		  //krn mis getName() kita bisa access field namenya si parentClass dari getter atau setternya ! 
		  System.out.println("Name :" + getName());
		  System.out.println("HireDate :"+getHireDate());
		  if(isRetired != false) {
			  System.out.println("endDate :"+getEndDate());
			  System.out.println("Pansiun :" +isRetired);
		  }
		  System.out.println("Years Worked : "+yearsWorked);
		  System.out.println("Annual Salary :" + annualSalary);
		  System.out.println("total Salary  :"+ totalSalary);
 	  }
	  @Override 
	  public String toString() {
		  return "SalariedEmployee [ Name = "+ getName()+ ",AnualSaalary = "+annualSalary +"]";
	  }
}

class HourlyEmployee1 extends Employee1 {
	private double hourlyPayRate;
	public HourlyEmployee1(String name,String birthDate,String hireDate,String endDate,double hourlyPayRate) {
		super(name,birthDate,hireDate,endDate); //harus lengkap! kalau kurang 1 saja maka error dari parenclass
		this.hourlyPayRate = hourlyPayRate;
		
	}
	@Override
	public double collectPay() {
		return 40*hourlyPayRate;
	}
	
	public double getDoublePay() {
		return 2* collectPay();
	}
	
}

/*
 SAlariedEmployee kita refactor yg tadinya pakai static dan masukin object employee dari klass employe gakperlu kita manggil 
 OOP nya dari main saja berikut yg asli sblum refactor :(pakai static)
 //public static void getAmountSalary(Employeex empl,SalariedEmployee slrdEmp){}
 
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
 */

