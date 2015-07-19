import static org.junit.Assert.*;

import org.junit.Test;

public class Exif_allTest4 {

	@Test
	public void testmax_1() 
	{
		int x=1; int y=1; int z=1;
		int q=Exif_all.max(x, y, z);
		assertEquals(6, q);
	}

	@Test
	public void testmax_0() 
	{
		int x=0; int y=1; int z=1;
		int q=Exif_all.max(x, y, z);
		assertEquals(5, q);
	}
	@Test
	public void testmax_000() 
	{
		int x=0; int y=0; int z=0;
		int q=Exif_all.max(x, y, z);
		assertEquals(3, q);
	}
	@Test
	public void testmax_2() 
	{
		int x=5; int y=5; int z=1;
		int q=Exif_all.max(x, y, z);
		assertEquals(28, q);
	}

	
}
