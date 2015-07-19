package function;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExFunTest extends ExFun {

	@Test
	public void testGetDayMonday()
	{
		int numberDay = 1;
		String day = getDay(numberDay);
		assertEquals(day, "Понедельник");
	}

	@Test
	public void testGetDayTuesday()
	{
		int numDay = 2;
		String day = getDay(numDay);
		assertEquals(day, "Вторник");
	}

	@Test
	public void testGetDayWednesday()
	{
		int numDay = 3;
		String day = getDay(numDay);
		assertEquals(day, "Среда");
	}

	@Test
	public void testGetDayThursday()
	{
		int numDay = 4;
		String day = getDay(numDay);
		assertEquals(day, "Четверг");
	}

	@Test
	public void testGetDayFriday()
	{
		int numDay = 5;
		String day = getDay(numDay);
		assertEquals(day, "Пятница");
	}

	@Test
	public void testGetDaySaturday()
	{
		int numDay = 6;
		String day = getDay(numDay);
		assertEquals(day, "Суббота");
	}

	@Test
	public void testGetDaySunday()
	{
		int numDay = 7;
		String day = getDay(numDay);
		assertEquals(day, "Воскресенье");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetDayNull()
	{
		getDay(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetDayEight()
	{
		getDay(8);
	}

	
	
	
	
	
}
