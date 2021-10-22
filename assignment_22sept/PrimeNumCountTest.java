package assignment_22sept;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class PrimeNumCountTest {

   private PrimeNumCount CountPrimeNum ;
   
	@Before
	void setUp() throws Exception {
		CountPrimeNum = new PrimeNumCount();
	}

	@After
	void tearDown() throws Exception {
		CountPrimeNum=null;
	}

	@Test
	public void testCountPrime_positive() 
	{
		int[] Arr= {1,2,4,3,21,33,4,13};
		int expected = 3;
		int actual = CountPrimeNum.getCount(Arr);
		assertEquals(expected, actual);
	}
	@Test
	public void testCountPrime_negative() {
		int[] Arr= {};
		try {
			CountPrimeNum.getCount(Arr);
		assertTrue(false);
		}
		catch(RuntimeException e) {
			assertTrue(true);
			System.err.println(e.getMessage());
		}
	}
}
