package _05_a_OOP_Polimorphisme;

public class _05b_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ComputerCase theCase = new ComputerCase("3308","Dell","220");
     Monitor themonitor = new Monitor("23Inch","Polytron",27,"2540X1440");
     Motherboard theMotherboard = new Motherboard("BX-440","Asus",4,6,"v.9.7");
     //nah baru 3 3 diatas object kita masukan pada instansiate watku buat object PersonalCOmputer 
     _05_b_PersonalComputer thePC1 = new _05_b_PersonalComputer("3308","Dell",theCase,themonitor,theMotherboard);
     
      thePC1.powerUp();
      //kita bisa access dgn get object pada class dari situ kita bisa access method class tsb!!
      thePC1.getMonitor().drawPixelAt(30, 79, "Yeloow");
      thePC1.motherBoardLoad();
      
    
	}

}

/*
jadi utk class2 ComputerCase,monitor motherboard kita buat smua objectnya 
stlahnya pada Class ComputerPersonal baru kita masukan pada instanciate objectnya 
maka ini disbyt compostion jadi kita gak melulu inheritance yg sifatnya nya kaku 
nah jadi utk Product smua sama dibuat abstact yg mana nnti field supernya dipakai sama anak2 ( child class)
disin Model dan manufaktur

nah utk class2 Monitor,ComputerCase,Motherboard smua inheritance( extend dari product) 
nah stlahnya kita buat class Personal computer dimana si object dari 
Monitor,ComputerCase,Motherboard adalah field2 private dari class PersonalCOmputer 
nah sbb:

private ComputerCase computerCase;
	private Monitor monitor;
	private Motherboard motherboard;

nah tadi kan jadi field otomatis pada PersonalCOmputer ini field2 dari class computerCase,Monitoer,motherboard
kita bisa gunakan getter ,dari source kita pakai getter contoh :

public ComputerCase getComputerCase() {
		return computerCase;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public Motherboard getMotherboard() {
		return motherboard;
	}

nah nnti jika kita mau access pada saat kita instance object PersonalCOmputer sbut saja PC1 
maka otomatis kita bisa access method2 dari masing2 class yg jadi field di Personalcomputer 
tinggal sbut  PC1.monitoer.method() 
atau mau access method motherboard maka 
contoh:
 thePC1.getMonitor().drawPixelAt(30, 79, "Yeloow");
      thePC1.motherBoardLoad();



*/