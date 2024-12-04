package _04_a_OOPInheritance_Challenge;

public class _13_InheritancePart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Animal {
	protected String type;
    private String size;
    private double weight;

    public Animal() {

    }
    public Animal(String type,String size,double weight) {
    	this.type = type;
    	this.size = size;
    	this.weight =weight;
    }
    //this getter seteer 
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//ktika printl objectnya otomatis ini yg keluar !
	@Override
	public String toString() {
		return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}
    
	//utk 
    
    
    
    
}

class Dog {
	
}

class Fish {
	
}
