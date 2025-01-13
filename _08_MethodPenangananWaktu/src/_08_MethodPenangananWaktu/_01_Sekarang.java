package _08_MethodPenangananWaktu;
import java.util.Calendar;

public class _01_Sekarang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Calendar sekarang = Calendar.getInstance();
      System.out.println("Sekarang hari dalam bulan : "+sekarang.get(Calendar.DAY_OF_MONTH));
      System.out.println("Sekarang  dalam bulan : "+(sekarang.get(Calendar.MONTH)+1  ));
      System.out.println("Sekarang  dalam tahun : "+sekarang.get(Calendar.YEAR));
      System.out.println("sekarang hari ini date/tanggal :"+sekarang.get(Calendar.DATE));
      System.out.println("sekarang dalam HOUR:MINUTE:SECOND = "+ sekarang.get(Calendar.HOUR)+":"+sekarang.get(Calendar.MINUTE)+":"+sekarang.get(Calendar.SECOND));
      System.out.println("sekatang nama hari ini  :"+sekarang.get(Calendar.DAY_OF_WEEK)); //6 utk ubah kita gunakana array 
      //System.out.println("sekatang nama hari ini  :"+ sekarang.add(Calendar.DATE, 60));
      //ini gak bisa sepetri ini harus di clone() dgn object method clone() stlahnya harus casting ketipe object Calendar jadinya sprti ini dulu 
      
      Calendar futureDate = (Calendar) sekarang.clone();
      //stlahnya baru bisa kita buat add 
      futureDate.add(Calendar.DATE, 60); //add 60 days to sekarang/currentDate 
      //ini model smacam x = x +60;
      //nah skenga kita baru print utk futureDatenya stlah diadd! 
      
      System.out.println("Tanngalsetelah 60 hari  ="+futureDate.get(Calendar.DAY_OF_MONTH)+"/"+ futureDate.get(Calendar.MONTH)+"/"+futureDate.get(Calendar.YEAR));
;     
      
      //pada program ke 2 
      
      //utk MONTH kita tambahkan 1 krn get(Calendar.MONTH) hasilkan integer 0..11;
      //itu dalam kurung (1 object) +1 gak bisa dluar hasil beda!
	}

}

/*
 * java gak ada waktu type data nah kita gunakan class Calendar dan kita buat 
    variable instancenya adalah object baru nnti dalam class tsb ada methdo2nya 
    tadi stlah diinstance yg berhubungan dgn waktu 
 
 
 
 */


