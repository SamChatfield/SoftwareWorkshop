import java.util.Observable;

public class JuliaModel extends Observable {

    private JuliaSet j;

    public JuliaModel(JuliaSet j) {
        super();
        this.j = j;
    }

    public double getA() {
        return j.getA();
    }

    public double getB() {
        return j.getB();
    }

    public void setA(double value) {
        setChanged();
        notifyObservers();
        j.setA(value);
    }

    public void setB(double value) {
        setChanged();
        notifyObservers();
        j.setB(value);
    }

    public boolean isInSet(double x, double y) {
        return j.isInSet(x, y);
    }

}
