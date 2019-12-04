package geometry.com.epam.validator;

public class PointValidator {

    private static final PointValidator instance=new PointValidator();

    private PointValidator() {
    }

    public static PointValidator getInstance(){
        return instance;
    }

    public  boolean isPoint(String x, String y) {
        try {
            Double.parseDouble(x);
            Double.parseDouble(y);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
