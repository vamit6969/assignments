package assignment_22sept;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CountDupliStringTest {

	private CountDupliString DuplicateString;
	
	@Before
	public void setUp() throws Exception {
		DuplicateString = new CountDupliString();
	}

	@After
	public void tearDown() throws Exception {
		DuplicateString = null;
	}

	@Test
	public void testCountDupliStrings_positive() {
		String[] inputArr= {"hi","we","you","hi","are","you","they","we","them"};
		int expected = 3;
		int actual = DuplicateString.getDuplicateCount(inputArr);
		assertEquals(expected, actual);
	}
	@Test
	public void testCountDupliStrings_negative() 
	{
		String[] inputArr = {"hi"};
		int expected = 0;
		int actual = DuplicateString.getDuplicateCount(inputArr);
		assertEquals(expected, actual);
	}
}
