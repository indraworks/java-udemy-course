package _06_a_Array;

public class _01_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //arrays
		int[] arrInts = {26,17,8,9,16};
		boolean[] mybool = {true,false,false,true,false};
		for(int i=0;i <arrInts.length;i++) {
			System.out.println("nilai element dicetak index"+i+" ="+arrInts[i]);
		}
		System.out.println(" ");
		//arrays string 
		String[] arrNames = {"indra","yenni","lucky","alya","raska"} ;
		for(int i=0;i < arrNames.length;i++) {
			System.out.println("nama2 element "+i+"=" + arrNames[i]);
		}
		System.out.println(" ");
		for(int i =0;i < mybool.length;i++) {
			System.out.println("mybool elemment ="+i +"="+mybool[i]);
		}
	}

}

/*
array terditi dari container dalam kontainer ada kotak2 
ram atau tempat adress dimana di beri indexks mulai dari nol (0)
0,1,2,3..dst,ini disebut element arays
cara asign array dgn isinya yaitu dgn kurung kurawal 
utk panjang length element adalah banyak element jadi mis ada aray 0,1,2,3 
berarti ada 4 elem,ents berarti lengt =4 
contoh 2 diatas adalah prakteknya 
cara declare arrays yaitu mis int[] 
arau String[] dll


*/