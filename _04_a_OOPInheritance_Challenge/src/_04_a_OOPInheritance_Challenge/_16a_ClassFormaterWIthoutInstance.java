package _04_a_OOPInheritance_Challenge;

public class _16a_ClassFormaterWIthoutInstance {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
   
		
		//1 contoh basic formating 
		 final float myvalue1 = 2.345698f;
		 final int myvalue2 = 3478;
		 System.out.printf("\nyour value :%.2f, your value2:%-8d",myvalue1,myvalue2);
		 System.out.println("\nsimbol bawah : ");
		 System.out.printf("Value:\t\u0025d%n", 25); // Tab followed by percent symbol and a number
		 System.out.printf("Value:\u0025%%d",250); // Tab followed by percent symbol 
		 
		 //contoh 2 ket-nya dibawah :
		 final float myberas = 89.49504936509f;
		 System.out.printf("\nharga beras saat ini:\t%10.3f",myberas); 
		 //yg ini -8 rata kiri :
		 final float myberas2 = 3345.504936509f;
		 //ingat persen n atau %n adalah stlahnya ganti baris !
		 System.out.printf("\nharga beras saat ini:\t%-8.3f%n",myberas2);
		 
		 final int nilai=2000;
		 System.out.printf("saya terima hadiah sebesar: %-8d%n",nilai);
		 
		 //contoh pemakaian Unicode backslas u :
		 //ini hasilnya \u03A9 ===> % dan utk %n itu pindah baris sbb:
		 System.out.printf("Greek letter Omega: \u03A9%n");
          //hasil : 
		 
	}

}

//INI MAKSUDNYA TANPA PAKE New Formater langsung direct pakai printf!

/*
keterangnanya :

general syntact sama dgn class Formater tapi yg ini dia internaly ya gak pakai new Formater
lagsng printf saya ulangi pernyataan saya diatas:
%[argument_index$][flags][width][.precision]conversion]

Components:
argument_index$: Specifies which argument to format (1-based index).
flags: Adjusts output format (e.g., - for left justification, + to include sign).
width: Minimum number of characters for the output.
.precision: Specifies precision for floating-point values or maximum character length for strings.
conversion: Indicates the type of value to format.
Common Conversion Characters:
d: Decimal integer (e.g., %d for an int).
f: Floating-point number (e.g., %f for a double).
s: String (e.g., %s for a string).
t: Date/Time (e.g., %tY for the year).
x or X: Hexadecimal integer.
o: Octal integer.

contoh2 pemakaian :
JADI ppoint pentingnya adalah kalau stlah tanda % maka harus ada angka besar space ruang yg dipakai mis 8 7 3 dll
nah angka - ( minus) sbgai tanda untuk tahu dia ada rata kiri atau rata kanan,
nah utk float misal maka : "%-10.3f" artinya akan diberikan space 8character kepada variable float sbanyak 8 rata kiri 
nah angka .3 ( yaitu angka 3 stlah dot artinayh 3 angka dibelakang koma contoh 

sysout.prinft("harga beras saat ini \t%-10.3f,89.49504936509f) 
hasilnya : hasil berasa saat ini : 89.433

contoh 1:
 %-10d:

%d: Formats myvalue2 as a decimal integer. d ini utk decimal integer beda sama f utk decimal pecahan 
-: Left-aligns the output.
10: Ensures the field has a minimum width of 10 characters.(besar spacenya )
 final int nilai=2000;
 sysout.prinf("saya terima hadiah sebesar %-8d",nilai);
 
 /////KETERANGAN KETERANGAN TAMBAHAN :
\n utk pindah baris  
\t utk tab 
slice u .kalau saya tulis eror artinya ini unicode 4 angka hex 
yg mana nnti bentuk caracter outputnya! 
\\ insert backslach 

\" insert doublequote 


*/