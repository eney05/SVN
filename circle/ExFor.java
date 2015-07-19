
package circle;

//����� ������������� �����
public class ExFor 
{
	public static int[] summCount(int startDiap, int finishDiap)
	{
	int[] count = new int[2];
	for (int i = startDiap; i < finishDiap; i++)
	{
		if (i % 2 == 0)
		{
			count[0] += i;
			count[1]++;
		}
		}
	return count;
	}	
//������� �� �����		
	public static boolean prost(int a) 
	{
		boolean test = true;
		if (a < 2)
		{
			return false;
		}
		for (int i = 2; i * i <= a; i++)
		{
		if (a % i == 0)
		{
			test = false;
		}
		}
		return test;
	}
	
// ������ ������������ �����	
	public static int nat(int n) 
	{
	int res = 0;
		if (n != 0)
		{
			do
			{
				++res;
			} 
			while (res * res <= Math.abs(n));
		}
	if (res != 0)
		{ 
		--res;
		}
	else res=0;
	return res;
	}

//���������	
	public static int fa(int n) 
	{
		int res=1;
		if (n > 0)
		{
			for (int i = n; i >= 1; i--) 
				{
				res *= i;
				}
			}
			else 
			{
				res = -1;
			}
		return res;
	}

	
//	����� ���� ��������� �����
	public static int sum2(int n) 
	{
		int res=0;
		while (n != 0)
		{
			res += n % 10;
			n /= 10;
		}
	
		res = Math.abs(res);
		return res;
	}

	
	
// ���������� ����������� ������������������	
	public static int zer(int n) 
	{
		int res=0;
		while (n != 0)
		{
			res = res * 10 + n % 10;
			n /= 10;
		}
		res = Math.abs(res);
		return res;
	}
	
	
	
	
	
}
