public class StarGrapher extends XYGrapher {
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
        Coordinate[] points = {
                new Coordinate(0, 1.5), // Top point
                new Coordinate(0.4, 0.5), // Inner point
                new Coordinate(1.3, 0.5), // Right outer point
                new Coordinate(0.6, -0.1), // Inner point
                new Coordinate(0.8, -1.3), // Bottom right outer point
                new Coordinate(0, -0.5), // Inner point
                new Coordinate(-0.8, -1.3), // Bottom left outer point
                new Coordinate(-0.6, -0.1), // Inner point
                new Coordinate(-1.3, 0.5), // Left outer point
                new Coordinate(-0.4, 0.5), // Inner point
                new Coordinate(0, 1.5) // Back to top to close the star
        };

        if (pointNum >= points.length) {
            return null;
        }

        return points[pointNum];
    }

    public static void main(String[] args) {
        StarGrapher grapher = new StarGrapher();
        grapher.drawGraph(0, 0, 500, 500);
    }
}
