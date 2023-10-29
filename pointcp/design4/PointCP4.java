import java.lang.Math.*;

public class PointCP4 {

	
	//les attributs
	
    private double x;
    private double y;
    private double rho;
    private double theta;

// le constructeur
    public PointCP4(double x, double y, double rho, double theta) {
        this.x = x;
        this.y = y;
        this.rho = rho;
        this.theta = theta;
    }


// les getteurs 

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public double getRho() {
        return rho;
    }

    public double getTheta() {
        return theta;


}