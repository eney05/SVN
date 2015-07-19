package circle;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExForTest {

	@Test
	public void testsummCount() {
		int[] count = ExFor.summCount(0, 100);
		assertArrayEquals(count, new int[]{2450, 50});
			
	}
	@Test
	public void testsummCount2() {
		int[] count = ExFor.summCount(0, 0);
		assertArrayEquals(count, new int[]{0, 0});
			
	}
	@Test
	public void testsummCount3() {
		int[] count = ExFor.summCount(1, 10);
		assertArrayEquals(count, new int[]{20, 4});
			
	}
	@Test
	public void testsummCount4() {
		int[] count = ExFor.summCount(1, 99);
		assertArrayEquals(count, new int[]{2450, 49});
			
	}
}
