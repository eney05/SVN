package circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExForTestnat extends ExFor{

	@Test
	public void testnat_1() {
		int n = 4;
		int q = nat(n);
		assertEquals(2, q);
	}

	@Test
	public void testnat_2() {
		int n = 9;
		int q = nat(n);
		assertEquals(3, q);
	}

	@Test
	public void testnat_3() {
		int n = 10;
		int q = nat(n);
		assertEquals(3, q);
	}
	@Test
	public void testnat_01() {
		int n = -4;
		int q = nat(n);
		assertEquals(2, q);
	}

	@Test
	public void testnat_0() {
		int n = 0;
		int q = nat(n);
		assertEquals(0, q);
	}

	
	
}
