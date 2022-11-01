public class Kolo {
    public final double pi = 3.14;
    private double r;

    public void setR (double r) {
        this.r = r;
    }

    public double getR () {
        return r;
    }

    double PloshchaKola () {
        return pi * (r * r);
    }

    double perKola () {
        return 2 * pi * r;
    }

}
