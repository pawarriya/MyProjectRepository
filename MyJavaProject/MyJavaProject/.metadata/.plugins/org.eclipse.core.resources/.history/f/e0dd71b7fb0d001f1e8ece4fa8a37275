package acessfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccessFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		
		
		System.out.println("Let's Access the file ---------");
		
	//Represents the file
		File file =  new File("FolderFile\\test.txt"); //Folder created 
		
		//Reading text from the file
		
		//Predefined classes required are FileReader and BufferedReader
		FileReader fr = new FileReader(file);	 //It will directly read if incorrect path will inform system cannot find a file specified								
				
		BufferedReader buf = new BufferedReader(fr);
		System.out.println("------------- File is read -----------------");

		//If file if null and no data or if you want to read all lines in one go
		String str;
		while((str = buf.readLine())!=null) {
			
			System.out.println("Lines are "+str );
		}
		
				
		if(file.exists()) {
			System.out.println("\n * File path exists *");
			
		}else {
			System.out.println("File does not exists");
		}
		
		System.out.println("Path location is: "+file.getAbsolutePath()); //Want to print exact path location
		System.out.println("Path is Checked");
		buf.close(); //To release thememory

	}


}
