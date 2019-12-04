package geometry.com.epam.action;


import geometry.com.epam.entity.Point;
import geometry.com.epam.entity.Triangle;


public class TriangleLogic {

    private static final TriangleLogic instance=new TriangleLogic();

    private TriangleLogic(){}

    public static TriangleLogic getInstance(){
        return instance;
    }
    public double calculatePerimeter(Triangle triangle) {
        Point first = triangle.getFirst();
        Point second = triangle.getSecond();
        Point third = triangle.getThird();
        return calculateDistanceBetweenPoints(first, second) + calculateDistanceBetweenPoints(first, third) +
                calculateDistanceBetweenPoints(second, third);
    }

    private double calculateDistanceBetweenPoints(Point first, Point second) {
        double deltaX = first.getX() - second.getX();
        double deltaY = first.getY() - second.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double calculateSquare(Triangle triangle) {
        double halfPerimeter = calculatePerimeter(triangle) / 2;
        Point first = triangle.getFirst();
        Point second = triangle.getSecond();
        Point third = triangle.getThird();
        return Math.sqrt(halfPerimeter * (halfPerimeter - calculateDistanceBetweenPoints(first, second)) *
                (halfPerimeter - calculateDistanceBetweenPoints(first, third)) *
                (halfPerimeter - calculateDistanceBetweenPoints(second, third)));
    }

    private boolean checkPythagoreanTheorem(double first, double second, double third) {
        if (first > second && first > third)
            return first * first == second * second + third * third;
        if (second > first && second > third)
            return second * second == first * first + third * third;
        if (third > second && third > first)
            return third * third == first * first + second * second;

        return false;
    }

    public boolean isRectangular(Triangle triangle) {
        double firstLength = calculateDistanceBetweenPoints(triangle.getFirst(), triangle.getSecond());
        double secondLength = calculateDistanceBetweenPoints(triangle.getFirst(), triangle.getThird());
        double thirdLength = calculateDistanceBetweenPoints(triangle.getSecond(), triangle.getThird());
        return checkPythagoreanTheorem(firstLength, secondLength, thirdLength);
    }
}
