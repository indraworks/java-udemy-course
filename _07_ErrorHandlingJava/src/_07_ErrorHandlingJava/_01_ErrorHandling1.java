package _07_ErrorHandlingJava;

public class _01_ErrorHandling1 {
	
	public static void main(String[] args) {
		float sum = 0;
		for( String argument :args) {
			//kita pasang try disini 
			try {
				//jadi nnti run pilihan run configuration nnti ada pakai argument 
				//masukan nilai sebarang dgn space contoh 1 2 89 
				//atau masukan dgn format beda contoh: 9 2x 3 nnti akan kluar rrror  
				
				sum = sum + Float.parseFloat(argument);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception message "+ e.getMessage());
			}
		}
		System.out.println("Sum are = "+ sum);
	}

}


/*
kita akan praktek denga cara masukan nilai2 angka2 nah nnti program akan medeteksi jika ada error 
jika tanpa try catch maka program akan stack dan tidak selesai 
makanya kita menggunaan handling error 
dgn cara try catch 
latihan pakai abdul kadir 
stlahnya kita ke array latihan 
stlahnya ke collection array list 
stlahnya baru kita ke interface 


*/


/*
diatas pada saat kita run pilihannya run configuration 
disana tab argument masukan angka2 dengan spasi baru nnti keluar 



*/