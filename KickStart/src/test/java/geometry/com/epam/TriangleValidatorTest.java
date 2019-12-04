package geometry.com.epam;


import geometry.com.epam.action.PointCreator;
import geometry.com.epam.entity.Point;
import geometry.com.epam.exception.NotPointException;
import geometry.com.epam.validator.TriangleValidator;
import org.junit.Assert;
import org.junit.Test;

public class TriangleValidatorTest {
    private static final TriangleValidator triangleValidator = TriangleValidator.getInstance();

    @Test
    public void shouldReturnFalse() {
        Point first = new Point(1, 1);
        Point second = new Point(1, 2);
        Point third = new Point(1, 3);
        boolean actual = triangleValidator.isTriangle(first, second, third);
        Assert.assertFalse(actual);
    }

    @Test
    public void shouldReturnTrue() {
        Point first = new Point(10, 1);
        Point second = new Point(1, 2);
        Point third = new Point(1, 30);
        boolean actual = triangleValidator.isTriangle(first, second, third);
        Assert.assertTrue(actual);
    }
}
