public abstract class FunctionGrapher extends XYGrapher {

    // returns distance between x values
    abstract public double xIncrement();

    abstract public double yValue(double xValue);

    public double xValue(int pointNum) {
        // formula to return the x value of each position
        return xyStart().getX() + (pointNum * xIncrement());
    }

    public Coordinate getPoint(int pointNum) {

        double x = xValue(pointNum);
        double y = yValue(x);
        double xStart = xyStart().getX();
        if (x > (xStart + xRange())) {
            return null;
        } else {
            return new Coordinate(x, y);
        }
    }
}