package exception;

import org.junit.Test;

import java.util.ArrayList;

public class ExceptionTest
{
    @Test(expected = IndexOutOfBoundsException.class)
    public void indexOutOfBoundsTest() {
        System.out.print(new ArrayList<String>().get(1));
    }
}
