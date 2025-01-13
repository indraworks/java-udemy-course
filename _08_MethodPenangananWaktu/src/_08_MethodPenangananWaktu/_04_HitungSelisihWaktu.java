package _08_MethodPenangananWaktu;
import java.util.Calendar;

public class _04_HitungSelisihWaktu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Calendar waktuA = Calendar.getInstance();
     Calendar waktuB = Calendar.getInstance();
     
     waktuA.set(2014,Calendar.MARCH,6,12,30,23);
                //urutan set tahun,bln,tgl,jam,menit,detk
     waktuB.set(2023,Calendar.DECEMBER, 7,12,11,15);
     
     //smua dijadikan milisecond :
     //milidetikdlmsehari  
     long mildetikdlm1Sehari = 24*60*60*1000;
     long mildetikdlm1Jam = 60*60*1000;
     long wA = waktuA.getTimeInMillis();
     long wB = waktuB.getTimeInMillis();
     long selisihAB = wB -wA;
     
     int selisihHari = (int)(selisihAB /mildetikdlm1Sehari);
     int selisihJam = (int) (selisihAB/mildetikdlm1Jam);
     
     System.out.println("hasil perbedaan waktu A-B = dalam hari : "+selisihHari+" dan  dalam jam :"+selisihJam);
	}

}

/*
kita mau bedakan hari dan tanggal berpa lama hari jam di 2 waktu yg berbeda 
utk hal tsb maka diubah smua ke possi milisecond baik untuk hari dan utk jam 


*/