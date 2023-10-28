

import java.lang.Math.*;

public class PointCP2 extends PointCP5{
	
	//les attributs qui stockent uniquement des coordonnées polaires
	
	private double rho;
	private double theta;
	
	// le constructeur 
	
	public PointCP2 ( double rho, double theta ){
		this.rho = rho;
		this.theta = theta;
	}
	
	// les getteurs
	
	public double getX(){
		return (Math.cos(Math.toRadians(theta)) * rho);
	}
	
	public double getY(){
		return (Math.sin(Math.toRadians(theta)) * rho);
	}
	
	public double getRho(){
		return rho;
	}
	
	public double getTheta(){
		return theta;
	}
	
}