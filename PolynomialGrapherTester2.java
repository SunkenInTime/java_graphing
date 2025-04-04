public class PolynomialGrapherTester2 extends PolynomialGrapher {
    public Coordinate xyStart() {
        return new Coordinate(-4, -2);
    }

    public double xRange() {
        return 8;
    }

    public double yRange() {
        return 16;
    }

    public double xIncrement() {
        return 0.1;
    }

    public double[] coefficients() {
        // f(x) = 1x^3 - 3x^2 - 4x + 12
        return new double[] { 1, -3, -4, 12 };
    }

    public static void main(String[] args) {
        PolynomialGrapherTester2 tester = new PolynomialGrapherTester2();
        tester.drawGraph(0, 0, 800, 400);
    }
}
