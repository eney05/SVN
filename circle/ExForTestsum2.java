package circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExForTestsum2 extends ExFor{

	@Test
	public void testSum2_1() {
		int n = 1;
		int q = sum2(n);
		assertEquals(1, q);
	}
	@Test
	public void testSum2_2() {
		int n = 1;
		int q = sum2(n);
		assertEquals(1, q);
	}	@Test
	public void testSum2_3() {
		int n = 3214;
		int q = sum2(n);
		assertEquals(10, q);
	}	@Test
	public void testSum2_4() {
		int n = -125;
		int q = sum2(n);
		assertEquals(8, q);
	}	@Test
	public void testSum2_0() {
		int n = 0;
		int q = sum2(n);
		assertEquals(0, q);
	}
	
	
}
