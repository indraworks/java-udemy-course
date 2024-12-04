package _04_a_OOPInheritance_Challenge;

public class _12c_CalculatorArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //test 
		//panjang lantai rumah indra 
		Floor floorIndra = new Floor(37.8,40.5);
		Carpet carpetIndra = new Carpet(5);
		Calculator calcIndra = new Calculator(floorIndra,carpetIndra);
		
		System.out.println("biaya luasan total carpet ="+ calcIndra.getTotalCost());
	}

}

/*
 * Carpet Company:
 */

//class Floor suruh buat : luas lengthx width 
class Floor {
private double width;
private double length;

public Floor(double width,double length) {
    if (width < 0) {this.width = 0 ;}
    else {this.width = width;};
    if (length <0) {this.length = 0;} else {this.length = length;}; 
}
//getter setter 

public double getWidth() {
	return width;
}

public void setWidth(double width) {
	this.width = width;
}

public double getLength() {
	return length;
}

public void setLength(double length) {
	this.length = length;
}
public double getArea() {
	return width * length;
}

}

class Carpet {
	private double cost;
	public Carpet(double cost) {
		if(cost < 0) {
			this.cost = 0;
		}
		this.cost = cost;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
}

/*
 * perlu diingat utk param yg pasing dari class lain /instance 
 * dari object dari class lain maka tetap dia ini private!
 * jadi intinya kalau kita 
 * 
 * 
 * 
 */
class Calculator {
    private  Floor floor;
	private Carpet carpet;
	
	public Calculator(Floor floor,Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor; //object didalamya menyesuaikan 
	}

	public Carpet getCarpet() {
		return carpet;
	}

	public void setCarpet(Carpet carpet) {
		this.carpet = carpet;
	}
	
//    public Floor getFloor() {
//    	return this.floor;
//    	
//    }
//    public Carpet getCarpet() {
//    	return  this.carpet;
//    }
	
	public double getTotalCost() {
		return carpet.getCost() * floor.getArea();
	}
    
}



/*
 * 
 * Updated Version of Your Snippet:
If you want to stick with public fields (not recommended for real-world projects), 
your getTotalCost() method should look like this:

class Calculator {
    public Floor floor;
    public Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }
}
Why private is Better:
By making floor and carpet private, you:

Prevent external code from modifying these fields directly.
Ensure that changes to their values (if needed) are handled via methods that can include validation.
Here's the preferred version:

class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
Summary:
Use private for fields to enforce encapsulation and protect your class's internal state.
Use getter methods (getArea, getCost) to fetch values safely.
Avoid using public fields unless there's a specific and justifiable reason.
 * 
 */








