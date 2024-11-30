package _04_a_OOPInheritance_Challenge;

public class _06_ConstructorChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //sekranga langusng tembak isi:
		Pegawai pegawai1 = new Pegawai("andra","finance",300,(float) 0.5);
		Pegawai pegawai2 = new Pegawai("houdi","pilot",600);
		
		
	}

	static class Pegawai{
		private String name;
		private String pekerjaan;
		private int gaji;
		private float tax;
		
		public Pegawai() {};
	    
		public Pegawai(String name,String pekerjaan,int gaji,float tax) {
			this.name = name;
			this.pekerjaan = pekerjaan;
			this.gaji = gaji;
			this.tax = tax;
		}
		public Pegawai(String name, String pekerjaan, int gaji) {
			
			this.name = name;
			this.pekerjaan = pekerjaan;
			this.gaji = gaji;
		}
		
		
		//getter setter ;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPekerjaan() {
			return pekerjaan;
		}
		public void setPekerjaan(String pekerjaan) {
			this.pekerjaan = pekerjaan;
		}
		public double getGaji() {
			return gaji;
		}
		public void setGaji(int gaji) {
			this.gaji = gaji;
		}
		public float getTax() {
			return tax;
		}
		public void setTax(float tax) {
			this.tax = tax;
		}
		
		//toString 
		@Override
		public String toString() {
			return "Pegawai [getName()=" + getName() + ", getPekerjaan()=" + getPekerjaan() + ", getGaji()=" + getGaji()
					+ ", getTax()=" + getTax() + "]";
		}
		
		
		
		
	}
}

/*
jadi kita mengenal constructor chain 
tadi diatas sblumnya sudah ada kita bicarakan constructor overloading
nah kalau kita sudah isi param dari sbuah constuctor slah satu yg overloading 
maka otomatis nnti nilai param default bisa dipakai lagi jadi seakang2 field tadi 
sudah default berisi yg sudah diisikan sblumnya sprti kasus diatas 
X(name,pekerjaan,gaji,tax)
X(name,pekerjan,gaji)
X() { }

nah mis kita sisi  X saya = new X("indra","enginer",1000,0.5);
kmduaian buat instance lagi  X kamu  = new X("ahmad","driver");
kalau saya kamu.getTax() pasti sudah defaul itu = 0.5 
dimana disiikan nilai dari field utk tax!


*/