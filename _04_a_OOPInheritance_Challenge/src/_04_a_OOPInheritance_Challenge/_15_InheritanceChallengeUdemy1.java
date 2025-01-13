package _04_a_OOPInheritance_Challenge;
//yg ini sama casenya cuman ini dari 
import java.util.Calendar;

public class _15_InheritanceChallengeUdemy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Workerx {
	private String birthDate;
	private String name;
	private String endDate;
	
	
	
	
	
	//constructor 
	public Workerx(){
		
	}
	public Workerx(String name,String birthDate,String endDate ) {
		this.name = name;
		this.birthDate = birthDate;
		this.endDate = endDate;
	}
	//getter setter 
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
	
	//method
	public double collectPay() {
		return 0.0;
	}
	
	
	
	public int getAge() {
		Calendar crYear = Calendar.getInstance();
		int currentYear = crYear.get(Calendar.YEAR);
		String[] dateParts = birthDate.split("/");
		int birthYear = Integer.parseInt(dateParts[2]);
		return (currentYear - birthYear);
		
	}
	
	public void terminate(String endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "Workerx [birthDate=" + birthDate + ", name=" + name + ", endDate=" + endDate + "]";
	}
	
	
	
}

class Employee extends Workerx {
	private long employeeId;
	private String hireDate;
	
	
	
}

