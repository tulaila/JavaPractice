package exception;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		System.out.println("Program Started");
		System.out.println("Program In Progress");

		int a = 100;
		
		/*try 
		{
		//	System.out.println(a / 0); // Arithmetic Exception:

			 String s ="welcome";   	//NumberFormatException
		   	int n=Integer.parseInt(s); 
		} 
		catch (ArithmeticException e)
		{
			System.out.println("Exception occured..but handled by ArithmeticException try catch block"); // handle exception
		}
		catch (NullPointerException e)
		{
			System.out.println("Exception occured..but handled by NullPointerException try catch block"); // handle exception
		}
		catch(NumberFormatException e)
		{
			System.out.println("Exception occured..but handled by NumberFormatException try catch block"); // handle exception
		} */
		
		//--------------------------
		try 
		{
			//System.out.println(a / 0); // Arithmetic Exception
			String s ="welcome";   	//NumberFormatException
		   	int n=Integer.parseInt(s); 
		} 
		catch (Exception e)            // Will handle all kids of Exception
		{
			System.out.println("Exception occured..but handled by try catch block"); // handle exception
		}
		
		
		
		System.out.println("Program Completed");
		System.out.println("Program Exited");
         
	}

}
