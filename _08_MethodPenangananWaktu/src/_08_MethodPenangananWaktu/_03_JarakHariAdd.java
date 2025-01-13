package _08_MethodPenangananWaktu;

import java.util.Calendar;

public class _03_JarakHariAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] bulan = {"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nop","Dec"};
     Calendar waktu = Calendar.getInstance();
     //waktu kita setTime utk supaya hindari casting kalau gak pakai clone 
     //jadi buat veriable mis futureDate 
  
     //set time sekarang utk future ,dapatkanya dari waktu.getTime() //ambil time saat ini 
     
     Calendar sekarang = Calendar.getInstance();
     Calendar futureDate = Calendar.getInstance(); // New instance
     futureDate.setTime(sekarang.getTime()); // Copy the time from sekarang
     //System.out.println("futureDate ="+futureDate);
     System.out.println("Hari tanggal sekarang ="+futureDate.get(Calendar.DATE)+"-"+bulan[(futureDate.get(Calendar.MONTH)+1)]+
     		"-" + futureDate.get(Calendar.YEAR));
     futureDate.add(Calendar.DATE, 60);

     
     //nah yg sekarang waktu sekarang ke 60 hari kedepan jatuhnya hari apa?
     //futureDate.add(Calendar.DATE,60);
     //kita print 
   
   
    System.out.println("Hari tanggal setlah 60 days (jatuh tempo)="+futureDate.get(Calendar.DATE)+"-"+bulan[(futureDate.get(Calendar.MONTH)+1)]+
    		"-" + futureDate.get(Calendar.YEAR));
     
     //System.out.println("tanggal sekarang  ="+waktu.get(Calendar.DATE));
	}

}

/*
pada java utk system perbedaan waktu atau lamanya adalah dgn memakain 
objCalendar.add(Calendar.DATE,jarak_waktu )
jadi misalkan ada orang pensiun hari ini maka dia dapt tunjangan pensiun 2bln sesudahnya maka dia terima itu kluar 
tanggalya 60 hari sesudah pensiun misal ini ya!

dgn clone maka harus di casting ke calendar krn object yg beda :
//tanda kurung calendar  --->(Calendar) itu casting sma sprti kalau 
// casting dari long ke int maka  int baru = (int) dataLong; 
 //yg mana dataLong adalah long dataLong;
 

Calendar futureDate = (Calendar) sekarang.clone();
      //stlahnya baru bisa kita buat add 
      futureDate.add(Calendar.DATE, 60); //add 60 days to sekarang/currentDate 
      //ini model smacam x = x +60;
      //nah skenga kita baru print utk futureDatenya stlah diadd! 
      
      System.out.println("Tanngalsetelah 60 hari  ="+futureDate.get(Calendar.DAY_OF_MONTH)+"/"+ futureDate.get(Calendar.MONTH)+"/"+futureDate.get(Calendar.YEAR));



*/