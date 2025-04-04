public class PolynomialGrapherTester extends PolynomialGrapher {

    public Coordinate xyStart() {
        return new Coordinate(0, 0);

    }

    public double xRange() {
        return 6;
    }

    public double yRange() {
        return 10;
    }

    public double xIncrement() {
        return 0.2;
    }

    public double[] coefficients() {
        double[] numbers = { 4.8, -1.2, 0.2 };
        return numbers;
    }

    public static void main(String[] args) {
        PolynomialGrapherTester polyTester = new PolynomialGrapherTester();
        polyTester.drawGraph(0, 0, 800, 400);
    }

}