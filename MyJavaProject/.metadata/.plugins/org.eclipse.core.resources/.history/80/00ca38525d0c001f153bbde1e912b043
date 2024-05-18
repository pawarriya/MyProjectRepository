package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Files {

	public static void main(String[] args) throws FileNotFoundException  {
		// Representing the file

		File file = new File("D:\\SOFTWARE\\test.txt"); // It will run successfully 
		
		// File file = new File("D:\\SOFTWARE\\testxyz.txt"); //incorrect path -- system cannot find file specified 
		
		//read the file
		//Path is correct but compiler is insisting you to handle the exception it will suggest add throw exception
		FileReader fr = new FileReader(file);

			/*try {
				FileReader fr = new FileReader(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			System.out.println("File reading");
			
		

}
}
