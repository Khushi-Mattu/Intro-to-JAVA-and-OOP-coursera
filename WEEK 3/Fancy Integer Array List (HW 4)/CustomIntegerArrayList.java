package integerarraylist;

import java.util.*;

/**
 * Fancy ArrayList that stores integers and supports additional operations not included in Java's built-in ArrayList methods.
 */
public class CustomIntegerArrayList {

	// instance variables

	/**
	 * Internal ArrayList of elements.
	 */
	private ArrayList<Integer> arr;

	
	// constructors
	
	/**
	 * Creates a new empty CustomIntegerArrayList.
	 */
	public CustomIntegerArrayList() {
		this.arr = new ArrayList<Integer>();
	}
	
	/**
	 * Creates a new CustomIntegerArrayList with the elements in the given ArrayList.
	 * @param arr with elements for the CustomIntegerArrayList
	 */
	public CustomIntegerArrayList(ArrayList<Integer> arr) {
		this.arr = new ArrayList<Integer>(arr);
	}

	// methods
	
	/**
	 * Returns the internal ArrayList of elements.
	 * 
	 * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 5, 5, 2
     * - Calling getArrayList() would return the internal ArrayList containing the integers: 5, 5, 2
     * 
     * - For a defined CustomIntegerArrayList containing the integers: 100, 200, 500
     * - Calling getArrayList() would return the internal ArrayList containing the integers: 100, 200, 500
     * 
	 * @return internal ArrayList arr
	 */
	public ArrayList<Integer> getArrayList() {
		// TODO Implement method
		return this.arr;
	}

	/**
	 * Returns the element at the specified index from the internal ArrayList of elements.
	 * 
	 * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 5, 5, 2
     * - Calling get(0) would return 5
     * - Calling get(1) would return 5
     * - Calling get(2) would return 2
     * 
     * - For a defined CustomIntegerArrayList containing the integers: 100, 200, 500
     * - Calling get(0) would return 100
     * - Calling get(1) would return 200
     * - Calling get(2) would return 500
     * 
	 * @param index of the item to get
	 * @return element at specified index
	 */
	public int get(int index) {
		// TODO Implement method
		return this.arr.get(index);
	}

	/**
	 * Appends the given element to the end of the internal ArrayList of elements.
	 * 
	 * Example(s):
     * - For a defined empty CustomIntegerArrayList  
     * - Calling add(21) would add the element 21 to the internal ArrayList at index 0
     * - Then, calling get(0) would return 21
     * - Calling add(44) would add the element 44 to the internal ArrayList at index 1
     * - Then, calling get(1) would return 44
     * - Calling add(67) would add the element 67 to the internal ArrayList at index 2
     * - Then, calling get(2) would return 67
     * 
	 * @param element to append
	 */
	public void add(int element) {
		// TODO Implement method
		this.arr.add(element);
	}

	/**
	 * Inserts the given element at the specified index. 
	 * 
	 * Example(s):
     * - For a new defined empty CustomIntegerArrayList  
     * - Calling add(0, 2) would add the element 2 to the internal ArrayList at index 0
     * - Then, calling get(0) would return 2
     * - Calling add(1, 3) would add the element 3 to the internal ArrayList at index 1
     * - Then, calling get(1) would return 3
     * - Calling add(2, 4) would add the element 4 to the internal ArrayList at index 2
     * - Then, calling get(2) would return 4
     * 
     * - For a new defined empty CustomIntegerArrayList  
     * - Calling add(0, 100) would add the element 100 to the internal ArrayList at index 0
     * - Then, calling get(0) would return 100
     * - Calling add(1, 200) would add the element 200 to the internal ArrayList at index 1
     * - Then, calling get(1) would return 200
     * - Calling add(1, 500) would add the element 500 to the internal ArrayList at index 1
     * - Then, calling get(1) would return 500
     * - And calling get(2) would return 200
     * 
	 * @param index at which to insert the given element
	 * @param element to insert
	 */
	public void add(int index, int element) {
		// TODO Implement method
		this.arr.add(index,element);
		//return this.arr.get(index);
	}

	/**
	 * Removes the element at the specified index.
	 * 
	 * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 4, 3, 2
     * - Calling remove(0) would remove the element 4 at index 0 from the internal ArrayList 
     * - The CustomIntegerArrayList will then contain the integers: 3, 2
     * - Calling remove(1) would remove the element 2 at index 1 from the internal ArrayList
     * - The CustomIntegerArrayList will then contain the integers: 3
     * 
     * - For a defined CustomIntegerArrayList containing the integers: 100, 500, 200
     * - Calling remove(0) would remove the element 100 at index 0 from the internal ArrayList 
     * - The CustomIntegerArrayList will then contain the integers: 500, 200
     * - Calling remove(0) would remove the element 500 at index 0 from the internal ArrayList
     * - The CustomIntegerArrayList will then contain the integers: 200
     * - Calling remove(0) would remove the element 200 at index 0 from the internal ArrayList
     * - The CustomIntegerArrayList will then be empty
     * 
	 * @param index at which to remove the element
	 * @return the removed element
	 */
	public void remove(int index) {
		// TODO Implement method
		this.arr.remove(index);
	}

	/**
	 * Removes the specified number (num) of the given element from the internal ArrayList of elements. 
	 * If num <= 0, don't remove anything. 
	 * If num is too large, remove all instances of the given element from the internal ArrayList of elements.
	 *  
	 * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 1, 2, 1, 2, 1
     * - Calling remove(2, 1) would remove the first 2 instances of 1 
     * - The CustomIntegerArrayList will then contain the integers: 2, 2, 1
     * 
     * - For a defined CustomIntegerArrayList containing the integers: 100, 100, 100
     * - Calling remove(4, 100) would remove all instances of 100 
     * - The CustomIntegerArrayList will then be empty
     * 
     * - For a defined CustomIntegerArrayList containing the integers: 5, 5, 5, 5, 5
     * - Calling remove(0, 5) would remove nothing
     * 
	 * @param num number of instances of element to remove
	 * @param element to remove
	 */
	public void remove(int num, int element) {
		// TODO Implement method
		
		if(num>0 && num<arr.size()) {
			int cnt=num;
			int i=0;
			while(i<this.arr.size() && cnt!=0) {
				if(this.arr.get(i)==element){
					this.arr.remove(i);
					cnt--;
				}
				else{
					i++;
					}

				}
			}
		
		else if(num>=this.arr.size()) {
			int i=0;
			while(i<this.arr.size()) {
				if(this.arr.get(i)==element) {
					this.arr.remove(i);
				}
				else{
					i++;
				}
			}
		}
	}

	/**
	 * Removes the specified number (num) of elements from the internal ArrayList of elements, starting at the given index.
	 * If index < 0, don't remove anything and return an empty ArrayList. 
	 * If index is too large (>= to the size of this CustomIntegerArrayList), don't remove anything and return an empty ArrayList. 
	 * if num == 0, don't remove anything and return an empty ArrayList.
	 *  
	 * If the number of elements after the given index is less than the given num, 
	 * just remove the rest of the elements in the internal ArrayList.
	 * 
	 * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 1, 2, 3, 4, 5
     * - Calling splice(1, 2) would remove 2 and 3 (the 2nd and 3rd items) 
     * - The CustomIntegerArrayList will then contain the integers: 1, 4, 5
     * and this method would return a new ArrayList containing the removed elements: 2 and 3
     * 
     * - For a defined CustomIntegerArrayList containing the integers: 1, 2, 3, 4, 5
     * - In a call to splice(3, 4), the number of elements after the given index 3 is less than the given num 4
     * - This would remove 4 and 5 (the 4th and 5th items)
     * - The CustomIntegerArrayList will then contain the integers: 1, 2, 3
     * and this method would return a new ArrayList containing the removed elements: 4 and 5
     * 
     * - For a defined CustomIntegerArrayList containing the integers: 100, 200, 500
     * - Calling splice(1, 0) would remove nothing
     * and this method would return a new empty ArrayList 
     * 
	 * @param index to start on
	 * @param num of items to remove
	 * @return ArrayList of removed elements
	 */
	public ArrayList<Integer> splice(int index, int count_element) {
                ArrayList<Integer> empty = new ArrayList<>();

                int noOfDeletion = this.arr.size() - 1 - index;

                // return empty list if any condition is true
                if (index < 0 || index >= this.arr.size() || this.arr.size() == 0 || count_element > noOfDeletion
                                || count_element <= 0) {
                        return empty;
                }
                // else starting from the given index delete elements after storing element
                // in removeList and decrease count_element by 1 atv last return list
                int i = index;
                while (i < this.arr.size() && count_element != 0) {
                        empty.add(i);
                        this.arr.remove(i);
                        count_element--;
                }

                return empty;
        

}

	/**
	 * Removes the specified number (num) of elements from the internal ArrayList of elements, 
	 * starting at the given index, and inserts the elements in the given otherArray at the given index.
	 * 
	 * Uses the splice(int index, int num) method.
	 * 
	 * If index < 0, don't remove anything or insert anything, and return an empty ArrayList. 
	 * If index is too large (>= to the size of this CustomIntegerArrayList), don't remove anything or insert anything,
	 * and return an empty ArrayList. 
	 * if num == 0, don't remove anything or insert anything, and return an empty ArrayList.
	 *  
	 * If the number of elements after the given index is less than the given num, 
	 * just remove the rest of the elements in the internal ArrayList.
	 * 
	 * Example(s):
     * - For a defined CustomIntegerArrayList containing the integers: 1, 2, 3, 4, 5
     * - Calling splice(1, 2, [6, 7]) would remove 2 and 3 (the 2nd and 3rd items), 
     * and insert 6 and 7 at index 1. 
     * - The CustomIntegerArrayList will then contain the integers: 1, 6, 7, 4, 5
     * and this method would return a new ArrayList containing the removed elements: 2 and 3
     * 
     * - For a defined CustomIntegerArrayList containing the integers: 1, 2, 3, 4, 5
     * - In a call to splice(3, 4, [1000, 1001]), the number of elements after the given index 3 is less than the given num 4
     * - This would remove 4 and 5 (the 4th and 5th items) and insert 1000 and 1001 at index 3. 
     * - The CustomIntegerArrayList will then contain the integers: 1, 2, 3, 1000, 1001
     * and this method would return a new ArrayList containing the removed elements: 4 and 5
     * 
     * - For a defined CustomIntegerArrayList containing the integers: 100, 200, 500
     * - Calling splice(1, 0, [700]) would remove nothing and insert nothing
     * and this method would return a new empty ArrayList 
     * 
     * - For a defined CustomIntegerArrayList containing the integers: 5, 2, 7, 3, 7, 8
     * - Calling splice(6, 3, [9]) would remove nothing and insert nothing
     * and this method would return a new empty ArrayList 
	 * 
	 * @param index at which to remove and add the elements
	 * @param num of elements to remove
	 * @param otherArray of elements to add 
	 * @return ArrayList of removed elements
	 */
	 public ArrayList<Integer> splice(int index, int count_element, int[] otherArray) {

                ArrayList<Integer> removedElements = new ArrayList<>();

                if (index < 0 || count_element == 0 || index >= this.arr.size()) {
                        return removedElements;
                }

                int i = index;

                // remove elements till either list is completed of count_element==0
                while (i < this.arr.size() && count_element != 0) {
                        removedElements.add(i);
                        this.arr.remove(i);
                        count_element--;
                }

                int j=index;
                int k=0;
                
                while(k<otherArray.length) {
                        this.arr.add(j,otherArray[k]);
                        j++;
                        k++;
                }

                return removedElements;

        }

	
	public static void main(String args[]) {
		
		//create new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();

		//add element
		arr1.add(2);
		
		//get internal arraylist of elements
		System.out.println(arr1.getArrayList()); // [2]

		//add element
		arr1.add(0, 5);
		
		//get internal arraylist of elements
		System.out.println(arr1.getArrayList()); // [5, 2]

		//remove element
		arr1.remove(2, 2);
		
		//get internal arraylist of elements
		System.out.println(arr1.getArrayList()); // [5]

		//add more elements
		arr1.add(6);
		arr1.add(2);
		arr1.add(7); // [3, 6, 2, 7]
		
		//splice 2 elements at index 0
		arr1.splice(0, 2);
		
		//get internal arraylist of elements
		System.out.println(arr1.getArrayList()); // [2, 7]

		//splice 1 element at index 0 and add [4, 5]
		arr1.splice(0, 1, new int[] { 4, 5 });
		
		//get internal arraylist of elements
		System.out.println(arr1.getArrayList()); // [4, 5, 7]
				
		//create new CustomIntegerArrayList with the elements in the given ArrayList
		ArrayList<Integer> arr2Elements = new ArrayList<Integer>();
		arr2Elements.add(5);
		arr2Elements.add(15);
		arr2Elements.add(27);
		
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(arr2Elements);
		
		//get internal arraylist of elements
		System.out.println(arr2.getArrayList()); // [5, 15, 27]
	}
}