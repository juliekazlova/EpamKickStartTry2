package geometry.com.epam.entity;


import java.util.Objects;

public final class Triangle {
    private Point first;
    private Point second;
    private Point third;


    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.first = new Point(x1, y1);
        this.second = new Point(x2, y2);
        this.third = new Point(x3, y3);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(first, triangle.first) &&
                Objects.equals(second, triangle.second) &&
                Objects.equals(third, triangle.third);
    }

    @Override
    public int hashCode() {

        return Objects.hash(first, second, third);
    }

    public Point getFirst() {
        return first;
    }

    public Point getSecond() {
        return second;
    }

    public Point getThird() {
        return third;
    }


}
