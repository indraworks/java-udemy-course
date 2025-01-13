package _05_b_OOP_PolimorphismeChallenge;

public class _01_SmartKitchen {
	//stlah buat class dbawah kita buat feldObject tiap2 class tbs sbgai field vraibel dibawah ini :
	CoffeMaker coffeemaker;
	Refrigrator refrigator;
	Diswasher diswasher;
	
	//stlahnya buat getter atau setter kita hanya buat getter krn setter sudah masing3 diclass masing2(lokal)
	public CoffeMaker getCoffeemaker() {
		return coffeemaker;
	}
	public Refrigrator getRefrigator() {
		return refrigator;
	}
	public Diswasher getDiswasher() {
		return diswasher;
	}
	
	//buat constructor  tanpa variable 
	public _01_SmartKitchen() {
		coffeemaker= new CoffeMaker();
		refrigator = new Refrigrator();
		diswasher = new Diswasher();
	}
	
	
	
	//setting state utk stiap class yg di composisi 
	//yg artinya juka true maka class /element composition bekerja 
	//smua state kita setting 
	
	//DIANJURKAN KALAU CUMAN true dan false harus pakai primitive boolean,Kalau Boolean kita harus check Null dulu !!
	//maslah sama performance juga dan avoid risk jadi kita ganti smua dibawah ini dgn boolean dari Boolean!!
	
	
	
	public void setSmartKitchenState(boolean coffeFlag,boolean refriFlag,boolean diswasherFlag) {
		coffeemaker.setHasWorkTodo(coffeFlag);
		refrigator.setHasWorkTodo(refriFlag);
		diswasher.setHasWorkTodo(diswasherFlag);
	}

	
	//method  smartKitchen 
	public void doSmartKitchen() {
		coffeemaker.brewCoffee();
		refrigator.orderFood();
		diswasher.doDishes();
	}
	
	
	
	

}


class CoffeMaker {
	private boolean hasWorkTodo;
	public void setHasWorkTodo( boolean hasWorkTodo) {
		this.hasWorkTodo = hasWorkTodo;
	}
	//method 
	public void brewCoffee() {
		if(hasWorkTodo) {
			System.out.println("Brewing Coffee");
			hasWorkTodo = false;
		}
	}
}

class Refrigrator {
	private boolean hasWorkTodo;
	public void setHasWorkTodo(boolean hasWorkTodo) {
		this.hasWorkTodo = hasWorkTodo;
	}
	
	//method 
	public void orderFood() {
		if(hasWorkTodo) {
			System.out.println("Ordering food");
			hasWorkTodo = false;
		}
	}
	
}

class Diswasher {
	
	private boolean hasWorkTodo;
	//setter 
	public void setHasWorkTodo(boolean hasWorkTodo) {
		this.hasWorkTodo = hasWorkTodo;
	}
	
	//method 
	public void doDishes() {
		if(hasWorkTodo) {
			System.out.println("Washing dishes");
			hasWorkTodo = false;
		}
	}
	
}

/*
ini sama dimisalkan kita punya 3 class dalam kicthen kita 
ada bagian mesin_kopi,ada bagian_bersih,ada kulkas nah ini kita mau compostion 
3 class yg kita buat ini nnti akan kita jadikan field di pada class yg kita buat 
dan masing2 methodnya kita bisa access dgn kita buat getter pada field2 object masing2
class yg udah kita buat pada class Utama yaitu SmartKicthen 
- 
stiap class cofemaker,refrigrator,diswasher ada field boolan variable hasWorkToDo
yg mana kalau true dia kerja sesuai function masing2 




*/

/*
 * PENJELASAN KENAPA KITA MESTI PAKAI boolean primitive daripada Boolean berikutL
 * o its better use primitive boolean than Boolean?why?
ChatGPT said:
ChatGPT
Yes, it is generally better to use the primitive boolean instead of the wrapper class Boolean in most cases, especially when you do not explicitly need the additional functionality that Boolean provides. Here’s why:

//////////////////
1. No null Values
//////////////////
Primitive boolean: Always has a value (true or false). No chance of null.
Wrapper Boolean: Can be null, which introduces the risk of NullPointerException if not handled properly.
Example of the issue:

Boolean hasWorkTodo = null;
if (hasWorkTodo) {  // NullPointerException!
    System.out.println("Work to do");
}
Using boolean avoids this risk entirely.


//////////////////////////
2. Better Performance
//////////////////////////
Primitive boolean: More efficient because it is stored directly as a single bit or byte, depending on the implementation.
Wrapper Boolean: Adds overhead because it is an object, requiring memory for the object header and an additional layer of indirection. Boxing and unboxing between Boolean and boolean also impact performance.
3. Simpler Code
With boolean, you don't need to write additional checks to handle null values. This simplifies your logic:


boolean hasWorkTodo = false;  // Always initialized, no null handling needed
if (hasWorkTodo) {
    System.out.println("Work to do");
}
With Boolean, you must handle null:


Boolean hasWorkTodo = null;
if (hasWorkTodo != null && hasWorkTodo) {
    System.out.println("Work to do");
}

 * 
 * 
 * 
 * 
 */


