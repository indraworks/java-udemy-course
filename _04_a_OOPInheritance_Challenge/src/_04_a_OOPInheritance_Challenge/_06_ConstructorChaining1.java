package _04_a_OOPInheritance_Challenge;

public class _06_ConstructorChaining1 {

	public static void main(String[] args) {
		// TODO Au to-generated method stub
		Employee pegawai1 = new Employee();
		System.out.println("Employee1 = "+ pegawai1.getSalary());
		System.out.println(pegawai1.toString());
		Employee pegawai2 = new Employee(300000);
		System.out.println("Employee2 = "+ pegawai2.getSalary());
		System.out.println(pegawai2.toString());
		Employee pegawai3 = new Employee(0.7f,12300);
		System.out.println("Employee3 = "+ pegawai3.getSalary());
		System.out.println(pegawai3.toString());

	}
	


}
class Employee {
	private float tax;
	private int salary;
	
	   public Employee() {
		   this(0.6f,2000); //panggil conttruct ke 3 
	   }
	   public Employee(int salary) {
		   
		   this(0.6f,salary); //panggil constuct ke 3
		   
		   
	   }
	   public Employee(float tax,int salary) {
		   this.tax =tax;
		   this.salary = salary;
	   }
	   //getter setter 
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [getTax()=" + getTax() + ", getSalary()=" + getSalary() + "]";
	}
	   
	   
	}
/*

Apa itu constructor chaining aslinya gini di constructor itu 
kita ini ada default param yg gak mau kita tulis dimana nanitnya sudah default aja 
nah utk itu kita membuat beberapa constructor dalam class yg sama yg sebelumnya kita sebut 
overriding nah 
constructor chaining ini disebut begini yaitu dia bekerja dengan memanggil constructor yg lain 
dimana menggukana kalimat this.(value_default_dipasing keparam ke cosntrucot lain!)
jadi atas dasar ini sebenarnya construvtor chain ITU YTERJADI JADI BUAT VALUE DEFAULT PANGGIL 
KE CONSTUCTOR LAIN YG MASIH SAMA DALAM CLASS casenya kayak diatas saya tulis dibawah :

public class Employee {
    private double tax;
    private double salary;

    // Constructor 1: No parameters (default values)
    public Employee() {
        this(0.5, 1000); // Call Constructor 2 with default values
    }

    // Constructor 2: One parameter (default tax)
    public Employee(double salary) {
        this(0.5, salary); // Call Constructor 3 with default tax
    }

    // Constructor 3: Two parameters (no defaults)
    public Employee(double tax, double salary) {
        this.tax = tax;
        this.salary = salary;
    }

    // Display method to check values
    public void display() {
        System.out.println("Tax: " + tax + ", Salary: " + salary);
    }

Keterangan simak baik2 :
diatas kita ada field tax,salary 
nah di construtor 1  gak ada param,kita hanya mau masukan default value ada 2 yaitu nilai tax default = 0.5 
                     dan nilai salary default 1000 
                     nah utk itu dia siconstuctor ini kerjanya pasing ini value dgn panggil ke constructor3 
                     dengan masukan default tax dan default salary 
                     dengan command this(0.5,7000); 
                     jadi otomatis ini 
                     nah constuctor 3 itu gak ada default value smua adalah param sehingga dia dipanggil dia kerja! 
                     jadi nilai value   2 2nya masuk ke param tax dan salary!
                     public Employee(double tax, double salary) {
                     this.tax = tax;
                      this.salary = salary;
                     }
                     
   pada constructor 2 ada 1 param yaitu salary di construtcor ini dan  utk taxnya dia default dimasukan nilai 0.5 
                      nah sconstructor2 ini panggil keconstructo3 ( ini constructo3 ini artinya urutan dia letak dinawah ya 
                      kalau nama constructor smua sama karena inilah mereka disebut dgn constructor overidding! 
                      
                                     
   pada constructor 3 : TIDAK ADA NILAI DEFAULT Yg ada hanya param saja yg mana berisi param utk variable tax dan salary 
                         jadi si cnstrutor1 berisi 2 default value panggil si dirinya construtor3 ! 
                         jadi si constuctor2 beris 1 default value panggil si dirinya constructor3!
                         
                      nha pada main program kita tinggal instance 
                      contoh pegawai1 kita instance 
                      \
                      Employee pegawai1 = new Employee();
                      //ktika kita panggil ini otomatis krn dlm consrtucor sudah ada default maka otomatis 
                       //pegawai1 punya salary 0.5 dan 7000! 
                         disini artinya constructor 1 yg bekerja( otomatis panggil kconturtor3)
                        
                        
                    kita instance pegawai2 mis pegawai2 ini kita mau taxnya default  dan salarynya kita tentukan!
                     maka    
                     EMployee pegawai2 = new Employee(8900); //kita tinggal isi saja salarynya utk pasing 
                                                             //dan utk tax dia default 0.5 krn otomatis 
                                                              //kita panggil constructor 2 utk kerja 
                                                               //jadi artinya constuctor 2 panggil construvto3 
                                                               
                                                              
                    -kita instance pegawai3 ,nah kita buat taxny ini kita yg tentukan bukan default 
                                             dan salary kita isi tentukan tidak default 
                                             otomatis program langsung jalankan constuctor3 (paling bawah)     
                         
                  EMployee pegawai3 = new Employee(0.12 ,12000);
*/