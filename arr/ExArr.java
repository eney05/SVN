package arr;

import java.util.Arrays;

// ������� ������� 1-8
public class ExArr 
{
	// ����� ����������� ������� �������
	public int minnums (int[] nums)
	{
		int min = nums[0];
		for (int i : nums)
		{
			if (i < min)
			{
				min = i;
			}
		}
		return min;
	}
	
	// ����� �a���������� ������� �������
	public int maxnums(int[] nums)
	{
		int max = nums[0];
		for (int i : nums)
		{
			if (i > max)
			{
				max = i;
			}
		}
		return max;
	}
	
	// ����� ������ ������������ �������� �������
	public int indexmin(int[] nums)
	{
		int myindex = 0;
		int min = nums[0];
		for (int i = 1; i < nums.length; i++)
		{
			if (nums[i] < min)
			{
				min = nums[i];
				myindex = i;
			}
		}
		return myindex;
	}
	
	// ����� ������ ������������� �������� �������
	public int indexmax(int[] nums)
	{
		int myindex = 0;
		int max = nums[0];
		for (int i = 1; i < nums.length; i++)
		{
			if (nums[i] > max)
			{
				max = nums[i];
				myindex = i;
			}
		}
		return myindex;
	}
	
	// ��������� ����� ��������� ������� � ��������� ���������
	public int sum1(int[] nums)
	{
		int sum1 = 0;
		for (int i = 0; i < nums.length; i++)
		{
			if (i % 2 != 0)
			{
				sum1 += nums[i];
			}
		}
		return sum1;
	}

	// ������� ������ ������� (������ � �������� �����������)
	public int[] revers(int[] nums)
	{
		if (nums == null || nums.length == 0)
		{
			return new int[0];
		}
		int[] revers = new int[nums.length];
		int j = 0;
		for (int i = nums.length - 1; i >= 0; i--)
		{
			revers[j] = nums[i];
			j++;
		}
		return revers;
	}
	
	// ��������� ���������� �������� ��������� �������
	public int count2(int[] nums)
	{
		int count = 0;
		if (nums != null)
		{
			for (int i = 0; i < nums.length; i++)
			{
				if (nums[i] % 2 != 0)
				{
					count++;
				}
			}
		}
		return count;
	}
	
	// �������� ������� ������ � ������ �������� �������, ��������, ��� �������
	// 1 2 3 4, ��������� 3 4 1 2
	public int[] change(int[] nums)
	{
		int[] res = {};
		if (nums != null)
		{
			res = new int[nums.length];
			int cpos;
			if (nums.length % 2 == 0)
			{
				cpos = nums.length / 2;
			} else
			{
				cpos = nums.length / 2 + 1;
				res[cpos - 1] = nums[cpos - 1];
			}
			for (int i = 0, j = cpos; j < nums.length; i++, j++)
			{
				res[j] = nums[i];
				res[i] = nums[j];
			}
		}
		return res;
	}
// ���������� ���������
	public int[] sortBuble(int[] nums)
	{
		for(int i = 1; i < nums.length; i++)
		{
	        int temp = nums[i];
	        int pos = i - 1;
	            while(pos >= 0 && nums[pos] > temp)
	            {
	                nums[pos+1] = nums[pos];
	                nums[pos] = temp;
	                pos--;
	            }
	    }
		return nums;
	}
	// ���������� �������
	public int[] sortSelect(int[] nums)
	{
		int size= nums.length;
		for (int i = 0; i < size; i++) 
		{
	            // ������ ����������� ������� ��
	            // ���������� �������� [i; size);
	            // ���������� ��� ������ ����� i
	            int minIndex = i;
	            // ��������� ���������� �������� ����������
	            for (int j = i + 1; j < size; j++) 
	            {
	                // ���� ������� � ������� j ������
	                // �������� � ������� minValueIndex, ��
	                // ���������� �������� �������� �������
	                if (nums[j] < nums[minIndex]) 
	                {
	                    minIndex = j;
	                }
	            }
	            // ������ ������� ������� � �����������
	            int temp = nums[i];
	            nums[i] = nums[minIndex];
	            nums[minIndex] = temp;
	        }
		return nums;
	}
	
	// ���������� ��������
	public int[] sortInsert(int[] nums)
	{
		int size= nums.length;
   
		for (int i = 0; i < size; i++)
	        {
	          int temp = nums[i];// �������� i-�� �������
	          int j =i-1;//����� ���� ������� � i-1 �������� 
	          while(j >= 0 && nums[j] > temp)
	          // ���� �� �������� ������ ������� 
	          // ��� �� ����� ������� ������ i-1-��
	          // ������� ��������� � ���������� temp
	          {
	            nums[j + 1] = nums[j];
	            //������������ ������� �����
	            j--;
	          }
	          nums[j + 1] = temp;
	          // ���������� i-1 ������� 
	        }    
		return nums;
	}
	
	// ���������� �������
	public int[] sortQuick(int[] nums, int l, int r )
	{
        int i = l;
        int j = r;
        int x = nums[i - (i - j) / 2];
        while (i <= j) 
        {
            while (nums[i] < x) 
            {
                i++;
            }
            while (nums[j] > x) 
            {
                j--;
            }
            if (i <= j) 
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        if (l<j)
        {
        	sortQuick(nums, l, j);
        }
        if(i<r)
        {
        	sortQuick(nums, i, r);
        }
    return nums;
	}
	
	// ���������� ��������
	public int[] sortMerge(int[] nums)
	{
			if(nums.length < 2) return nums;
			int m = nums.length / 2;
			int[] arr1 = Arrays.copyOfRange(nums, 0, m);
			int[] arr2 = Arrays.copyOfRange(nums, m, nums.length);
			return merge(sortMerge(arr1), sortMerge(arr2));
		}
		//������� ���� �������� � ���� ���������������
		public static int[] merge(int[] arr1,int arr2[])
		{
			int n = arr1.length + arr2.length;
			int[] nums = new int[n];
			int i1=0;
			int i2=0;
			for(int i=0;i<n;i++)
			{
				if(i1 == arr1.length)
				{
					nums[i] = arr2[i2++];				
				}
				else if(i2 == arr2.length)
				{
					nums[i] = arr1[i1++];
				}
				else
				{
					if(arr1[i1] < arr2[i2])
					{
						nums[i] = arr1[i1++];
					}
					else
					{
						nums[i] = arr2[i2++];
					}
				}
			}
			return nums;
	}
		
	// ���������� �����
	public int[] sortShell(int[] nums)
	{
		int size= nums.length;
		 int step = size / 2;//�������������� ���.
		    while (step > 0)//���� ��� �� 0
		    {
		      for (int i = 0; i < (size - step); i++)
		                {
		                    int j = i;
		                    //����� ���� ������� � i-�� ��������
		                    while (j >= 0 && nums[j] > nums[j + step])
		                    //���� �� ������ � ������ �������
		                    //� ���� ��������������� ������� ������
		                    //��� ������� ����������� �� ���������� ����
		                    {
		                        //������ �� �������
		                        int temp = nums[j];
		                        nums[j] = nums[j + step];
		                        nums[j + step] = temp;
		                        j--; 
		                    }
		                }
		                step = step / 2;//��������� ���
		            }    
		return nums;
	}
	
	// ���������� �����
	public int[] sortHeap(int[] nums)
	{
	    //���������� ���� ����������
	        int n = nums.length;
	        heapMake(nums);
	        while (n > 0) 
	        {
	            swap(nums, 0, n - 1);
	            n--;
	            heapify(nums, n, 0);}
				return nums;
	        }
	
	        public int[] heapMake(int[] nums) 
	        {  //���������� ���� �� ������� ��� 
		        int n = nums.length;                    //������ ������� heapify  
		        for (int i = n - 1; i >= 0; i--) 
		        {
		            heapify(nums, n, i);
		        }
		        return nums;
		    }
		    public void heapify(int[] nums, int size, int pos) 
		    {    
		        while (2 * pos + 1 < size) 
		        {                       //��������� ������������ 
		            int t = 2 * pos + 1;                           //������� � ���� �  
		                                                           //������� � pos
		            if (2 * pos + 2 < size && nums[2 * pos + 1] < nums[2 * pos + 2]) 
		            {
		                t = 2 * pos + 2;
		            }
		            if (nums[pos] < nums[t]) 
		            {
		                swap(nums, pos, t);
		                pos = t;
		            } 
		            else 
		            {
		                break;
		            }
		        }
		     }  
			public int[] swap(int[] nums, int i, int j) 
				{ //������ ������� 
			        int temp = nums[i];                                //�������� �   
			        nums[i] = nums[j];                                //��������� i � j
			        nums[j] = temp;                                    //� ������� array
	return nums;
	}
}


	
	

