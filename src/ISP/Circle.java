package ISP;
//для плоской фигуры не смогли бы найти объем 
public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
