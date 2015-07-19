import static org.junit.Assert.*;

import org.junit.Test;

public class Exif_allTest {

	@Test
	public void testChet_1() 
	{
		int q =Exif_all.chet(2, 3);
		assertEquals(6, q);
		
	}
	@Test
	public void testChet_2() 
	{
		int q =Exif_all.chet(3, 3);
		assertEquals(6, q);
		
	}
	@Test
	public void testChet_3() 
	{
		int q =Exif_all.chet(0, 3);
		assertEquals(0, q);
		
	}
	
	
	
}
