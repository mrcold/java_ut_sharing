package runner.category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class A
{
    @Category(SlowTests.class)
    @Test
    public void slowTest() {
        System.out.println("slow test in A");
    }

    @Category(FastTests.class)
    @Test
    public void fastTest() {
        System.out.println("fast test in A");
    }

    @Category({SlowTests.class, FastTests.class})
    @Test
    public void eitherTest() {
        System.out.println("either test in A");
    }
}
