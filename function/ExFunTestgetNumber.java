package function;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExFunTestgetNumber extends  ExFun  {

	@Test
	public void testGetNumber1() {
	
		   String string = "����";
	        int i = getNumber(string);
	        assertEquals(1,i);
	}
	@Test
	public void testGetNumber2() {
	
		   String string = "������ ����������";
	        int i = getNumber(string);
	        assertEquals(211,i);
	}	
	@Test
	public void testGetNumber3() {
		
		   String string = "���";
	        int i = getNumber(string);
	        assertEquals(100,i);
	}	
	@Test
	public void testGetNumber0() {
		
		   String string = "����";
	        int i = getNumber(string);
	        assertEquals(0,i);
	}	
	@Test
	public void testGetNumber999() {
		
		   String string = "��������� ��������� ������";
	        int i = getNumber(string);
	        assertEquals(999,i);
	}
}
