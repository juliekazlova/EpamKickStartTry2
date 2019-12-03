package geometry.com.epam;

import geometry.com.epam.validator.PointValidator;
import org.junit.Assert;
import org.junit.Test;

public class PointValidatorTest {
    @Test
    public void shouldReturnFalse() {
        boolean actual = PointValidator.isPoint("3m", "98");
        Assert.assertFalse( actual);
    }

    @Test
    public void shouldReturnTrue() {
        boolean actual = PointValidator.isPoint("33", "98");
        Assert.assertTrue( actual);
    }
}
