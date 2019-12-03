package geometry.com.epam;


import geometry.com.epam.action.PointCreator;
import geometry.com.epam.entity.Point;
import geometry.com.epam.exception.NotPointException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class PointCreatorTest {
    private static Point point;
    PointCreator pointCreator = new PointCreator();

    @BeforeClass
    public static void createPoint() {
        point = new Point(-4.4, 13.2);
    }

    @Test
    public void shouldCreatePoint() throws NotPointException {
        Point testPoint = pointCreator.createPoint("-4.4", "13.2");
        Assert.assertEquals(point, testPoint);

    }

    @Test(expected = NotPointException.class)
    public void shouldThrowNotPointException() throws NotPointException {
        pointCreator.createPoint("lfk", "4");

    }

}
