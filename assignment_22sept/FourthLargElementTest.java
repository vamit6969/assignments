package assignment_22sept;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FourthLargElementTest {


	private FourthLargElement element;

	@Before
	public void setUp() throws Exception {
		element = new FourthLargElement();
	}

	@After
	public void tearDown() throws Exception {
		element=null;
	}

	@Test
	public void testLargestElementPositive() {
		int Arr[]= {20,30,40,50,60,70,80};
		int expected = 50;
		int index=4;
		int actual = element.getFourthLargest(Arr,index);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLargestElementNegative() {
		int Arr[]= {4,5,6};
		int index=4;
		try {
			element.getFourthLargest(Arr, index);
			assertTrue(true);
		}
		catch(Exception e) {
			System.err.println(e);
			assertTrue(false);
		}
	}
	
	

}