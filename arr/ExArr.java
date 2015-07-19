package arr;

import java.util.Arrays;

// Массивы задания 1-8
public class ExArr 
{
	// Найти минимальный элемент массива
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
	
	// Найти мaксимальный элемент массива
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
	
	// Найти индекс минимального элемента массива
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
	
	// Найти индекс максимального элемента массива
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
	
	// Посчитать сумму элементов массива с нечетными индексами
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

	// Сделать реверс массива (массив в обратном направлении)
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
	
	// Посчитать количество нечетных элементов массива
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
	
	// Поменять местами первую и вторую половину массива, например, для массива
	// 1 2 3 4, результат 3 4 1 2
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
// Сортировка пузырьком
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
	// сортировка выбором
	public int[] sortSelect(int[] nums)
	{
		int size= nums.length;
		for (int i = 0; i < size; i++) 
		{
	            // Найдем минимальный элемент на
	            // промежутке индексов [i; size);
	            // изначально его индекс равен i
	            int minIndex = i;
	            // Переберем оставшиеся элементы промежутка
	            for (int j = i + 1; j < size; j++) 
	            {
	                // Если элемент в позиции j меньше
	                // элемента в позиции minValueIndex, то
	                // необходимо обновить значение индекса
	                if (nums[j] < nums[minIndex]) 
	                {
	                    minIndex = j;
	                }
	            }
	            // Меняем текущий элемент с минимальным
	            int temp = nums[i];
	            nums[i] = nums[minIndex];
	            nums[minIndex] = temp;
	        }
		return nums;
	}
	
	// сортировка вставкой
	public int[] sortInsert(int[] nums)
	{
		int size= nums.length;
   
		for (int i = 0; i < size; i++)
	        {
	          int temp = nums[i];// запомним i-ый элемент
	          int j =i-1;//будем идти начиная с i-1 элемента 
	          while(j >= 0 && nums[j] > temp)
	          // пока не достигли начала массива 
	          // или не нашли элемент больше i-1-го
	          // который храниться в переменной temp
	          {
	            nums[j + 1] = nums[j];
	            //проталкиваем элемент вверх
	            j--;
	          }
	          nums[j + 1] = temp;
	          // возвращаем i-1 элемент 
	        }    
		return nums;
	}
	
	// сортировка быстрая
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
	
	// сортировка слиянием
	public int[] sortMerge(int[] nums)
	{
			if(nums.length < 2) return nums;
			int m = nums.length / 2;
			int[] arr1 = Arrays.copyOfRange(nums, 0, m);
			int[] arr2 = Arrays.copyOfRange(nums, m, nums.length);
			return merge(sortMerge(arr1), sortMerge(arr2));
		}
		//слияние двух массивов в один отсортированный
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
		
	// сортировка шелла
	public int[] sortShell(int[] nums)
	{
		int size= nums.length;
		 int step = size / 2;//инициализируем шаг.
		    while (step > 0)//пока шаг не 0
		    {
		      for (int i = 0; i < (size - step); i++)
		                {
		                    int j = i;
		                    //будем идти начиная с i-го элемента
		                    while (j >= 0 && nums[j] > nums[j + step])
		                    //пока не пришли к началу массива
		                    //и пока рассматриваемый элемент больше
		                    //чем элемент находящийся на расстоянии шага
		                    {
		                        //меняем их местами
		                        int temp = nums[j];
		                        nums[j] = nums[j + step];
		                        nums[j + step] = temp;
		                        j--; 
		                    }
		                }
		                step = step / 2;//уменьшаем шаг
		            }    
		return nums;
	}
	
	// сортировка кучей
	public int[] sortHeap(int[] nums)
	{
	    //Собственно сама сортировка
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
	        {  //Построение кучи из массива при 
		        int n = nums.length;                    //помощи функции heapify  
		        for (int i = n - 1; i >= 0; i--) 
		        {
		            heapify(nums, n, i);
		        }
		        return nums;
		    }
		    public void heapify(int[] nums, int size, int pos) 
		    {    
		        while (2 * pos + 1 < size) 
		        {                       //Процедура нормализации 
		            int t = 2 * pos + 1;                           //подкучи в куче с  
		                                                           //головой в pos
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
				{ //Меняет местами 
			        int temp = nums[i];                                //элементы с   
			        nums[i] = nums[j];                                //индексами i и j
			        nums[j] = temp;                                    //в массиве array
	return nums;
	}
}


	
	

