package _08_MethodPenangananWaktu;
import java.util.Calendar;

public class _02_HariSekarang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pake kurung kurawal kalau declare dgn variable yg diiiskan !
		//ditambahkan "" karena itungan array mulai dari nol!
		String[] hari = {"","Minggu","Senin","Selasa","Rabu","Kamis","Jumat","Sabtu"};
		Calendar hariNow = Calendar.getInstance();
		//langsung dimasukan ke variable hari utk dapat nya dan dan dirpint 
		System.out.println("hari ini sekarang ="+hari[(hariNow.get(Calendar.DAY_OF_WEEK))]);
		

	}

}
