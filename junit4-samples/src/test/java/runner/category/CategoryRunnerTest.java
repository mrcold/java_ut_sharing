package runner.category;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

interface FastTests { /* category marker */ }
interface SlowTests { /* category marker */ }

@RunWith(Categories.class)
@Categories.IncludeCategory({SlowTests.class, FastTests.class})
@Suite.SuiteClasses( { A.class, B.class }) // Note that Categories is a kind of Suite
public class CategoryRunnerTest
{
}
