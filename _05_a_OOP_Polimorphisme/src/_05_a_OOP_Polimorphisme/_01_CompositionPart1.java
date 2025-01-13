package _05_a_OOP_Polimorphisme;

public class _01_CompositionPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello java 21");
       Laptop defaultLaptop = new Laptop();
       System.out.println(defaultLaptop);
	}

}

class Laptop {
	private float screen;
	//ini object dari class lain 
	private Processor processor;
	private String ram;
	private String hardDrive;
	//ini dari objct class lain 
	private GraphicCard graphicCard;
	private String opticalDrive;
	private String keyboard;
	
	public Laptop() {
		this.screen = 16.6f;
		this.processor = new Processor();
		this.ram = "DDR4" ;
		this.hardDrive = "2TB";
		this.graphicCard = new GraphicCard();
		this.opticalDrive = "MLT Layer";
		this.keyboard = "backlit";
	}

	public Laptop(float screen, String ram, String hardDrive, GraphicCard graphicCard, String opticalDrive,
			String keyboard) {
		super();
		this.screen = screen;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicCard = graphicCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + "\n, processor=" + processor + "\n, ram=" + ram + "\n, hardDrive=" + hardDrive
				+ "\n, graphicCard=" + graphicCard + "\n, opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]\n";
	}
	
	
}




class Processor {
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxfrequency;
	
	//ini utk default nilai 
	public Processor() {
		this.brand = "intel";
		this.series = "i9200 13th ";
		this.generation = 13;
		this.cores = 8;
		this.threads = 8;
		this.cacheMemory = "16MB";
		this.frequency = "8.0Ghz";
		this.minFrequency = "8.0Ghz";
		this.maxfrequency = "8.0Ghz";
	}

	public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
			String frequency, String minFrequency, String maxfrequency) {
		super();
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxfrequency = maxfrequency;
	}

	//toString  //override berasal dari method of class  javalang!
	@Override
	public String toString() {
		return "Processor [brand=" + brand + "\n, series=" + series + "\n, generation=" + generation + "\n, cores=" + cores
				+ "\n, threads=" + threads + "\n, cacheMemory=" + cacheMemory + "\n, frequency=" + frequency
				+ "\n, minFrequency=" + minFrequency + "\n, maxfrequency=" + maxfrequency + "]\n";
	}
	
	
	
	
}

class GraphicCard {
	private String brand;
	private int series;
	private String memory;
	
	public GraphicCard() {
		this.brand = "NVdia";
		this.series = 123;
		this.memory = "8T";
	}

	public GraphicCard(String brand, int series, String memory) {
		
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "GraphicCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}
	
	
}







/*
 APA COMPOSITION ITU?
 What is Composition?
Composition is a design principle in object-oriented programming 
where a class is made up of one or more objects from other classes.
It models a "has-a" relationship.
Example: A Laptop has a Processor and a GraphicsCard.
 =============/////=============
 jadi composition itu berbeda dgn inheritance pewarisan dimana dgn extend property/filed dan method dari super class
 diwarikan ke anak class 
 NAH PADA COMPOSITION ini maka ada sbuah class didalam class tsb dibangun /berkomposisi has-a  object sbgai field dari class2 lainya 
 jadi kedudukan sejajar tapi DIA SEBAGAI PEMBANGUN /COMPONENT UTK BANGUN CLASS LAINYA DGN OBJECT2 CLASS TSB DIDAPAT DARI CLASS2 LAINYA! 
 jadi misal laptoip class dia "has-a" component dari 'GrapichCard class" dan "Processor Class" 
 
  
 */



