package _04_OOPInheritance;

public class _01_Inheritance_Balaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Person{
	protected String name;
	protected int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//setter getter 
	
}

class Student {
	
}



/*
ini si balaz dibahas nnti hingga interface baru masuk ke interface di chatGPT

jadi gini utk supaya parentClass fieldnya bisa diakses langsung tanpa lewat
getter setter maka dengan langsung pakai variable type protectect 
jangan pakai private .modifier access akan pakai getter dan setter 
yg super adlah Parent ,Student sub class 
*/