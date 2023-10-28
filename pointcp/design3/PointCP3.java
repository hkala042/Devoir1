import java.lang.Math.*;

public class PointCP3 {
    public double x;
    public double y;

    public PointCP3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
	
	public double getRho(){
		return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	}
	
	public double getTheta(){
		return Math.toDegrees(Math.atan2(y, x));
	}

    
}