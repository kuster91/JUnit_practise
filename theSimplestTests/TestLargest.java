package theSimplestTests;

import junit.framework.TestCase;

public class TestLargest extends TestCase{
	public TestLargest(String name){
		super(name);
	}
	public void testOrder(){
		assertEquals(9, Largest.largest(new int[]{8,9,7}));
	}
	public void testFirst(){
		assertEquals(9, Largest.largest(new int[]{9,7,8}));
	}
	public void testLast(){
		assertEquals(9, Largest.largest(new int[]{8,7,9}));
	}

	public void testNegative(){
		assertEquals(-7, Largest.largest(new int[]{-8,-9,-7}));
	}
}
