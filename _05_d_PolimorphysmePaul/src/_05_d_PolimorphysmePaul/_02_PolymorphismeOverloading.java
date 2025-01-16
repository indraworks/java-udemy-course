package _05_d_PolimorphysmePaul;

public class _02_PolymorphismeOverloading {
	public static void main (String[] args) {
		//kita panggil class Dog 
		Dog dog1 = new Dog();
		dog1.makeSound();
		dog1.makeSound("Roaar");
		dog1.makeSound("meong","weak loud");
		
		Dog dog2 = new Dog();
		dog2.makeSound("woof woof");
		dog2.makeSound("woof woof!","strong loudly!");
	}

}

//parent class 
class Animal {
	private String name;
	
	public void makeSound() {
	System.out.println("roaar!!!");
		
	}
	public void makeSound(String soundType) {
		System.out.println("make type sound :"+ soundType);
		
	}
	
	public void makeSound( String soundType,String loudNess) {
		System.out.println("make type sound :"+ soundType +"and this "+loudNess);
		
	}
}


//dhild class 
class Dog extends Animal{
	
}








/*
kita bicara polymorpysme overloading disini adalah sbuah 
parent class puny amethod yg sama namanya tapi parameter berbeda 
dan sianak panggil itu masing2 method dari parent tadi nah 
kita namakan ini polymorphysme karn sianak panggil itu method parent 
dan sama namanya tapi beda parameternya bisa di liat contoh diatas ! 
diaas ada class Animal parent punya method 3 method sama :
makeSound(),
makeSound(String soundtype)
makeSound(String soudnType,String loudness)

disatas ada class Dog extends Animal dst...




*/