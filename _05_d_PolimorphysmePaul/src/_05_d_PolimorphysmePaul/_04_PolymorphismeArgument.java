package _05_d_PolimorphysmePaul;

public class _04_PolymorphismeArgument {
	//dimain kita instance smua class Dog dan Cat 
	
   public static void main(String[] args) {
	   Dog mydog = new Dog();
		Cat mycat = new Cat();
		Vet allvet = new Vet();
		allvet.makeShout(mycat);
		allvet.makeShout(mydog);
   }

}


/*
jadi gini ada Paren Class 
ada anak class sebut saja  Dog dan Cat dan merka masing2 punya 
method sebut saja yg sudah kita buat makeSound nah 
disini kita buat lagi class yg acomodir dimana sebut saja class Vet 
class ini tidak extgend ke Animal sprti Dog dan Cat tapi dia berdiir smditi 
nah class Vet ini ada method dimana dia memasukan Animal animal sbgai param atau 
argument shingga nntinya otomatis kita akan pakai Dog dan Cat object sbgai argumebtya 
ini yg dimaksdukan sbgai polymorpisme argument jadi lebih claer dan flexible! 
contoh diatas 



*/

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

class Dog extends Animal {
	public void makeSound() {
		System.out.println("Guk! Guk!");
	}
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("Meong! meong!");
	}
}

//ini class berdiri sndir dan punya argument object animal 
class Vet {
	public void makeShout(Animal animal) {
		animal.makeSound();
	}
}
