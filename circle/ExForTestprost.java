package circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExForTestprost extends ExFor {

	@Test
	public void testprost1() {
		int a = 2;
		boolean b = circle.ExFor.prost(a);
		assertTrue(b);
			
	}
	
	@Test
	public void testprost2() {
		int a = 3;
		boolean b = circle.ExFor.prost(a);
		assertTrue(b);
			
	}
	
	@Test
	public void testprost3() {
		int a = 44;
		boolean b = circle.ExFor.prost(a);
		assertFalse(b);
			
	}
	
	@Test
	public void testprost4() {
		int a = 0;
		boolean b = circle.ExFor.prost(a);
		assertFalse(b);
			
	}

}
