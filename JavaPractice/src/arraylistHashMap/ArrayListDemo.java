package arraylistHashMap;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList(); // 1. Declaration

		// 2. Add Elements/values to array list
		list.add("Canada");
		list.add(10);
		list.add(10.5);
		list.add(true);
		list.add('R');

		// 3. Find of Array list
		System.out.println(list.size());
		System.out.println("List of values in ArrayList :" + list); // Print all from Array list

		System.out.println(list.get(2)); // prints specific value ...we use 'get' method

		// 4. Insert new element to the Arraylist
		list.add(1, "India");
		System.out.println("List of values in ArrayList after inserting a new Value :" + list); // after inserting new
																								// value
		// 5. Remove value/element from the Arraylist
		list.remove(3);
		System.out.println("List of values in ArrayList after Removing Value :" + list); // index starts from ZERO

		// 6. Read from Array list
		for (Object i : list) // Object will hold any time of element . Object is itselft is a Class
		{
			System.out.println(i);
		}
	}
}
