package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void returnTrueTest() {
		assertTrue("Testing if ReturnTrue returns true", MyClass.ReturnTrue());
	}
	@Test
	public void AddTwoNumbersTest() {
		assertEquals("Testing if AddTwoNumbers adds two numbers correctly", 8, MyClass.AddTwoNumbers(5,3));
	}

}
