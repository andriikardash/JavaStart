public class Pryamokutnyk {
    private int l;
    private int w;

    public void setL(int l) {
        this.l = l;
    }

    public int getL() {
        return l;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getW() {
        return w;
    }

    int ploshcha () {
        return w * l;
    }

    int perymetr () {
        return 2 * (w + l);
    }
}
