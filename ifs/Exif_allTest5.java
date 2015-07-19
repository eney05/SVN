import static org.junit.Assert.*;

import org.junit.Test;

public class Exif_allTest5 {

	@Test
	public void testrayting_1() 
	{
		int reyting=1;
		int q=Exif_all.rayting(reyting) ;
		assertEquals('F', q);
	}
	@Test
	public void testrayting_2() 
	{
		int reyting=20;
		int q=Exif_all.rayting(reyting) ;
		assertEquals('E', q);
	}
	@Test
	public void testrayting_3() 
	{
		int reyting=40;
		int q=Exif_all.rayting(reyting) ;
		assertEquals('D', q);
	}
	@Test
	public void testrayting_4() 
	{
		int reyting=60;
		int q=Exif_all.rayting(reyting) ;
		assertEquals('C', q);
	}
	@Test
	public void testrayting_5() 
	{
		int reyting=75;
		int q=Exif_all.rayting(reyting) ;
		assertEquals('B', q);
	}
	@Test
	public void testrayting_6() 
	{
		int reyting=90;
		int q=Exif_all.rayting(reyting) ;
		assertEquals('A', q);
	}
	@Test
	public void testrayting_7() 
	{
		int reyting=101;
		int q=Exif_all.rayting(reyting) ;
		assertEquals('n', q);
	}
	@Test
	public void testrayting_8() 
	{
		int reyting=0;
		int q=Exif_all.rayting(reyting) ;
		assertEquals('F', q);
	}
	@Test
	public void testrayting_9() 
	{
		int reyting=-1;
		int q=Exif_all.rayting(reyting) ;
		assertEquals('n', q);
	}
	
	
	
}
