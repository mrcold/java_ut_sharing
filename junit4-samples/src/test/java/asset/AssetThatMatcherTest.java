package asset;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.junit.Assert.assertThat;

public class AssetThatMatcherTest
{
    @Test
    public void evaluatesExpression() {
        String actual = "red color";
        assertTrue(actual.contains("color") || actual.contains("colour"));
    }

    @Test
    public void evaluatesExpressionByAssertThat() {
        String actual = "red color";
        assertThat(actual, anyOf(containsString("color"), containsString("colour")));
    }
}
