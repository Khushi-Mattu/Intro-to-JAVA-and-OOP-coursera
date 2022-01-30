package arrayandarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
class ArrayAndArrayListTest {

	// declare myArrayAndArrayList which is the object for testing
	ArrayAndArrayList myArrayAndArrayList;
	
	@BeforeEach
	void setUp() throws Exception {
		// initialize myArrayAndArrayList for testing
		this.myArrayAndArrayList = new ArrayAndArrayList();
	}
	
	/**
	 * Test howMany method in ArrayAndArrayList.
	 */
	@Test
	void testHowMany() {
		// element in the array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(2, ArrayAndArrayList.howMany(array, 1));
		assertFalse( ArrayAndArrayList.howMany(array, 7)==3,"should return 1");
		assertTrue(ArrayAndArrayList.howMany(array, 3)==2);
		assertNotEquals(1, ArrayAndArrayList.howMany(array, 1));
		// TODO write at least 3 additional test cases 
	}
	
	/**
	 * Test findMax method in ArrayAndArrayList.
	 */
	@Test
	void testFindMax() {
		// findMax in an nonEmpty array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(9, ArrayAndArrayList.findMax(array));
		assertTrue(ArrayAndArrayList.findMax(array)==9);
		assertFalse(ArrayAndArrayList.findMax(array)==3);
		assertNotEquals(1, ArrayAndArrayList.findMax(array));
		// TODO write at least 3 additional test cases 
	}

	/**
	 * Test maxArray method in ArrayAndArrayList.
	 */
	@Test
	void testMaxArray() {
		// test a valid array. 
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		int[] arr=new int[0];
		ArrayList<Integer> testArrayList = new ArrayList<Integer>();
		ArrayList<Integer> lis = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		testArrayList.add(9);
		lis.add(1);
		list.add(null);
		assertNotEquals(list, ArrayAndArrayList.maxArray(arr));
		assertEquals(testArrayList, ArrayAndArrayList.maxArray(array));
		assertNotEquals(ArrayAndArrayList.maxArray(array),lis);
		assertEquals(null, ArrayAndArrayList.maxArray(arr));
		
		
		// TODO write at least 3 additional test cases 
	}

	/**
	 * Test swapZero method in ArrayAndArrayList.
	 */
	@Test
	void testSwapZero() {
		// test an array containing 0
		int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
		int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
		assertFalse(Arrays.equals(array, testArray));
		int[] a=ArrayAndArrayList.swapZero(array);
		assertTrue(Arrays.equals(a,array));
		ArrayAndArrayList.swapZero(array);
		assertArrayEquals(testArray, array);
		assertTrue(Arrays.equals(a, testArray));
		
		//assertTrue(this.myArrayAndArrayList.swapZero(array)==testArray);
		
		// TODO write at least 3 additional test cases 
		
	}

}
