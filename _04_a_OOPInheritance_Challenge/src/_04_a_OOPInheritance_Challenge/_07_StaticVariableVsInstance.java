package _04_a_OOPInheritance_Challenge;

public class _07_StaticVariableVsInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//penjesalan pemakaian class dog! 
		Dog rex = new Dog("hungWeng");
		Dog pluffy = new Dog("pluffy");
		System.out.println("hasil rex name:");
		rex.printName(); //hasil rex 
		System.out.println("hasil pluffy name: ");
		pluffy.printName();
		
		//penjelasan pemakaina class InstanceDog 
		

	}

}
//ini contoh static variable 
class Dog {
	private static String name;
	
	public Dog(String name) {
		//utk static dia panggil nama Classnya bukan dirinya si field object 
		//bukan this.name = name; KARENA STATIC jadi Dog.name = name;
		Dog.name = name;
		
	}
	public void printName() {
		System.out.println("name ="+name); //harus gunakan Dog.name //nama class dan .variable staticnya!
	}
}

class InstanceDog {
	private String name;
	
	public InstanceDog(String name) {
		this.name = name; //memakai kata this utk melekatkan variable ini pada object yg dibuat
	}
}


/*bagian class DOg penjelasan:
 * Pejelasan diatas di bahas lebar dgn chatGPT :
 * https://chatgpt.com/c/674425ab-c0f0-8005-97df-d86e6623bf69
 * intinya ketika kita buat static variable pada class maka hanya ada 1 alamat memeory yg semuanya itu dishare 
 * yg nntinya dipakai "direferesikan pada tiap2 object yang akan gunakan reference dari variable tsb (alamat memorynya_
 * nah diatas hasilnya sprti ini :
 * hasil rex name:
name =pluffy
hasil pluffy name: 
name =pluffy

yg pertaman variable static name = :huang feng" 
nah ini direferensikan ke object rex yg gunakanya ! 
nah ktika ada object pluf  baru dibuat dgn variable name tadi diubha menjad plufy 
nah karena alamat adress ini static dia adrssnya hanya 1 utk satu pencetak class dan dshare kemua object yg buat maka 
otomatis si vriable tadi berubah namnay menjadi plufy nah krn ini otomatis  isi valuenya berubah dari huang feng menjadi plufy
otomatis si object yg gunakan variable name static ini menjadi berubah karena INGAT static itu hanya 1 memory adress di share kemsua
anggota object yg instance pada class tsb jadi otomatisjika name valuenya update terakhir maka smua angota 
object yg gunakan variable static diclass ikut trupdate!
 */

/*
 * Penjelasan Instance Dog :
 * ingat kalau variable utk instance dia tidak ditulsi depannya public static tapi private utk masing2 refer pada 
 * isntance atau object yg dibuat pada class dan speti biasa diatas masing2 name diatas refer pada alamat memory yg berbeda dan direferensikan 
 * pada object yg memakai/menggunakan memori tsb /dishare/direferensikan  pada variable yg melekatp pada  object tsb!agar bisa diketahui nilainya 
 * jika hanya begini new InstanceDog() //ini artinya create object dan tlah trbuat dgn lokasi alamat memory tertentu 
 *tapi gak bisa diakses utk itu maka dibutuhkan variable yg diasing keobject utk mereferensikan alamat object yg dibuat tsb dan bisa diakses lewat variable 
 * yg melekat pada object tsb /di assingn oleh variable object tsb!!
 * 
 * 
