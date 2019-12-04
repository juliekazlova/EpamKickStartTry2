package geometry.com.epam;

import geometry.com.epam.validator.PointValidator;
import org.junit.Assert;
import org.junit.Test;

public class PointValidatorTest {

    private PointValidator validator=PointValidator.getInstance();
    @Test
    public void shouldReturnFalse() {
        boolean actual = validator.isPoint("3m", "98");
        Assert.assertFalse( actual);
    }

    @Test
    public void shouldReturnTrue() {
        boolean actual = validator.isPoint("33", "98");
        Assert.assertTrue( actual);
    }
}
