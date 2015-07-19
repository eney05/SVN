import static org.junit.Assert.*;

import org.junit.Test;

public class Exif_allTest2 {

	@Test
	public void testquoter_1() 
	{
		int x=1; int y=1;
		int q=Exif_all.quoter(x, y);
		assertEquals(1, q);
	}
	@Test 
	public void testquoter_2() 
	{
		int x=1; int y=-1;
		int q=Exif_all.quoter(x, y);
		assertEquals(4, q);
	}
	@Test
	public void testquoter_3() 
	{
		int x=-1; int y=1;
		int q=Exif_all.quoter(x, y);
		assertEquals(2, q);
	}
	@Test 
	public void testquoter_4() 
	{
		int x=-1; int y=-1;
		int q=Exif_all.quoter(x, y);
		assertEquals(3, q);
	}

	@Test 
	public void testquoter_00() 
	{
		int x=0; int y=0;
		int q=Exif_all.quoter(x, y);
		assertEquals(0, q);
	}
	@Test 
	public void testquoter_01() 
	{
		int x=0; int y=1;
		int q=Exif_all.quoter(x, y);
		assertEquals(0, q);
	}
	@Test 
	public void testquoter_10() 
	{
		int x=1; int y=0;
		int q=Exif_all.quoter(x, y);
		assertEquals(0, q);
	}
}
