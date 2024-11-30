package _04_a_OOPInheritance_Challenge;

public class _07_Reference_Vs_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*
biar paham dari ppt :
   missal buat class House ada field string color 
   new House("red");
   //ini diatas kita create objects dimemory tapi kita tak bisa access dsana sudah ada 
    //object tsb trcipta dan ada no memory address tapi ktia tak tahu ktn tak ada reference 
     //yg menujukan dimana lokasinya  
      
    //nah yg ini :
     House redHouse = new House("red") 
     ini diatas artinya trcreate onbject di memory dan direferencsikan pada variable redHouse
                        supaya tahu addressnya . 
                        
     House NewHouse = redHouse; //ini artinya object newHouse mendapatkan copian reference 
                                //alamat memory dari object house yg dibuat /bserta propertynya yaotu red (colornya)                
     
    jadi kalau di redHouse.getColor  //hasilnya akan red 
    jadi misalkalau redHouse saya setColornya maka otomatis juga si newHouse akan sama warnia berubah karena mereka ini berada
    pada reference suatu object adress memory yg sama! 
    contoh :
    
    redHouse.setColor ="blue";
    hasil:
    redGouse.geColor; //blue 
    newHouse.getHcolor; //blue;
    
                 



*/