package reverseArray;

import static org.junit.Assert.*;

import org.junit.Test;


public class Exercise1Test {
	
	@Test
	public void testNull() {
		int[] arr = null;
		Exercise1.reverseArray(arr);
		assertArrayEquals(null, arr);
	}
	
	@Test
	public void testEmpty() {
		int[] arr = {};
		Exercise1.reverseArray(arr);
		assertArrayEquals(new int[] {}, arr);
	}
	
	@Test
	public void testOneLength() {
		int[] arr = { 1 };
		Exercise1.reverseArray(arr);
		assertArrayEquals(new int[] { 1 }, arr);
	}
	
	@Test
	public void testOddLength() {
		int[] arr = { 1, 2, 3 };
		Exercise1.reverseArray(arr);
		assertArrayEquals(new int[] { 3, 2, 1 }, arr);
	}
	
	@Test
	public void testEvenLength() {
		int[] arr = { 1, 2, 3, 4};
		Exercise1.reverseArray(arr);
		assertArrayEquals(new int[] { 4, 3, 2, 1 }, arr);
	}

}
