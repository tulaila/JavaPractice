package arrays;


public class ArrayString {

	public static void main(String[] args) {

		/*------Calculate sum values of an array-----------------
	  int a[]= new int[5];	 		// declare array with size 5
	 	a[0] =  100; 				// store or insert values in array
	    a[1] =  200;
	    a[2] =  300;
	    a[3] =  400;
	    a[4] =  500;  

		int a[]= {100,200,300,400,500}; // declare array without size
		System.out.println("length of an Array: " +a.length);
		System.out.println("Specific value :"+a[3]);

		//read the values from Array
	    for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]); 

		// Enhanced for loop
		int sum=0;
		for (int i:a) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("sum of array values :" +sum);


    ------Search specific number in an array-----------------	

				int a[]= {1,2,3,4,5,6,7,8,9,10};
				int num=6;
				int ln=a.length;

				for (int i = 0; i < ln; i++) {
					if(a[i] == num)
					{
						System.out.println("The serach number " +num+ " found at location " + i++ );
						break;
					}
					if(a[i] == ln)
					{
						System.out.println("The search number not found");
					}
				} 



		//------Print the Even or Odd number in an array-----------------

				int a[]= {1,2,3,4,5,6,7,8,9,10};

				System.out.println("length of an Array: " +a.length);
				System.out.println("Specific value :"+a[3]);


				for (int i:a) {
					if (i%2 == 0) {
						System.out.println(i+ " This is an Even Number");
					}
					else {
						System.out.println(i+ " This is odd Number");
					}
				}


		//------Two Dimensional Arrays-----------------

             int a[][] = {{100,200}, {300,400}, {500,600} };
                System.out.println("No. of Rows :" +a.length );
                System.out.println("No. of Coloumns :" +a[0].length);
                System.out.println("Rows and Columns are:");

                for(int r[]:a) {
                	for(int i:r) {
                		System.out.print(i+ " ");
                	}
                }   

		//------Add two matrices-----------------

				int ftable[][] = { {1,2,3}, {3,4,6} };
				int stable[][] = { {4,5,6}, {7,8,9} };
		
				int fr=ftable.length;     // Rows count
				int fc=ftable[0].length;  // column count
		
				System.out.println("Row count :" +fr);
				System.out.println("Column count :" +fc);
				System.out.println("-----------------------");
		
				// Adding two tables
				int sum[][] = new int[fr][fc];
		
				for (int i = 0; i<fr; i++)
				{
					for (int j = 0; j<fc; j++) 
					{
						sum[i][j] = ftable[i][j] + stable[i][j];  //  
					}
				}
		
				//Displaying the result
				System.out.println("Sum of two matrix");
		
				for (int[] row : sum) {
					for (int column : row ) {
						System.out.print(column + "   ");
					}
		
					System.out.println();
				}


		//---compare two STRINGS, ignoring case diff, concatinate, length, substring, convert all to upper and lover case----
		/*  String s= "ramesh";
				         String s1 = "kumar";
				         String s2= "RAMESH";
				         String s4 = "  Tulaila ";

				         System.out.println(s.length());
				         System.out.println(s.charAt(3));
				         System.out.println(s.concat(s1) );
				         System.out.println(s.toUpperCase());
				         System.out.println(s2.toLowerCase() );
				         System.out.println(s4.trim() );
				         System.out.println(s2.substring(2, 5) );
				         System.out.println(s2.replace('M', 'A'));*/

		//------Print Largerst number in an array-----------------

		int a[]= {200,600,900,100,300,500,800};

		int larg = a.length;

		System.out.println("length of an Array: " +larg);

		for (int i:a) {
			if(larg < i)
			    larg = i;
		 } System.out.format("Largest Number :"+larg);

		
	}
}

