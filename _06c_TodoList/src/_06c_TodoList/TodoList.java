package _06c_TodoList;

public class TodoList {
	public static String[] model = new String[10]; // kita arrange data/model yg digunakan array 10 element 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testShowTodoList();
		//testAddTodoList();
		testRemoveTodoList();
		    
	}
	
	//method tampil 
	//kita pakai loop biasa bukan paka fpr(x:model) {} krn kit abutuh 
	//utk index jadi kita pakai var saja 
	public static void showTodoList() {
		System.out.println("TODO LIST :");
		for(var i= 0;i< model.length;i++) {
			var todo = model[i];
			var no = i+1;
			System.out.println(no +". "+todo);
		}
		
		
	}
  
	public static void testShowTodoList() {
		model[0] = "Belajar Java basic";
		model[1] ="Belajar springboot";
		showTodoList();
	}
	
	//adding todolist 
	public static void addTodoList(String todo) {
		//kita buat flag apakah sudah array element penuh? 
		var iFull = true;
		for(var i=1;i< model.length;i++) {
			if(model[i] == null) {
				iFull = false;
				break;
			}
		}
		
		
		//jika sudaj penuh kita resize ukuran array kita 
		if(iFull) {
			//model masuk ke temp 
			String[] temp = model;
			//model skrang dibesarkan 
			model = new String[model.length*2];
			//sekarang temp yg berisi model aray yg lama blum dibesarkan diisikan 
			//ke model yg udah tambah 
			for(var i=0;i <temp.length;i++) {
				model[i] = temp[i];
			}
			
			
		}
		
		
		//check dulu apakah masih ada kosong apa tidak 
		for(var i=0;i < model.length;i++) {
			if(model[i]== null) {
				model[i] = todo;
				break; //utk hindari terus ditulis
			}
		}
	}
	
	//kita testAdd todolist apa bisa dia kan diatas 10 kita buat resize sd 25 
	public static void testAddTodoList() {
		for(int i=0;i<25;i++) {
			addTodoList("this todo ke:" + i);
		}
		showTodoList();
	}
	
	
	//remove todolist 
	public static boolean removeTodoList(Integer value) {
		//yg kita haus adalah isi dariarray tsb atau elementnya 
		//jika index > dari lenth
		if((value-1) >= model.length) {
			return false;
			//jika isi element  kosong/sudah kehapus
		} else if (model[value-1] ==null) {
			return false;
		} else {
			//kita update array[index yg dihapus
			//dgn cara beri null
			//model[value-1] = null;
			//** kita buat logic baru dimana array yg didelete itu diskip 
			//atau dihilangkan indexnya muter kekiri naik keatas jadi index+1 nya 
			//mengisi index sebelumnya ,dan index yg didelete tak ada daftar 
			for(var i=(value-1);i< model.length;i++) {
				//jika ada diujung yg didelete maka langung kasih nul 
				if(i == (model.length -1)) {
					model[i] = null;
				} else {
					model[i] = model[i+1];
				}
				
				
			}
			return true;
		}
		
		
	}
	
	//kita coba manual utk lakukan testTodolist 
	//kita ada array 20 tadinya (maks) 
	//utk yg skeang kita isi aray ada 4 jadi ada 4 array yg trisi
	//kita coba check utk operasi ini apda func removeTodoList(Integer value)
	
	public static void testRemoveTodoList() {
		addTodoList("satu");
		addTodoList("dua");
		addTodoList("tiga");
		addTodoList("empat");
		addTodoList("lima");
		var result = removeTodoList(20); //hasil result pasti false
		System.out.println("hasil result ="+result);
		
		//diatas sampai 4 kita mau delete array ke 5 maka nnti hasil = false 
		
		//kita coba remove yg data ke-2 
		//result = removeTodoList(2);
		result = removeTodoList(5);
		System.out.println(result);
		showTodoList();
		
	}
	
	//kita juga buat viewnya  menampilkan view todoList
	public static void viewShowTodoList() {
		
	}
	
	//menampilka view menambah todo list 
	public static void viewAddTodoList() {
		
	}
	
	//menampilkan view manghapus todoList 
	public static void viewRemoveTodoList() {
		
	}
	
}


/*

dijava ada 3 yg sering kita pakai var ,type inferer sbb:
 Use var When:
The type is obvious from the assignment

var name = "Alice";  // Compiler infers String
var age = 30;        // Compiler infers int
For complex generic types to reduce verbosity

var map = new HashMap<String, List<Integer>>();  // Inferred as HashMap<String, List<Integer>>
When declaring loops

var list = List.of("Java", "Kotlin", "TypeScript");
for (var item : list) {
    System.out.println(item);  // item is inferred as String
}




*/