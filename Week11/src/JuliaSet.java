/**
 * Created by Sam on 08/12/2015.
 */
public class JuliaSet {

    private double a, b;
    private int maxIter;

    public JuliaSet(double a, double b, int maxIter) {
        this.a = a;
        this.b = b;
        this.maxIter = maxIter;
    }

    public boolean isInSet(double ix, double iy) {
        int remainingIter = maxIter;
        double x = ix;
        double y = iy;
        while (remainingIter > 0) {
            if (Math.pow(x, 2) + Math.pow(y, 2) > 4) {
                return false;
            }
            double xc = x;
            x = Math.pow(x, 2) - Math.pow(y, 2) + a;
            y = 2 * xc * y + b;
            remainingIter--;
        }
        return true;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

}
