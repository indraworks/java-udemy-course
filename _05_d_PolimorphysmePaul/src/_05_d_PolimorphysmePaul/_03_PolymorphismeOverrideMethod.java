package _05_d_PolimorphysmePaul;

public class _03_PolymorphismeOverrideMethod {
	//kita buat instance dog
	public static void main(String[] args) {
		Dog1 mydog = new Dog1();
		
		
		mydog.makeSound(); //yg dipakai method dari class Dog ini override yg asli dari parent Animal 
		mydog.makeSound("New Roaaar",3); //yg dia=kaia method class dog yg ada powerLevel int bukan yg dari 
		                                 //animal class /parent ini dioverride sama dia 
		
	}

	
	

}


class Animal1 {
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

class Dog1 extends Animal1 {
	
	public void makeSound() {
		System.out.println("Wooof Pelan22!");
	}
	public void makeSound(String soundType,int powerLevel) {
		System.out.println("make type"+ soundType +"power level = "+powerLevel);
	}
}
/*
polymorphysme override maksudnya overriding 
jadi bisa "over Ride" kendarai itu functuonal atau methdo 
dari class parent methodnya dengann nama yg sama tapu 
si anak gunakan nama method yg sama dgn yg parent DAN ISINYA SPECIFIK 
SESUAI DGN DIRINYA SENDIRI ,jadi method yg ada di anak ini sama
contoh di class parent animal ada method makeSound() { sysout("wooof"} 
nah dalam class anak dog ada juga makeSound() { sysout{goook! gook! };
ini artinya method dari si parent di "OVRRIDING" sama si anak 
dan dipakai sesuai dgn kebutuhan si anak( atau spsifik dia siapa/sesuai dgn behaviornya!) 
itu maksudnya!



*/