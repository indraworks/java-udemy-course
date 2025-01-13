package _08_MethodPenangananWaktu;
import java.util.Calendar;
public class _03a_JarakHariCaraClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar sekarang = Calendar.getInstance();
		Calendar futureDate = Calendar.getInstance(); // New instance
		futureDate.setTime(sekarang.getTime()); // Copy the time from sekarang
		futureDate.add(Calendar.DATE, 60);
        System.out.println(futureDate.get(Calendar.DAY_OF_MONTH));
        System.out.println((futureDate.get(Calendar.MONTH)+1));
        System.out.println(futureDate.get(Calendar.YEAR));	  
	}

}
