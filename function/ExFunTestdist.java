package function;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExFunTestdist extends  ExFun {
	double delta=1e-4;
	
	@Test
	public final void testGetDistance1()
	{
		int[] x = { 1, 1 };
		int[] y = { -1, -1 };
		double res = getDistance(x, y);
		assertEquals(2.8284, res, delta);
	}

	@Test
	public final void testGetDistance2()
	{
		int[] x = { 1, 1 };
		int[] y = { -1, 1 };
		double res = getDistance(x, y);
		assertEquals(2.0, res, delta);
	}

	@Test
	public final void testGetDistance3()
	{
		int[] x = { 1, 0 };
		int[] y = { 1, 1 };
		double res = getDistance(x, y);
		assertEquals(1.0, res, delta);
	}

	@Test
	public final void testGetDistance4()
	{
		int[] x = { 0, 0 };
		int[] y = { 1, 1 };
		double res = getDistance(x, y);
		assertEquals(1.4142, res, delta);
	}

	@Test
	public final void testGetDistance5()
	{
		int[] x = { 1, 1 };
		int[] y = { 1, 1 };
		double res = getDistance(x, y);
		assertEquals(0, res, delta);
	}
}
