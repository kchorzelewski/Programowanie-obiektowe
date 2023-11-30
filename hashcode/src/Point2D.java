import java.lang.Math;
public record Point2D(int x, int y) {
    public double distanceTo(Point2D otherPoint){
        double result = Math.pow((Math.pow(otherPoint.x, 2) + Math.pow(otherPoint.y, 2)), 0.5);
        return result;
    }
}
