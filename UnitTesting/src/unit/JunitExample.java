package unit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitExample
{
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("this is my beforeAll");
	}

	@AfterAll
	public static void AfterAll()
	{
		System.out.println("this is my afterAll");
	}
	@Test
	@RepeatedTest(3)
	public void test1()
	{
		System.out.println("this is my testcase1");
	}
	@BeforeEach
	public void display()
	{
		System.out.println("this is my before");
	}
	@Test
	public void test2()
	{
		System.out.println("this is my testcase2");
	}
	@AfterEach
	public void show()
	{
		System.out.println("this is my After");
	}
	@ParameterizedTest
	@ValueSource(strings= {"hi","how","are","you"})
	void loginTest(String str)
	{
		System.out.println(str);
	}
	@Disabled
	public void test3()
	{
		System.out.println("test disabled1");
	}
}
