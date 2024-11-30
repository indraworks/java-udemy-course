package _04_a_OOPInheritance_Challenge;

public class _04_Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person person = new Person();
       person.setFirstName("");
       person.setLastName("");
       person.setAge(10);
       System.out.println("fullname = "+person.getFullName());
       System.out.println("teen = "+person.isTeen());
       person.setFirstName("Jhon");
	   person.setAge(18);
	   System.out.println("fullname = "+person.getFullName());
       System.out.println("teen = "+person.isTeen());
       person.setLastName("Smith");
       System.out.println("person FullName =" +  person.getFullName());
      
	}

}

class Person {
	 private String FirstName;
	 private String LastName;
	 private int Age;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		if (age > 0 && age <=100) {
			Age = age;
		}
		
	}
	 
	//method :
	public boolean isTeen() {
		 if(Age > 12 && Age < 20) {
			 return true;
		 }
		return false;
		
	}
	public String getFullName() {
		if (LastName.isEmpty()) {
			return FirstName;
		} else if (FirstName.isEmpty()) {
			return LastName;
		} else {
			return (LastName+" "+FirstName);
		}
		
	}
	
}

/*
buat class Person 
field:firstName,lastName ,age type String 
metode instance getFirsTName,getLastName,getAge 
setFirstName with one param 
setLastName with one param 
setAge with oneParam rang param 0 sd 100 

method isTeen utk return boolean true jika  age>= 12 dan umur <20 
methid getFullName gabungan dari return firstName dan lastName 
       jika firstName = "" return lastName; check dgn isEmpty() eturn true jka ""
       jika lastName ="" return firstName 



*/