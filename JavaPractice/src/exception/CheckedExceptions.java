package exception;

public class CheckedExceptions {

	public static void main(String[] args) throws InterruptedException {   // throws only for Checked Exceptions and it should be only method level
		System.out.println("Program Started");
		System.out.println("Program In Progress");
		
				
		/*try {
			Thread.sleep(5000);                      // Dealy for 5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}   */

		Thread.sleep(5000);   // Interrupted Exception
		
		System.out.println("Program Completed");
		System.out.println("Program Exited");
	}

}
