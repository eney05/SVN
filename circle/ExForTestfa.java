package circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExForTestfa extends ExFor{

	@Test
	public void test1() {
	int n = 4;
	int q = fa(n);
	assertEquals(24, q);
	}

	@Test
	public void test2() {
	int n = 10;
	int q = fa(n);
	assertEquals(3628800, q);
	}
	@Test
	public void test3() {
	int n = 3;
	int q = fa(n);
	assertEquals(6, q);
	}
	@Test
	public void test4() {
	int n = -5;
	int q = fa(n);
	assertEquals(-1, q);
	}
	@Test
	public void test0() {
	int n = 0;
	int q = fa(n);
	assertEquals(-1, q);
	}
	
}
