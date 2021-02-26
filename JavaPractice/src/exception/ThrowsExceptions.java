package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExceptions {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader fr=null;
		fr =new FileReader("C:\\Users\\tulailar\\Documents\\Automation\\GIT.txt");
		 
		BufferedReader bfr = new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(5000);
	}

}
