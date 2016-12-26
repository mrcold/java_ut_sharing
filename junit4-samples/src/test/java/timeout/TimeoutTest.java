package timeout;

import org.junit.Test;

public class TimeoutTest
{
    @Test(timeout = 1000)
    public void timeoutTest() {
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
