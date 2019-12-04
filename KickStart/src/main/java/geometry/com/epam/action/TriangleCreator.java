package geometry.com.epam.action;

import geometry.com.epam.entity.Point;
import geometry.com.epam.entity.Triangle;
import geometry.com.epam.exception.NotPointException;
import geometry.com.epam.exception.NotTriangleException;
import geometry.com.epam.validator.TriangleValidator;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.util.*;

public class TriangleCreator {
    private static final Logger log = LogManager.getLogger(PointCreator.class);

    public Triangle createTriangle(Point first, Point second, Point third) throws NotTriangleException {
        TriangleValidator validator = TriangleValidator.getInstance();

        boolean valid = validator.isTriangle(first, second, third);
        if (valid) {
            return new Triangle(first, second, third);
        } else {
            throw new NotTriangleException("Triangle can't be built");
        }
    }

    public Triangle createTriangle(String x1, String y1, String x2, String y2, String x3, String y3) throws NotTriangleException, NotPointException {
        PointCreator pointCreator = new PointCreator();
        Point first = pointCreator.createPoint(x1, y1);
        Point second = pointCreator.createPoint(x2, y2);
        Point third = pointCreator.createPoint(x3, y3);
        TriangleValidator validator = TriangleValidator.getInstance();

        boolean valid = validator.isTriangle(first, second, third);
        if (valid) {
            return new Triangle(first, second, third);
        } else {
            throw new NotTriangleException("Triangle can't be built");
        }
    }

    private Triangle createTriangle(List<String> coordinates) throws NotTriangleException, NotPointException {
        PointCreator pointCreator = new PointCreator();
        Point first = pointCreator.createPoint(coordinates.get(0), coordinates.get(1));
        Point second = pointCreator.createPoint(coordinates.get(2), coordinates.get(3));
        Point third = pointCreator.createPoint(coordinates.get(4), coordinates.get(5));
        TriangleValidator validator = TriangleValidator.getInstance();

        boolean valid = validator.isTriangle(first, second, third);
        if (valid) {
            return new Triangle(first, second, third);
        } else {
            throw new NotTriangleException("Triangle can't be built");
        }
    }

    public List<Triangle> createTrianglesFromFile(String path) throws IOException {
        List<Triangle> list = new ArrayList<Triangle>();
        final int VALID_SIZE = 6;
        DataReader dataReader = DataReader.getInstance();
        List<String> dataFromFile;
        List<String> coordinates;
        dataFromFile = dataReader.getData(path);
        Iterator<String> iterator = dataFromFile.iterator();

        while (iterator.hasNext()) {
            coordinates = Arrays.asList(iterator.next().trim().split(","));
            if (coordinates.size() == VALID_SIZE) {
                try {
                    list.add(createTriangle(coordinates));
                    log.info("Triangle has been created");
                } catch (NotTriangleException nte) {
                    log.info("Triangle hasn't been created. Not Triangle");
                } catch (NotPointException e) {
                    log.info(e.getMessage(), e);
                }

            } else {
                log.info("Triangle hasn't been created. Invalid data");
            }
        }
        log.info("All valid triangles was created");
        return list;
    }


}
