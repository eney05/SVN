package function;

public class ExFun 
{
	//��������� �������� ��� ������ �� ������ ���
	public String getDay(int numDay)
	{
		if (numDay <= 0 || numDay >= 8)
		{
			throw new IllegalArgumentException();
		}
		String[] days = { null, "�����������", "�������", "�����", "�������",
				"�������", "�������", "�����������" };
		return days[numDay];
	}
// ������� ��������� �����	
	public final static String[] massOne = { "����", "����", "���", "���",
			"������", "����", "�����", "����", "������", "������" };
	public final static String[] massDec = { "", "������", "��������",
			"��������", "�����", "���������", "����������", "���������",
			"�����������", "���������" };
	public final static String[] massHundreds = { "", "���", "������",
			"������", "���������", "�������", "��������", "�������",
			"���������", "���������" };
	public final static String[] massNacat = { "������", "����������",
			"����������", "����������", "������������", "�����������",
			"������������", "�����������", "�������������", "�������������" };

	// �������� ������ � �������� �����
	public String getString(int num)
	{
		if (num == 0)
		{
			return "����";
		}
		int divider = 10; // ��������
		int remain = 0;
		String string = "";
		int temp = num % 10; // ��� ��������� *������
		for (int i = 1; i <= 3; i++)
		{
			remain = num % divider;
			num /= 10;
			if (remain != 0)
			{
				if (i == 1)
				{
					string = massOne[remain];
				}
				if (i == 2)
				{
					if (remain == 1)
					{
						string = massNacat[temp];
					} else
					{
						if (temp == 0)
						{
							string = "";
						}
						string = massDec[remain] + " ".concat(string);
					}
				}
				if (i == 3)
				{
					string = massHundreds[remain] + " ".concat(string);
				}
			}
			if (string.endsWith(" "))
			{
				string = string.substring(0, string.length() - 1);
			}
		}
		return string;
	}
// �������� ����� �� ������
	public int getNumber(String string)
	{
		int count = 0;
		String[] stringsMass = string.split(" ");
		for (int i = stringsMass.length - 1, j = 1; i >= 0; i--, j++)
		{
			int dig = serchDig(stringsMass[i], j);
			if (dig == -1)
			{
				throw new IllegalArgumentException();
			}
			count += dig;
		}
		return count;
	}
// ���������� ������� ������ � ������
	private int serchDig(String string, int position)
	{
		int dig = 0;
		int i = 0;
		do
		{
			if (string.equals(massOne[i]))
			{
				dig = i;
				return dig;
			}
			i++;
		} while (i < massOne.length);
		i = 0;
		do
		{
			if (string.equals(massDec[i]))
			{
				dig = i * 10;
				return dig;
			}
			i++;
		} while (i < massDec.length);
		i = 0;
		do
		{
			if (string.equals(massHundreds[i]))
			{
				dig = i * 100;
				return dig;
			}
			i++;
		} while (i < massDec.length);
		i = 0;
		do
		{
			if (string.equals(massNacat[i]))
			{
				dig = i + 10;
				return dig;
			}
			i++;
		} while (i < massDec.length);

		return -1;
	}

	
/*	
	���������� ����� ����� ������� � ��������� ���������� ������������

	d = \/(�2� �1)2 + (y2� y1)2

	����������  �������  ��������� �������� ���������� ����� ������ ����� �������  ���������, ���� ������ ��������   ���������� ���� �����
*/
	public double getDistance(int[] x, int[] y)
	{
		if (x == null || x.length < 2 || y == null || y.length < 2)
		{
			throw new IllegalArgumentException();
		}
		double res = 0;
		res = Math.sqrt(Math.pow((x[0] - y[0]), 2) + Math.pow((x[1] - y[1]), 2));
		return res;
	}
	
}
