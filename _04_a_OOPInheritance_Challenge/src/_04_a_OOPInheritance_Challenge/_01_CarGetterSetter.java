package _04_a_OOPInheritance_Challenge;

public class _01_CarGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciate sicar 
		Car car = new Car();
		System.out.println("Car make : "+ car.getMake());
		System.out.println("Car model: "+ car.getModel());
		car.describeCar();
      
	}

}

class Car {
	//disini kita akan buat field yaitu variabel local
	//dlm class nah kita blum buat nnti constructor kita baut manual 
	//nah utk access field2 dibuat private suapay dari luar waktu instance 
	//kita manggil field2 ini dgn method /function sifat publick kita kasih 
	//hetter dan setter sbb: 
	private String make = "Tesla X";
	private String model = "Model-X";
	private String color = "Gray";
	private boolean convertible = true;
	private int doors = 2;
	
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	//utk buat setter dan getter functuon kita bias langusn dari java 
	//dari source-->generate-->setter->getter otomatis bikin 
	//bisa juga ngetik dewe ini smua method public 
	//nah kita bisa buat utk describe utk print2 dgn method syout pada field2 diatas:
	
	//sbnarbaty ada namnay method println yg udah bawaan java dimana smua fields bisa 
	//diprint ! nnti kita bisa bicarakan skrg manual aja 
	
	public void describeCar() {
		System.out.println("this car have : \n" + 
	               "Doors :"+ doors +
	               "models :"+ model +
	               "make :"+make +(convertible ? "Convertibel" : " "));
				
	}
	
	//stlah buat class Car atau blue printnya baru kita buat 
	//omstance oject si car ini 
	
}


/*
dalam 1 file java jika cuman beberapa class kecil gak kompleks kita bisa buat class Lain 
gak perlu buat file class misah dipanggil dari file Mainya 
jadi aman ini utk studi saja ngejar track!


*/