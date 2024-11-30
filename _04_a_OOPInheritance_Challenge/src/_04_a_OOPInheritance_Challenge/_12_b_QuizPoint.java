package _04_a_OOPInheritance_Challenge;

public class _12_b_QuizPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//menentukan titik point 
		Point pointA = new Point(2,4);
		Point pointB = new Point(-12,-9);
		System.out.println("distance point A from 0,0 "+pointA.distance()); //distance dari titik nol 
		System.out.println("distance point A from cooridinate(-3,12) "+pointA.distance(-3,12));
		System.out.println("distance pointA from pointB =" + pointA.distance(pointB));
		
        /*
         distance point A from 0,0 4.47213595499958
       distance point A from cooridinate(-3,12) 12.36931687685298
         distance pointA from pointB =19.1049731745428
         question to chatGPT how to make it this fix number only 3 figit  after dot ?
         example 19.104 ?how to with printf ?
         *
         */
	}

}

class Point {
	private int x,y;
	
	public Point(){}
	public Point(int x,int y){
		this.x  = x;
		this.y = y;
	}
	//getter & setter 
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//jadi ada 3 method 
	//ditance point x,y dari 0,0 
	
	//distance point (x,y) dgn titik default = 0
	//jadi nnti siobject dgn titik yg dibuat 
	//contoh Point point1 = new Point(3,2);
	//point1 berada di (3,2) dan kita mau ukur jarak dari titik nol maka distancenya  = point1.distance();
	//jadi manggil constructor yg gak ada paramnya 
	
	public double distance() {
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
	}
	
	//
	
	public double distance(int x2,int y2) {
		double dx = x2 - 0;
		double dy = y2 - 0;
		return Math.sqrt(Math.pow(dx,2) +Math.pow(dy,2) );
	
	}
	//distance point titk object kita dgn titik object yg lainya ! 
	
	public double distance (Point otherpoint) {
		double dx = otherpoint.getX() - this.x;
		double dy = otherpoint.getY() - this.y;
		return Math.sqrt(Math.pow(dx,2) +Math.pow(dy,2));
	}
}
