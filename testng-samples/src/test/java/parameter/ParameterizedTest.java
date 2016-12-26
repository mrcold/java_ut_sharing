package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest
{
    @Parameters({ "first-name" })
    @Test
    public void parameterTest(String firstName) {
        System.out.println("Invoked testString " + firstName);
        assert "Cedric".equals(firstName);
    }
}
