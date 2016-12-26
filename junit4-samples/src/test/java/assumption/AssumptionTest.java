package assumption;

import org.junit.Test;

import java.io.File;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assume.*;

public class AssumptionTest
{
    @Test
    public void filenameIncludesUsername() {
        assumeThat(File.separatorChar, is('/'));
        System.out.println("pass the assumption");
    }
}
