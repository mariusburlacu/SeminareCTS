package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.GrupaTestWithFake;
import tests.GrupaTestWithStub;
import tests.GrupaTests;

@RunWith(Suite.class)
@SuiteClasses({GrupaTests.class, GrupaTestWithFake.class, GrupaTestWithStub.class})
public class SuitaCompleta {
	
}
