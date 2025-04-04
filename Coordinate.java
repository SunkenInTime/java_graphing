public class Coordinate {

    public double x;
    public double y;
    public boolean drawTo;
    public boolean drawForm;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
        this.drawForm = true;
        this.drawTo = true;
    }

    public Coordinate(double x, double y, boolean drawTo, boolean drawForm) {
        this.x = x;
        this.y = y;
        this.drawTo = drawTo;
        this.drawForm = drawForm;
    }

    public boolean drawFrom() {
        return drawForm;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean drawTo() {
        return drawTo;
    }

}