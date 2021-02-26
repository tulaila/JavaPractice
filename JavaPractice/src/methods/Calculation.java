package methods;

/*
Case  1. Method Not taking parameters and Not returned any value
Case  2. Method Not taking parameters but Returned value
Case  3. Method taking parameters and Not returned any value
Case  4. Method taking parameters and also Returned value
 */
public class Calculation {

	int x = 10;
	int y = 20;

	// void sum() {									 // Case 1. Method Not taking parameters and Not returned any value
	// System.out.println(x+y);
	// }

	// int sum() {									 // Case 2. Method Not taking parameters but Returned value
	// return (x+y);
	// }

	// void sum(int a, int b) { 					// Case 3. Method taking parameters and Not returned
	// any value
	// System.out.println(a+b);
	// }

	int sum(int a, int b) { 						// Case 4. Method taking parameters and also Returned value
		return (a + b);
	}

	public static void main(String[] args) {
		Calculation cal = new Calculation(); 		// Create an Object only in Main method

		// cal.sum(); 								// Case 1
		// int res =cal.sum();				 		// Case 2
		// System.out.println(res);	
		// cal.sum(20, 30); 						// Case 3
		System.out.println(cal.sum(100, 200));	 	// Case 4

	}
}
