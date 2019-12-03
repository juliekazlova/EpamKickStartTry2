package geometry.com.epam.validator;

public class PointValidator {
    public static boolean isPoint(String x, String y) {
        try {
            Double.parseDouble(x);
            Double.parseDouble(y);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
