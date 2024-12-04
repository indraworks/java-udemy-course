package _04_a_OOPInheritance_Challenge;
import java.util.Calendar;
public class _15_InheritanceChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Worker {
	 private String name;
	 private String birthDate;
	 private String endDate;
	 
	
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
		  return 0.0; // gak ada itungannya awal2 
	  }
	  
     //method terminate 
	  public String terminate(String endDate) {
		  return endDate;
	  }
	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}
	 
	  //overide to string 
	  
}

  class Employeex extends Worker {
	  private long employeeId;
	  private  String hireDate;
	
	  
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
	  
	public Employeex(String name,String birthDate,String endDate,long employeeId,String hireDate) {
		super(name,birthDate,endDate);
		this.employeeId = employeeId;
		this.hireDate = hireDate;
	}
	  
  }



  class SalariedEmployee extends Employeex{
	  private double  annualSalary;
	  private boolean isRetired;
	  
	  
	  //getter setter 
	    
	

	public double getAnnualSalary() {
		return annualSalary;
	}


	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}


	public boolean isRetired() {
		return isRetired;
	}


	public void setRetired(boolean isRetired) {
		this.isRetired = isRetired;
	}
	
	  //method 
	  public void retired() {
		  
	  }

  }

  class HourlyEmployee  extends Employeex {
	  private double hourlyPayRate;
	  
	  public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}

	//method 
	  public double getDoublePay() {
		  return 0.0;
	  }
  }

/*
soal :class Worker  anak 1 --> Employee 
                                      anak2 -----SalariedEmployee
                                            ---- HourlyEmployee 



*/