
public abstract class XYGrapher extends GoodDrawGraph {

    abstract public Coordinate xyStart();

    abstract public double xRange();

    abstract public double yRange();

    abstract public Coordinate getPoint(int pointNum);

}