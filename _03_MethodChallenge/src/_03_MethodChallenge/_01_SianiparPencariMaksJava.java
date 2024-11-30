package _03_MethodChallenge;
import java.util.Scanner;


public class _01_SianiparPencariMaksJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //instance obj scannmer dari command window 
		Scanner input = new Scanner(System.in);
		//meminta mauskan dari pengguna 
		//ini utk print dia akan ambil perspasi jika dgn scammer 
		System.out.print("Masukan 3 ngka decimal yg dipisah dgn spasi ");
		double inputSatu = input.nextDouble();
		double inputDua = input.nextDouble();
		double inputTiga = input.nextDouble();
		//mentukan nilai maximun 
		//double nilaiHasilMax = cariMaks(inputSatu,inputDua,inputTiga);
		double nilaiHasilMax = cariMaxMath(inputSatu,inputDua,inputTiga);
		System.out.println("hasil nilai maks = "+nilaiHasilMax);
	}
	
	public static double cariMaks(double x,double y,double z) {
		double nilMax = x;
		if (y > nilMax) {
			nilMax = y;
		}
		if (z > nilMax) {
			nilMax = z;
		}
		return nilMax;
	}

	 public static double cariMaxMath(double x,double y,double z ) {
		 //pakai rumus dgn cara pakai Math class 
		 return Math.max(z, Math.max(y, x));
				 
	 }
}
