package circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExForTestzer extends ExFor{

	@Test
	public void testZer1() {
		int n = 123;
		int q = zer(n);
		assertEquals(q, 321);
	}

	@Test
	public void testZer2() {
		int n = 0;
		int q = zer(n);
		assertEquals(q, 0);
	}

	@Test
	public void testZer3() {
		int n = -123;
		int q = zer(n);
		assertEquals(q, 321);
	}

	@Test
	public void testZer4() {
		int n = 123333;
		int q = zer(n);
		assertEquals(q, 333321);
	}

	
}
