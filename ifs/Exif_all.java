
public class Exif_all 
{
//если а четное то счтитать * инчаче +
	public static int chet(int a, int b) 
	{
		int rezult=0;
		if (a==0) 
		{
			rezult=0;
		}
		else
		{
			rezult=a%2==0?a*b:a+b;
		}
		return rezult;
	}
	
	//определить четверть
	public static int quoter(int x, int y) {
		int ret=0;
		if (x>0 && y>0)
		{
			ret = 1;	
		}
		else if (x<0 && y>0)
		{
			ret = 2;	
		}
		else if (x<0 && y<0)
		{
			ret = 3;	
		}
		else if (x>0 && y<0)
		{
			ret = 4;	
		}
		else
		{
			ret = 0;
//			throw new IllegalArgumentException();
		}
		return ret;
	}
	
	//сумма только положительных
	public static int poloj(int x, int y, int z) {
		int rez=0;
		if (x>0) 
		{
			rez=rez+x;
		}
		if (y>0) 
		{
			rez=rez+y;
		}
		if (z>0) 
		{
			rez=rez+z;
		}
		return rez;
	}
	// максимум
	public static int max(int a, int b, int c) {
			
	int rezsum=0, rezmulti=0, max=0;
	rezsum=a+b+c;
	rezmulti=a*b*c;
	
	if (rezsum>rezmulti) 
	{
		max=rezsum+3; 
	}
	else 
	{
		max=rezmulti+3;
	}
	return max;
	}
	
	// рейтинг
	public static int rayting(int reyting) {
		char rez;
		if (reyting<0)
		{
			rez = 'n';
		}
		else if (reyting<20) 
		{
			rez= 'F';
		}
		else if (reyting<40) 
		{
			rez= 'E';
		}
		else if (reyting<60) 
		{
			rez= 'D';
		}
		else if (reyting<75) 
		{
			rez= 'C';
		}
		else if (reyting<90) 
		{
			rez= 'B';
		}
		else if (reyting<=100) 
		{
			rez= 'A';
		}
		else if (reyting>100) 
		{
			rez= 'n';
		}
		else 
		{
			rez='n';
		}
		return rez;
	}
}
