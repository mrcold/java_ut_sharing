package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import runner.category.CategoryRunnerTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CategoryRunnerTest.class,
        ParameterizedRunnerTest.class
})

public class SuiteRunnerTest
{
    // the class remains empty,
    // used only as a holder for the above annotations
}
