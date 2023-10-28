



import java.util.Random;


public class BigTest{
	
	
	public static void main (String[] args){
		
		long start = System.currentTimeMillis();
		
		PointCP5 point1, point2;
		
		Random rand = new Random();
		
		for ( int i = 0; i< 1000; i++ ){
			point1 = new PointCP3 (rand.nextDouble(100.0), rand.nextDouble(100.0) );
			point2 = new PointCP2 (rand.nextDouble(100.0), rand.nextDouble(100.0) );
			point1.getX();
	        point1.getY();
	        point1.getRho();
	        point1.getTheta();
	  
	        point2.getX();
	        point2.getY();
	        point2.getRho();
	        point2.getTheta();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(" Execution time is "+ ( end - start ) );
	}
}

	  
			