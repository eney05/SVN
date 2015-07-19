package arr;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExArrTestSort extends ExArr{
// сортировка пузырьком 6 тестов
	@Test
	public void testSortBuble1() {
		int[] in = {2, 1};
		int[] out = {1, 2};
		int[] res = sortBuble(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortBuble2() {
		int[] in = {1};
		int[] out = {1};
		int[] res = sortBuble(in);
		assertArrayEquals(out, res);
	}	
	@Test
	public void testSortBuble3() {
		int[] in = {-1, -2};
		int[] out = {-2, -1};
		int[] res = sortBuble(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortBuble4() {
		int[] in = {5, 4, 3, 2, 1};
		int[] out = {1, 2, 3, 4, 5};
		int[] res = sortBuble(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortBuble5() {
		int[] in = {14, 55, 987, 0, -9};
		int[] out = {-9, 0, 14, 55, 987};
		int[] res = sortBuble(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortBuble0() {
		int[] in = {0};
		int[] out = {0};
		int[] res = sortBuble(in);
		assertArrayEquals(out, res);
	}
	
	
	
//сортировка выбором
	@Test
	public void testSortSelect1() {
		int[] in = {2, 1};
		int[] out = {1, 2};
		int[] res = sortSelect(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortSelect2() {
		int[] in = {1};
		int[] out = {1};
		int[] res = sortSelect(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortSelect3() {
		int[] in = {-1, -2};
		int[] out = {-2, -1};
		int[] res = sortSelect(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortSelect4() {
		int[] in = {14, 55, 987, 0, -9};
		int[] out = {-9, 0, 14, 55, 987};
		int[] res = sortSelect(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortSelect0() {
		int[] in = {0};
		int[] out = {0};
		int[] res = sortSelect(in);
		assertArrayEquals(out, res);
	}
//сортировка вставкой
	@Test
	public void testSortInsert1() {
		int[] in = {2, 1};
		int[] out = {1, 2};
		int[] res = sortInsert(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortInsert2() {
		int[] in = {1};
		int[] out = {1};
		int[] res = sortInsert(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortInsert3() {
		int[] in = {-1, -2};
		int[] out = {-2, -1};
		int[] res = sortInsert(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortInsert4() {
		int[] in = {14, 55, 987, 0, -9};
		int[] out = {-9, 0, 14, 55, 987};
		int[] res = sortInsert(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortInsert0() {
		int[] in = {0};
		int[] out = {0};
		int[] res = sortInsert(in);
		assertArrayEquals(out, res);
	}
//быстрая сортировка
	@Test
	public void testSortQuick1() {
		int[] in = {2, 1};
		int[] out = {1, 2};
		int r = in.length-1;
		int[] res = sortQuick(in,0,r);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortQuick2() {
		int[] in = {1};
		int[] out = {1};
		int r = in.length-1;
		int[] res = sortQuick(in,0,r);
		assertArrayEquals(out, res);
	}	
	@Test
	public void testSortQuick3() {
		int[] in = {-1, -2};
		int[] out = {-2, -1};
		int r = in.length-1;
		int[] res = sortQuick(in,0,r);
		assertArrayEquals(out, res);
	}	
	@Test
	public void testSortQuick4() {
		int[] in = {5, 4, 3, 2, 1};
		int[] out = {1, 2, 3, 4, 5};
		int r = in.length-1;
		int[] res = sortQuick(in,0,r);
		assertArrayEquals(out, res);
	}	
	@Test
	public void testSortQuick0() {
		int[] in = {0};
		int[] out = {0};
		int r = in.length-1;
		int[] res = sortQuick(in,0,r);
		assertArrayEquals(out, res);
	}
	
//сортировка слиянием	
	@Test
	public void testSortMerge1() {
		int[] in = {2, 1};
		int[] out = {1, 2};
		int[] res = sortMerge(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortMerge2() {
		int[] in = {1};
		int[] out = {1};
		int[] res = sortMerge(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortMerge3() {
		int[] in = {-1, -2};
		int[] out = {-2, -1};
		int[] res = sortMerge(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortMerge4() {
		int[] in = {14, 55, 987, 0, -9};
		int[] out = {-9, 0, 14, 55, 987};
		int[] res = sortMerge(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortMerge0() {
		int[] in = {0};
		int[] out = {0};
		int[] res = sortMerge(in);
		assertArrayEquals(out, res);
	}
	
	
//сортировка шелла
	@Test
	public void testSortShell1() {
		int[] in = {2, 1};
		int[] out = {1, 2};
		int[] res = sortShell(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortShell2() {
		int[] in = {1};
		int[] out = {1};
		int[] res = sortShell(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortShell3() {
		int[] in = {-1, -2};
		int[] out = {-2, -1};
		int[] res = sortShell(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortShell4() {
		int[] in = {14, 55, 987, 0, -9};
		int[] out = {-9, 0, 14, 55, 987};
		int[] res = sortShell(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortShell0() {
		int[] in = {0};
		int[] out = {0};
		int[] res = sortShell(in);
		assertArrayEquals(out, res);
	}
	
// КУЧА!!!!
	@Test
	public void testSortHeap1() {
		int[] in = {2, 1};
		int[] out = {1, 2};
		int[] res = sortHeap(in);
		assertArrayEquals(out, res);
	}
	@Test
	public void testSortHeap2() {
		int[] in = {1};
		int[] out = {1};
		int[] res = sortHeap(in);
		assertArrayEquals(out, res);
	}	
	@Test
	public void testSortHeap3() {
		int[] in = {-1, -2};
		int[] out = {-2, -1};
		int[] res = sortHeap(in);
		assertArrayEquals(out, res);
	}	
	@Test
	public void testSortHeap4() {
		int[] in = {14, 55, 987, 0, -9};
		int[] out = {-9, 0, 14, 55, 987};
		int[] res = sortHeap(in);
		assertArrayEquals(out, res);
	}	
	@Test
	public void testSortHeap0() {
		int[] in = {0};
		int[] out = {0};
		int[] res = sortHeap(in);
		assertArrayEquals(out, res);
	}
}
