import static org.junit.Assert.*;

import org.junit.Test;

public class Exif_allTest3 {

	@Test
	public void testpoloj_1() 
	{
		int x=1; int y=1; int z=1;
		int q=Exif_all.poloj(x, y, z);
		assertEquals(3, q);
	}
	@Test
	public void testpoloj_2() 
	{
		int x=-1; int y=1; int z=1;
		int q=Exif_all.poloj(x, y, z);
		assertEquals(2, q);
	}
	@Test
	public void testpoloj_3() 
	{
		int x=1; int y=-1; int z=1;
		int q=Exif_all.poloj(x, y, z);
		assertEquals(2, q);
	}
	@Test
	public void testpoloj_4() 
	{
		int x=1; int y=1; int z=-1;
		int q=Exif_all.poloj(x, y, z);
		assertEquals(2, q);
	}
	@Test
	public void testpoloj_5() 
	{
		int x=-1; int y=-1; int z=1;
		int q=Exif_all.poloj(x, y, z);
		assertEquals(1, q);
	}
	@Test
	public void testpoloj_0() 
	{
		int x=0; int y=1; int z=1;
		int q=Exif_all.poloj(x, y, z);
		assertEquals(2, q);
	}
	@Test
	public void testpoloj_00() 
	{
		int x=0; int y=0; int z=1;
		int q=Exif_all.poloj(x, y, z);
		assertEquals(1, q);
	}
	@Test
	public void testpoloj_000() 
	{
		int x=0; int y=0; int z=0;
		int q=Exif_all.poloj(x, y, z);
		assertEquals(0, q);
	}
	public void testpoloj_6() 
	{
		int x=-1; int y=-1; int z=-1;
		int q=Exif_all.poloj(x, y, z);
		assertEquals(0, q);
	}
}
