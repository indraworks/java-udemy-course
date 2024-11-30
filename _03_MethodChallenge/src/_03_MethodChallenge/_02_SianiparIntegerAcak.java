package _03_MethodChallenge;
import java.util.Random;

public class _02_SianiparIntegerAcak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Random angkaAcak = new Random();
      
       //dadu di loop atau di lempar 20x 
       int face; //mnyiapakan tampungan nnti diisi random 
       for(int i=1;i <= 20;i++) {
    	   //System.out.println("melempar dadu ke "+i);
    	  face = 1 + angkaAcak.nextInt(6);
    	 System.out.printf("% d ",face);
    	 if(i % 5 == 0) {
    		 System.out.println();
    		 System.out.println();
    	 }
       }
	}

}


/*

jadi kita akan buat random nah functuon /method  random ini 
bisa di import dari java.util bisa di import dari class Math random utk class Math random
hanya hasilkan utk type integer ,
beda kalau kita ambil dari java.util yg bisa random oada type:
byte,float,double,int,long 
utk statement berikut :
  import java.util.Random 
  Random angkaAcak = new Random();
  int nilRandom = angkaAcak.nextInt();
  //nah statament nilRandom ini akan menampung dari angkaAcak.nextInt(); 
   //yg mana nilainya mulai -2 milyar ke +2milyar inilai tsb dibangkitkan sbarang ! 
    jika kita mau batasi kita bias tulisa batasanya mis 2 
    maka probanbilitas acak yg keluar adalah hanya 0,1 
    mis dibatas angka 7 maka probanilotas angka acak yg kelauar dalah : 0,1,2,3,4,5,6 
    contoh 
    int angkaRandom = angkaAcak.nextInt(7);
    utk misalkan dadu itu mulai dari 1 kita bisa tambahkan angka fix mis 1+angkaAcak.nextInt(6);
    angka yg tertulis dalam kurung adalah angka pembatas/maks tidak disertakan dalam kluaran random


*/