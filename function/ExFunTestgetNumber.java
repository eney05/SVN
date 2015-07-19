package function;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExFunTestgetNumber extends  ExFun  {

	@Test
	public void testGetNumber1() {
	
		   String string = "один";
	        int i = getNumber(string);
	        assertEquals(1,i);
	}
	@Test
	public void testGetNumber2() {
	
		   String string = "двести одинадцать";
	        int i = getNumber(string);
	        assertEquals(211,i);
	}	
	@Test
	public void testGetNumber3() {
		
		   String string = "сто";
	        int i = getNumber(string);
	        assertEquals(100,i);
	}	
	@Test
	public void testGetNumber0() {
		
		   String string = "ноль";
	        int i = getNumber(string);
	        assertEquals(0,i);
	}	
	@Test
	public void testGetNumber999() {
		
		   String string = "девятьсот девяносто девять";
	        int i = getNumber(string);
	        assertEquals(999,i);
	}
}
