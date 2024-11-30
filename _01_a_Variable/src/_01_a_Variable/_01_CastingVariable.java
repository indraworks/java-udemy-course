package _01_a_Variable;

public class _01_CastingVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //contoh narowwing 
		int uangKecil =0;
		double uangBesar = 2000745220;
		uangKecil = (int) uangBesar;
		System.out.println("hasil narowing isi uang kecil "+uangKecil);
		System.out.println("hasil narowing isi uang Besar "+uangBesar);
		int uangkecil = 2000;
		int uangbesar = uangkecil; //ini disebut casting widening 
		//otomatis gak maslah krn tyepdata dari kecil di covert ke type data besar! 
		//yg ini tanpa kurung langsung saja 
		
	}

}

/*
dijava kita mengenal system casting yaotu perubahan type data variable 
dari satu ke lainya nya misalkan ada variable sbut saja uang
dgn awalnya double ,kmudian ada variable lain mau tampung isi si variable uang 
mis b  contoh : double uang = 200007845;//200jt ukt int maks 2.7miliar 
nah si var b int mau tampung maka sbb:
int b = (int) uang;
//konsekwensinya adalah nnti ada data dari nilai yg dari type besar mis double ke kecil int 
 * 
 */




*/