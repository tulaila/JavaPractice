package exception;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Program Started");
		System.out.println("Program In Progress");

		int a = 100;

		try 
		{
		 System.out.println(a / 0); // Arithmetic Exception
		} 
		catch (Exception e)            // Will handle all kids of Exception
		{
			System.out.println("Exception occured..but handled by try catch block"); // handle exception
		}

         finally {                   //Final Block execute all the time.. no matter of if and catch does or dooesn't handle exceptions
        	 System.out.println("This is Finally block....");
		}

		System.out.println("Program Completed");
		System.out.println("Program Exited");

	}


}
