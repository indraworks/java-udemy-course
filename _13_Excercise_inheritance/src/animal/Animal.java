package animal;

public class Animal {
  protected String name;
  protected int age;
  
  public Animal(String name,int age) {
	  this.name = name;
	  this.age = age ;
	  
  }
  public void move() {
	  System.out.println(name + " is moving");
  }
  public void eat() {
	  System.out.println(name + " is eating");
  }
}
