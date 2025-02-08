package _06_a_Array;

import java.util.ArrayList;

public class _04_ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList myarrayCampur = new ArrayList();
		myarrayCampur.add(34);
		myarrayCampur.add("Cow");
        myarrayCampur.add("Cheetah");
        myarrayCampur.add(78);
        System.out.println(" check print all ");
        //kita pakai type object jika mau print yg ArrayList yg gak ada typedatanya !/campur
        for(Object x:myarrayCampur) {
        	System.out.println(x);
        }
        //check jika ada 34 maka kita delete 
        if(myarrayCampur.contains(34)) {
        	//myarrayCampur.remove(0);
        	//kalau delete myarrayCampur.remove(34) ini gak bisa maka kita harus cast dulu jadi integer jadi kita tulis 
        	//sebgai integer sbb:
        	//myarrayCampur.remove((int) 34); //itu cara casting ke integer! 
        	myarrayCampur.remove((Integer) 34); //atau myarrayCampur.remove((Integer) 34); 
        	//ini bukan yg kecil ingeger karena ini object! 
        	
        	System.out.println("berhasil remove !");
        	System.out.println("data sekarang :");
        	for(Object x:myarrayCampur) {
        		System.out.println(x);
        	}
        } else {
        	System.out.println("data tidak ditemukan!");
        }
	}

}

/*
utk practivalnya jika campur arraynya kita cukup gak uasah kasih type 
mis Arraylist myarrayCampur = new ArrayList(); 
bisa kita add myarrayCampur.add(34);
              AmyarrayCampur.add("Cow");
              myarrayCampur.add("Cheetah");
              myarrayCampur.add(78);



*/