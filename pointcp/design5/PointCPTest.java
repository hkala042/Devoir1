// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

import java.io.*;
import java.util.Random;

/**
 * This class prompts the user for a set of coordinates, and then 
 * converts them from polar to cartesian or vice-versa.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @author Paul Holden
 * @version July 2000
 */
public class PointCPTest{
  
 
  public static void main(String[] args){
	  
	  Random rand = new Random();
	  PointCP5 point1, point2;
	  
	  long start = System.currentTimeMillis();
	  
	  point1 = new PointCP3 (rand.nextDouble(100.0), rand.nextDouble(100.0) );
	  point2 = new PointCP2 (rand.nextDouble(100.0), rand.nextDouble(100.0) );
	  
	  System.out.println(point1.getX());
	  System.out.println(point1.getY());
	  System.out.println(point1.getRho());
	  System.out.println(point1.getTheta());
	  System.out.println("");
	  System.out.println(point2.getX());
	  System.out.println(point2.getY());
	  System.out.println(point2.getRho());
	  System.out.println(point2.getTheta());
	  System.out.println("");
	  
	  long end = System.currentTimeMillis();
	  
	  System.out.println(" Execcution time is "+ (end - start ));
  }
}
