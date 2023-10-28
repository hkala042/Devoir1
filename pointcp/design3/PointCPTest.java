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

public class PointCPTest
{
  


 
  public static void main(String[] args){
	  
	  Random rand = new Random();
	  PointCP3 point = new PointCP3 ( rand.nextDouble(100.0), rand.nextDouble(100.0) );
	  
	  System.out.println(point.getX());
	  System.out.println(point.getY());
	  System.out.println(point.getRho());
	  System.out.println(point.getTheta());
  }
}