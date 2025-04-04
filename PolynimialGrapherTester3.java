public class PolynimialGrapherTester3 extends PolynomialGrapher {
    @Override
    public Coordinate xyStart() {
        return new Coordinate(-3, -10);
    }

    @Override
    public double xRange() {
        return 6;
    }

    @Override
    public double yRange() {
        return 20;
    }

    @Override
    public double xIncrement() {
        return 0.1;
    }

    @Override
    public double[] coefficients() {
        // Coefficients for the polynomial
        // f(x) = -2x^4 + 1x^3 + 5x^2 - 4x + 3
        return new double[] { -2, 1, 5, -4, 3 };
    }

    public static void main(String[] args) {
        PolynimialGrapherTester3 tester = new PolynimialGrapherTester3();
        tester.drawGraph(0, 0, 800, 400);
    }
}
