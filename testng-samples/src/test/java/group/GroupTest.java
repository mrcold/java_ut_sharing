package group;

import org.testng.annotations.Test;

@Test(groups = {"all-test"})
public class GroupTest
{
    @Test(groups = {"functest", "checkintest"})
    public void funcAndCheckinTest()
    {
        System.out.println("This a func test & checkin test");
    }

    @Test(groups = {"functest"})
    public void funcTest()
    {
        System.out.println("This a func test");
    }

    @Test(groups = {"checkintest"})
    public void checkinTest()
    {
        System.out.println("This a checkin test");
    }

    @Test(groups = {"windows.checkintest"})
    public void testWindowsOnly()
    {
    }

    @Test(groups = {"linux.checkintest"})
    public void testLinuxOnly()
    {
    }

    @Test(groups = {"windows.functest"})
    public void testWindowsToo()
    {
    }
}
