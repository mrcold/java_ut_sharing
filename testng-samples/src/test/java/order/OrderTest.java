package order;

import org.testng.annotations.Test;

public class OrderTest
{
    @Test
    public void serverStartedOk() {}

    @Test(dependsOnMethods = { "serverStartedOk" })
    public void method1() {}

}
