package arrayandarraylist;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

/**
 * Class with methods for working with and manipulating Arrays and ArrayLists. 
 */
public class ArrayAndArrayList {

	//ArrayAndArrayList myArrayAndArrayList;
	/**
	 * Counts the number of occurrences of the given element in the given array.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling howMany(array, 1) would return 2
     * - Calling howMany(array, 10) would return 0
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling howMany(array, 1) would return 0
     * 
	 * @param array to search
	 * @param element to search for
	 * @return number of times element is in array
	 */
	public static int howMany(int[] array, int element) {
		// TODO Implement method
		int count=0;
		for(int i=0;i<array.length;i++) {
			if (array[i]==element) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Finds the max number in the given array.
	 * If the array is empty, returns -1.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling findMax(array) would return 9
	 * 
	 * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling findMax(array) would return 12
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling findMax(array) would return -1
     * 
	 * @param array to search
	 * @return max number in array
	 */
	public static int findMax(int[] array) {
		// TODO Implement method
		int max;
		if(array.length==0) {
			max=-1;
		}
		else {
		max=array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		}
		return max;
	}
	
	/**
	 * Keeps track of every occurrence of the max number in the given array.
	 * Returns an ArrayList that contains every occurrence of the max number.
	 * Uses the findMax(int[] array) method.
	 * If the array is empty, returns null.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling maxArray(array) would return an ArrayList containing 9
     * 
     * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling maxArray(array) would return an ArrayList containing 12 and 12
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling maxArray(array) would return null
     * 
	 * @param array to search
	 * @return ArrayList containing every instance of the max
	 */
	public static ArrayList<Integer> maxArray(int[] array) {
		// TODO Implement method
		int max=findMax(array);
		if(max==-1) {
			return null;
		}
		else {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<array.length;i++) {
			if(array[i]==max) {
				list.add(array[i]);
			}
		}
		//return list;
		return(list);
		}
	}
	
	/**
	 * Puts all of the zeros in the given array, at the end of the given array.
	 * Updates the array itself.
	 * Maintains the order of the non-zeros.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
     * - Calling swapZero(array) would change the array to be: {1, 2, 3, 5, 0, 0, 0, 0};
     * 
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 10};
     * - Calling swapZero(array) wouldn't change the array, it would still be: {1, 3, 5, 7, 9, 10};
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling swapZero(array) wouldn't change the array, it would still be empty
     * 
	 * @param array to search for zeros
	 */
	//@SuppressWarnings({ "null", "null" })
	public static int[] swapZero(int[] array) {
		// TODO Implement method
		int count = 0;  // Count of non-zero elements
		 int n=array.length;
        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (array[i] != 0)
                array[count++] = array[i]; // here count is
                                       // incremented
 
        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            array[count++] = 0;
		
        return array;
		
	}
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		System.out.println(howMany(array,1));
		System.out.println(findMax(array));
		System.out.println(maxArray(array));
		int[] arr2= {2,0,1,4,0,6,0,7};
		int[] a= swapZero(arr2);
		for (int i = 0; i < a.length; i++) //for loop to print the array  
			System.out.print( a[i]+ " ");     
		
	}
}