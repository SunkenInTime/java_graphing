public class TriangleGrapher extends XYGrapher {

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

        Coordinate[] outerTriangle = {
                new Coordinate(-1.5, -1),
                new Coordinate(1.5, -1),
                new Coordinate(0, 1.5),
                new Coordinate(-1.5, -1, false, true)
        };

        Coordinate[] innerTriangle = {
                new Coordinate(-0.75, -0.5),
                new Coordinate(0.75, -0.5),
                new Coordinate(0, 0.75),
                new Coordinate(-0.75, -0.5)
        };

        Coordinate[] points = new Coordinate[outerTriangle.length + innerTriangle.length];
        System.arraycopy(outerTriangle, 0, points, 0, outerTriangle.length);
        System.arraycopy(innerTriangle, 0, points, outerTriangle.length, innerTriangle.length);

        if (pointNum > points.length - 1)
            return null;

        return points[pointNum];
    }

    public static void main(String[] args) {
        TriangleGrapher grapher = new TriangleGrapher() {

        };

        grapher.drawGraph(0, 0, 500, 500);
    }
}
