package geometry.com.epam;


import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import geometry.com.epam.action.TriangleCreator;
import geometry.com.epam.action.TriangleLogic;
import geometry.com.epam.entity.Triangle;
import geometry.com.epam.exception.NotPointException;
import geometry.com.epam.exception.NotTriangleException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;


@RunWith(DataProviderRunner.class)

public class TriangleLogicTest {

    private static List<Triangle> list;
    private final static TriangleLogic triangleLogic = new TriangleLogic();
    private final static double EPSILON = 0.000001;

    @BeforeClass
    public static void initialization() {
        list = new ArrayList<>();
        Triangle first = new Triangle(4, 2, 3, 4, 5, 6);
        Triangle second = new Triangle(-1, 0, 7, 0, 7, 6);
        list.add(first);
        list.add(second);
    }


    @DataProvider
    public static Object[][] dataProviderForPerimeterTest() {

        return new Object[][]{
                {list.get(0), 2 * Math.pow(2, 0.5) + Math.sqrt(17) + Math.sqrt(5)},
                {list.get(1), 24.0},
        };
    }

    @Test
    @UseDataProvider("dataProviderForPerimeterTest")
    public void shouldCalculatePerimeter(Triangle triangle, double result) {
        double perimeter = triangleLogic.calculatePerimeter(triangle);
        Assert.assertEquals(result, perimeter, EPSILON);
    }


    @DataProvider
    public static Object[][] dataProviderForSquareTest() {

        return new Object[][]{
                {list.get(0), 3},
                {list.get(1), 24.0},
        };
    }

    @Test
    @UseDataProvider("dataProviderForSquareTest")
    public void shouldCalculateSquare(Triangle triangle, double result) {
        double square = triangleLogic.calculateSquare(triangle);
        Assert.assertEquals(result, square, EPSILON);
    }


    @DataProvider
    public static Object[][] dataProviderForIsRectangularMethod() {
        return new Object[][]{
                {list.get(0), false},
                {list.get(1), true},
        };
    }

    @Test
    @UseDataProvider("dataProviderForIsRectangularMethod")
    public void shouldCheckIsTriangleRectangular(Triangle triangle, boolean result) {
        boolean actual = triangleLogic.isRectangular(triangle);
        Assert.assertEquals(result, actual);
    }
}

