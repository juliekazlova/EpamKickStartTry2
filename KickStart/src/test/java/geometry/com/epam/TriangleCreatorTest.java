package geometry.com.epam;


import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import geometry.com.epam.action.TriangleCreator;
import geometry.com.epam.entity.Triangle;
import geometry.com.epam.exception.NotPointException;
import geometry.com.epam.exception.NotTriangleException;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RunWith(DataProviderRunner.class)
public class TriangleCreatorTest {
    private static List<Triangle> list = new ArrayList<Triangle>();
    private static final String PATH = ".\\src\\main\\resources\\input.txt";
    private static final TriangleCreator triangleCreator = new TriangleCreator();


    @BeforeClass
    public static void createTriangles() {
        list.add(new Triangle(4, 2, 3, 4, 5, 6));
        list.add(new Triangle(4, 2, 7, 4, 5, 6));

    }

    @Test
    public void shouldReadFromFileAndCreateTriangles() throws IOException {
        List<Triangle> actualList = triangleCreator.createTrianglesFromFile(PATH);
        Assert.assertEquals(list, actualList);

    }

    @Test(expected = NotTriangleException.class)
    public void shouldThrowNotTriangleException() throws NotTriangleException, NotPointException {
        triangleCreator.createTriangle("1", "1", "1", "1", "1", "1");

    }
}
