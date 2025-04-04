public abstract class PolynomialGrapher extends FunctionGrapher {
    abstract public double[] coefficients();

    abstract public double xIncrement();

    public double xValue(int pointNum) {

        return xyStart().getX() + (pointNum * xIncrement());
    }

    public double yValue(double x) {
        double[] coefficients = coefficients();
        double y = 0;

        for (int i = 0; i <= coefficients.length - 1; i++) {
            y += coefficients[i] * Math.pow(x, i);
        }

        return y;
    }

}