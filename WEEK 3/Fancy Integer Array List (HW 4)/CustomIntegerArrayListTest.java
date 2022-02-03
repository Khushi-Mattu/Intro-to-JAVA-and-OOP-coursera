package integerarraylist;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomIntegerArrayListTest {

	@Test
	void testGetArrayList() {
		
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst1, arr1.getArrayList());

		ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
		arr4Elements.add(100);
		arr4Elements.add(200);
		arr4Elements.add(500);
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(100);
		lst4.add(200);
		lst4.add(500);

		assertEquals(lst4, arr4.getArrayList());
		
		// TODO write at least 3 additional test cases 
		assertNotEquals(lst4,lst1);
		assertNotEquals(lst4, arr1.getArrayList());
		assertNotEquals(lst1,arr4.getArrayList());
	}

	@Test
	void testGet() {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);

		assertEquals((int)lst1.get(0),(int) arr1.get(0));
		//assertEquals((int)lst1.get(1),(int) arr1.get(1));
		assertEquals((int)lst1.get(2), (int) arr1.get(2));
		
		//assertNotEquals((int) lst1.get(4),(int)  arr1.get(4));
		assertEquals((int) lst1.get(1), (int)arr1.get(1));
		assertNotEquals((int) lst1.get(1), (int)arr1.get(2));
		assertNotEquals((int) lst1.get(0), (int)arr1.get(2));
		// TODO write at least 3 additional test cases 
		
		assertTrue(lst1.size()==3);
		//assertFalse((int)lst1.get(3)== (int) arr1.get(3));
		//assertNotEquals(lst1,arr1);
	}

	@Test
	void testAddInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		// TODO write at least 3 additional test cases 
		assertTrue(lst1.get(0)==2);
		assertFalse(lst1.get(1)==5);
		assertNotEquals(lst1.get(1), arr1.get(2));
	}

	@Test
	void testAddIntInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.add(0, 5);
		arr1.add(0, 6);
		arr1.add(0, 7);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		lst1.add(0, 5);
		lst1.add(0, 8);
		lst1.add(0, 7);

		assertEquals((int)lst1.get(0),(int) arr1.get(0));
		//assertEquals((int)lst1.get(1),(int) arr1.get(1));
		assertEquals((int)lst1.get(2), (int) arr1.get(2));
		
		//assertNotEquals((int) lst1.get(4),(int)  arr1.get(4));
		assertNotEquals((int) lst1.get(0), (int)arr1.get(2));
		assertEquals((int)lst1.get(3), (int)arr1.get(3));
		assertTrue(lst1.size()==6);
		assertFalse(lst1.size()==4);
	}

	@Test
	void testRemoveInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(0);
		arr1.remove(1);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		lst1.remove(0);
		lst1.remove(1);
		
		assertFalse(arr1.get(0)==2);
		assertEquals(lst1, arr1.getArrayList());
		arr1.add(1,6);
		lst1.add(1,8);
		assertNotEquals(lst1, arr1.getArrayList());
		assertTrue(arr1.get(1)==6);
	}

	@Test
	void testRemoveIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(3, 3);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		assertNotEquals(lst1, arr1.getArrayList());
		assertTrue(lst1.size()==3);
		assertFalse(lst1.size()==2);
	}

	@Test
	void testSpliceIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 2);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals((int)lst1.get(0),(int) arr1.get(0));
		//assertEquals((int)lst1.get(1),(int) arr1.get(1));
		assertEquals((int)lst1.get(2), (int) arr1.get(2));
		
		//assertNotEquals((int) lst1.get(4),(int)  arr1.get(4));
		assertEquals((int) lst1.get(1), (int)arr1.get(1));
		assertNotEquals((int) lst1.get(1), (int)arr1.get(2));

		// TODO write at least 3 additional test cases 
		//assertEquals(arr1, lst1.getArrayList());
		assertTrue(lst1.size()==3);
		assertFalse(lst1.size()==6);
	}

	@Test
	void testSpliceIntIntIntArray() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 1, new int[] { 4, 5 });
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 
		assertEquals((int)lst1.get(0),(int) arr1.get(0));
		//assertEquals((int)lst1.get(1),(int) arr1.get(1));
		assertEquals((int)lst1.get(2), (int) arr1.get(2));
		assertTrue(lst1.size()==6);
	}

}