package animal.bird;
import animal.Animal;

public class Bird extends Animal{
	private String featherColor;

	//constructor
	public Bird(String name, int age,String featherColor) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.featherColor = featherColor;
	}
    //method local bird 
	public void fly() {
		System.out.println(name + "is flying with "+ featherColor + "feathers");
	}
	
	

	//method ovveride from parent-class 
	@Override
	public void move() {
		System.out.println(name + "is Flying!");
	}
	
  
}
