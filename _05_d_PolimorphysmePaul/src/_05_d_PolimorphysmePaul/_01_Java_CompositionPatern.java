package _05_d_PolimorphysmePaul;

public class _01_Java_CompositionPatern {
	public static void main(String[] args) {
		//pada main kita decrale dulu buat  object Bubble 
		//tub dan sink 
		//bubles radius dan color
		Bubbles bubbles = new Bubbles(6,255);
		//sink materail bahan
		Sink thesink = new Sink("fibberGlass");
		
		//Tub
		Tub theTub = new Tub(20,bubbles);
		
		//Bathroom
		BathRoom mybath = new BathRoom(theTub,thesink);
		mybath.detailBathRoom();
		
		
	}

}

class BathRoom {
	//berisi Tub dan Sink sbgai field 
	private Tub tub; //bahtroom has tub
	private Sink theSink; //bathroom has sink
	
	//constructor 
	public BathRoom(Tub tub,Sink theSink) {
		this.tub = tub;
		this.theSink = theSink;
	}

	//buat getter dan setternya 
	public Tub getTub() {
		return tub;
	}

	public void setTub(Tub tub) {
		this.tub = tub;
	}

	public Sink getTheSink() {
		return theSink;
	}

	public void setTheSink(Sink theSink) {
		this.theSink = theSink;
	}
	
	//method detail BathRoom
	public void detailBathRoom() {
		System.out.println("Bathroom details :");
		tub.displayDetailsTub();
		theSink.DisplaySinkDetail();
	}

	
}




class Tub {
	//tub ada size dan bubbles 
	//tub disini adalah bak mandi dimana terisntall Bubles didalamnya 
	//nnati bubles jadi fieldnya 
	private int size; 
	private Bubbles bubbles;
	
	//constructor 
	public Tub( int size,Bubbles bubbles) {
		this.size = size;
		this.bubbles = bubbles;
	}

	//buat getter setternya ! 
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Bubbles getBubbles() {
		return bubbles;
	}

	public void setBubbles(Bubbles bubbles) {
		this.bubbles = bubbles;
	}
	 
	//method display Tub detauls 
	//check Bubblesnya available
	public void displayDetailsTub() {
		System.out.println("Tub size = "+ size);
		if(bubbles != null) {
			bubbles.DisplayDetailBubbles();
		} else {
			System.out.println("No Bublles inside Tub!");
		}
		
	}
	
	 
	 
	
	
	
}

//buat class Bubbles 
//buble ada radius dan warna gelembung 
//ini cetakan utk buat bussa 

class Bubbles {
	private int radius; //bubles radius 
	private int color; //rgb color representasi 
	
	//constructor
	public Bubbles(int radius, int color) {
		
		this.radius = radius;
		this.color = color;
	}

	//getter setter 
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
	//method 
	public void DisplayDetailBubbles() {
		System.out.println("This Bubble have radius " + radius + "& colors :"+color);
	}
	
	
}





//buat class sink 
//tempat cuci tangan 


class Sink {
	private String material; //Sink material ceramic stainless etc 
	
	//constructor 
	public Sink(String material) {
		this.material = material;
	}
	//getter setter 

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	//metbod 
	public void DisplaySinkDetail() {
		System.out.println("This Sink material =" + material);
	}
	
}






/*
 
 
Bathroom 
       field:
            Tub bathtub;
            Sink theSink;
       
       "has A"
          |
 Tub
    field: 
         int size;
         Bubbles b;  
                     
       "has A"
         |
 Bubbles 
     field:
          int radius
          int color;
          
 utk sink dia terpisah jadi yg ada TUb ini ada punya Buble nah si Buble ini dia ada dalam Tub sbgai Field 
 nah nnti yg jadi field di Batroon adalah Tub dan sink 
 kita buat sink dulu class trus buble dllnya dan baru tub baru stlahnya class2 yg dibuat di jadikan field object di BathRoom
 inilah kita buat sbgai compostiion          
          
*/