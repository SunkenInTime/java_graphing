public class ExpGrapher extends FunctionGrapher {
    public Coordinate xyStart() {

        return new Coordinate(0, 0);
    }

    public double xRange() {
        return 5.0;
    }

    public double yRange() {

        return 150.0;
    }

    public double xIncrement() {
        return 0.05;
    }

    public double yValue(double xValue) {
        return Math.exp(xValue);
    }

    public static void main(String[] args) {
        ExpGrapher expGraph = new ExpGrapher();
        expGraph.drawGraph(0, 0, 500, 500);
    }
}
