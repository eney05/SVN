package arr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExArrTestmax extends ExArr{

	@Test
	public void testMaxnums() {
		int[] in = {3, 4, 5, 6, 7, 8};
		int out = maxnums(in);
		assertEquals(8, out);	
	}
	@Test
	public void testMaxnums2() {
		int[] in = {0};
		int out = maxnums(in);
		assertEquals(0, out);
	}
	@Test
	public void testMaxnums3() {
		int[] in = {-3, -4, 5, 6, 7, -8};
		int out = maxnums(in);
		assertEquals(7, out);
	}
	@Test
	public void testMaxnums4() {
		int[] in = {-98, 4, 655, -6, 447, -98};
		int out = maxnums(in);
		assertEquals(655, out);
	}
	@Test
	public void testMaxnums5() {
		int[] in = {3, 0, 0, 0, -7, 8};
		int out = maxnums(in);
		assertEquals(8, out);
	}
}
