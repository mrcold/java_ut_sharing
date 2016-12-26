package runner.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class B
{
    @Category(SlowTests.class)
    @Test
    public void slowTest() {
        System.out.println("slow test in B");
    }

    @Category(FastTests.class)
    @Test
    public void fastTest() {
        System.out.println("fast test in B");
    }

    @Category({SlowTests.class, FastTests.class})
    @Test
    public void eitherTest() {
        System.out.println("either test in B");
    }
}
