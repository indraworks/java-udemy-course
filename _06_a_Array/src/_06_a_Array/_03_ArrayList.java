package _06_a_Array;

import java.util.ArrayList;

public class _03_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList 
		ArrayList<String> animalsArray = new ArrayList<>();
		animalsArray.add("Dog");
		animalsArray.add("Monkey");
		animalsArray.add("Cat");
		animalsArray.add("Crocodile");
		animalsArray.add("Harimau");
		
       //cara print ( for(Typedata namaOb:nameArrayLis){doAction}
		for(String animal:animalsArray) {
			System.out.println("name of animals ="+animal);
		}
		//utk remocve bisa dgn index atau nama element contoh 
		System.out.println("print yg baru :");
		animalsArray.remove(3); //remove crocodile
		animalsArray.remove("Monkey"); //remove element name  Monkey
		System.out.println("print yg baru  hasil remove !:");
		for(String animal:animalsArray) {
			System.out.println("name of animals ="+animal);
		}
		//check jika ada content bernama Crocodile 
		//jika tidak ada tambahdgn chicken kita print lagi 
		
		if( animalsArray.contains("Crocodile")) {
			System.out.println("ada crocodile element");
		} else {
			System.out.println("tidak ada crocodile tambah chicken");
			animalsArray.add("Chicken");
			for(String animal:animalsArray) {
				System.out.println(animal);
			}
		}
		System.out.println("utk lengt kita guna animalsArray.size() :"+ animalsArray.size());
		
		
	}

}


/*
 * ukt arrayList kita gunakan libtary javautils
 * arraylist bersifat dinamic jadi kita gak mematok berapa ruang yg dibuat! 
 * ArrayList<typedata> namaObj = new ArrayList<>() 
 * contoh diatas 
 * nah di araylist ini ada banyak method 
 * Add() utk add element
 * remove utk remove element 
 * contain apa ada element yg di cari 
 * fornya sudah bisa pakai nama pengganti  
 * 
 * mis for(element:ArrayNama) {doAction }
 * 
 * 
 * 
*/
