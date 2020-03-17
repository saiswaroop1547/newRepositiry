package unit;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)

@Suite.SuiteClasses
(
		{
			Junit1.class,
			Junit.class
			
		}
)



public class JunitTestSuite 
{
@Test
void test()
{
	System.out.println("Hi pal");
}
}
