package animal.fish;
import animal.Animal;

public class Fish extends Animal {

	public Fish(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void swim() {
		System.out.println(name + "is swimming");
	}
   
	@Override
	public void move() {
		System.out.println(name + " is swimming");
	}
}
