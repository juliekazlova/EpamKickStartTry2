package geometry.com.epam.validator;


import geometry.com.epam.entity.Point;

public class TriangleValidator {
    public boolean isTriangle(Point first, Point second, Point third) {
        if (first != null && second != null && third != null) {

            double len1 = distanceBetweenPoints(first, second);
            double len2 = distanceBetweenPoints(second, third);
            double len3 = distanceBetweenPoints(third, first);
            return isSumLengthGreaterThanSideLength(len1, len2, len3);
        }
        if (first == null) {
            throw new IllegalArgumentException("First argument is null");
        }
        if (second == null) {
            throw new IllegalArgumentException("Second argument is null");
        }
        throw new IllegalArgumentException("Third argument is null");


    }

    private double distanceBetweenPoints(Point first, Point second) {
        double firstX = first.getX();
        double secondX = second.getX();
        double firstY = first.getY();
        double secondY = second.getY();
        return Math.sqrt(Math.pow(firstX - secondX, 2) + Math.pow(firstY - secondY, 2));
    }

    private boolean isSumLengthGreaterThanSideLength(double firstLength, double secondLength, double thirdLength) {
        return (firstLength + secondLength > thirdLength)
                && (secondLength + thirdLength > firstLength)
                && (thirdLength + firstLength > secondLength);
    }


}
