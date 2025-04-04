public abstract class SquareGrapher extends XYGrapher {

    public Coordinate xyStart() {
        return new Coordinate(-2, -2);
    }

    public double xRange() {
        return 4;
    }

    public double yRange() {
        return 4;
    }

    public Coordinate getPoint(int pointNum) {

        Coordinate[] points = { new Coordinate(-1, -1), new Coordinate(1, -1), new Coordinate(1, 1),
                new Coordinate(-1, 1), new Coordinate(-1, -1), };

        if (pointNum > points.length - 1)
            return null;

        return points[pointNum];
    }

    public static void main(String[] args) {
        SquareGrapher grapher = new SquareGrapher() {

        };

        grapher.drawGraph(0, 0, 500, 500);
    }
}