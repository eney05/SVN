package arr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExArrTest extends ExArr  {

	@Test
	public void testMinnums1() {
		int[] in = {3, 4, 5, 6, 7, 8};
		int out = minnums(in);
		assertEquals(3, out);
	}
	@Test
	public void testMinnums2() {
		int[] in = {0};
		int out = minnums(in);
		assertEquals(0, out);
	}
	@Test
	public void testMinnums3() {
		int[] in = {-3, -4, 5, 6, 7, -8};
		int out = minnums(in);
		assertEquals(-8, out);
	}
	@Test
	public void testMinnums4() {
		int[] in = {-98, 4, 655, -6, 447, -98};
		int out = minnums(in);
		assertEquals(-98, out);
	}
	@Test
	public void testMinnums5() {
		int[] in = {3, 0, 0, 0, -7, 8};
		int out = minnums(in);
		assertEquals(-7, out);
	}
	
}
