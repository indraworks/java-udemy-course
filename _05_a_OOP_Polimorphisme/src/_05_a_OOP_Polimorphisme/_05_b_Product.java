package _05_a_OOP_Polimorphisme;

public class _05_b_Product {
  private String model;
  private String manufacturer;
  //utk widht height depth gak masuk kita kkuarkan 
  //ini jadi has a utk tiap class yg nnti kita composition!
  private int width;
  private int height;
  private int depth;
public _05_b_Product(String model, String manufacturer) {
	
	this.model = model;
	this.manufacturer = manufacturer;
}
  
 
  
}

//class Monitor 

class Monitor extends _05_b_Product {
	private int size;
	private String resolution;
	
	public Monitor(String model, String manufacturer) {
		super(model,manufacturer);
		
	}

	public Monitor(String model, String manufacturer, int size, String resolution) {
		super(model, manufacturer);
		this.size = size;
		this.resolution = resolution;
	}
	
	
	//method 
	public void drawPixelAt(int x,int y,String color) {
		System.out.println(String.format("Drawing pixel in %d,%d in color %s",x,y,color));
	}
}


//class MotherBoard 
class Motherboard extends _05_b_Product {
	//field 
	private int ramSlots;
	private int cardSlots;
	private String bios;
	

	public Motherboard(String model, String manufacturer) {
		super(model, manufacturer);
		// TODO Auto-generated constructor stub
	}


	public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		super(model, manufacturer);
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	//method loading program mmnberitahu program sudah load 
	public void loadProgram(String programName) {
		System.out.println("Progam :"+programName +" is now loading ...");
	}
	
}


//class ComputerCase 
class ComputerCase extends _05_b_Product {
	private String powerSupply;

	public ComputerCase(String model, String manufacturer) {
		super(model, manufacturer);
		// TODO Auto-generated constructor stub
	}

	public ComputerCase(String model, String manufacturer, String powerSupply) {
		super(model, manufacturer);
		this.powerSupply = powerSupply;
	}
	
	//method Press Button 
	public void pressButtonPower() {
		System.out.println("Power Button Pressed ");
	}
}


/*
jadi utk compositon kita ada 3 class
 Monitor,MotherBoard,ComputerCase 
 nah masing2 ini nnti class trsendiri nah object daro class tsb 
 kita jadikan private field pada classPersonalComputer yg kita baut 
 tetap extgend dari product 
 




*/