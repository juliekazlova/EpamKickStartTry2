package geometry.com.epam.action;


import geometry.com.epam.entity.Point;
import geometry.com.epam.exception.NotPointException;
import geometry.com.epam.validator.PointValidator;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class PointCreator {
    private static final Logger log = LogManager.getLogger(PointCreator.class);

    public Point createPoint(String x, String y) throws NotPointException {
        if (PointValidator.isPoint(x, y)) {
            log.info("Point has been created");
            double xValue = Double.parseDouble(x);
            double yValue = Double.parseDouble(y);
            return new Point(xValue, yValue);
        }
        throw new NotPointException("Data was invalid, point hasn't been created");
    }

}
