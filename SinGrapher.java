public class SinGrapher extends FunctionGrapher {
    public Coordinate xyStart() {
        return new Coordinate(0, -1);
    }

    public double xRange() {
        return 20.0;
    }

    public double yRange() {
        return 2.0;
    }

    public double xIncrement() {
        return 0.1;
    }

    public double yValue(double xValue) {
        return Math.sin(xValue);
    }

    public static void main(String[] args) {
        SinGrapher sinGraph = new SinGrapher();
        sinGraph.drawGraph(0, 0, 500, 500);
    }
}
