package function;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExFunTesttoString extends  ExFun  
{

	@Test
	public void testgetString0()
	{
		int num = 0;
		String rez = getString(num);
		assertEquals("ноль", rez);
	}
	@Test
	public void testgetString999()
	{
		int num = 999;
		String res = getString(num);
		assertEquals("дев€тьсот дев€носто дев€ть", res);
	}
	
	
	@Test
	public void testgetString1()
	{
		int num = 1;
		String res = getString(num);
		assertEquals("один", res);
	}

	@Test
	public void testgetString2()
	{
		int num = 7;
		String res = getString(num);
		assertEquals("семь", res);
	}

	@Test
	public void testgetString3()
	{
		int num = 10;
		String res = getString(num);
		assertEquals("дес€ть", res);
	}

	@Test
	public void testgetString4()
	{
		int num = 16;
		String res = getString(num);
		assertEquals("шестьнадцать", res);
	}

	@Test
	public void testgetString5()
	{
		int num = 20;
		String res = getString(num);
		assertEquals("двадцать", res);
	}

	@Test
	public void testgetString6()
	{
		int num = 29;
		String res = getString(num);
		assertEquals("двадцать дев€ть", res);
	}

	@Test
	public void testgetString7()
	{
		int num = 100;
		String res = getString(num);
		assertEquals("сто", res);
	}

	@Test
	public void testgetString8()
	{
		int num = 805;
		String res = getString(num);
		assertEquals("восемьсот п€ть", res);
	}

	@Test
	public void testgetString9()
	{
		int num = 710;
		String res = getString(num);
		assertEquals("семьсот дес€ть", res);
	}

	@Test
	public void testgetString10()
	{
		int num = 115;
		String res = getString(num);
		assertEquals("сто п€тьнадцать", res);
	}

	@Test
	public void testgetString11()
	{
		int num = 440;
		String res = getString(num);
		assertEquals("четыреста сорок", res);
	}

	@Test
	public void testgetString12()
	{
		int num = 555;
		String res = getString(num);
		assertEquals("п€тьсот п€тьдес€т п€ть", res);
	}



	
	
}
