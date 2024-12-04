package _04_a_OOPInheritance_Challenge;

public class _13_InheritancePart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parent instanciate 
		Animal animal = new Animal("COmmon Animal",180.053,"BIG"); //harus urut utk masukan constructor kalau tidak 
		//dianggap salah!
		
		//jalankan static method dimana param adalan animal object
		_13_InheritancePart1.doAnimalStuff(animal, "slow");
		
		//anak instanciate 
		Dog1 mydog = new Dog1();
		System.out.println("myodg = " +mydog);
		_13_InheritancePart1.doAnimalStuff(mydog,"fast");
		//jalamkan static method dimana param adalah dog object/isntranciate
		//_13_InheritancePart1.doAnimalStuff(mydog, "middle");

	}
    //disini kita buat static method (dari main) masukan param type object_animal
	//dan type String utk speed yg mana nnti ini dipakai sbgai param yg akan 
	//panggil method speed di dalam animal class instance/object.
	public static void doAnimalStuff(Animal animal,String speed) {
		animal.makeNoise(); //excute instance method aniomal 
		animal.move(speed); //excute instance method aniomal 
		//kalau kita pakai println obje otomatis overide string keluar dijalankan! 
		System.out.println(animal);
		System.out.println(" - - - - -");
		
	}
	

}

//disini animal adalah parent class 
//animal punya type,size,wieght 
//ada jug amethod makeNoise dam Move  

class Animal { //ini parent 
	private String type;
	private double weight;
	private String size;
	
	public Animal() {};
	public Animal( String type,double weight,String size) {
		this.type = type;
		this.weight = weight;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", weight=" + weight + ", size=" + size + "]";
	}
	
	//method 
	public void move(String speed) {
		System.out.println(type + "move "+speed);
	}
	public void makeNoise() {
		System.out.println(type + "make some noise" );
	}
	
}

//ini anak :

class Dog1 extends Animal {
	public Dog1() {
		//langsung panggil isi default
		super("herder",30.0,"small");
	}
}


/*
inheritance adalah erupakan pewarisan caranya 
sub class anak mendeklrare extends pada classnya dan menyebut nama induk classnya 
contoh class Dog extends Animal() {} 
extends:
Using extends specifies the superclass (or the parent class) of the class we're declaring.
I can say Dog is a subclass or child class of Animal.
I can say Animal is a parent or super class of Dog.
A class can specify one and only one class in its extends clause. 

Super:
super() is a lot like this().
It's a way to call a constructor on the super class directly from the sub class's constructor.
Like this(), it has to be the first statement of the constructor.
Because of that rule, this() and super() can never be called from the same constructor.

Super:
If you don't make a call to super(), then Java makes it for you using super's default constructor. 
If your super class doesn't have a default constructor, then you must explicitly call super() in all of your constructors, 
passing the right arguments to that constructor.

*/