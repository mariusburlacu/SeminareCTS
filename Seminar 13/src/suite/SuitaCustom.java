package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.TesteGetPromovabilitate;
import categorii.TesteNormale;
import tests.GrupaTestWithFake;
import tests.GrupaTestWithStub;
import tests.GrupaTests;
import tests.GrupaTestsWithFixture;

@RunWith(Categories.class)
@SuiteClasses({GrupaTests.class, GrupaTestWithFake.class, GrupaTestWithStub.class, GrupaTestsWithFixture.class})
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class})
public class SuitaCustom {

}
