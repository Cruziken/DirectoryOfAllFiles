import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

	
public class ReaderandPrinters  {
	//Creates a Scanner named scanner
	private static Scanner scanner = new Scanner(System.in);
	//Creates a filename variable
	private String filename;
	
	public void Proclaim(){
	//Prompts the user for a file name (absolute path).
	//Either have the file in Cruziken folder or C://Users//fz3//....filename.txt
	System.out.print("Enter a file name by listing it's absolute path: ");
	}
	public void promptFile(){
		//Creates a filename variable that represents the user input
		 filename  = scanner.nextLine();

	}
	
	public String getFile(){
		//Returns filename so it can be used in Copiers
		return filename;
	}
	
	public void ReadandScan() {
	
	//Changes the variable named filename into a File instance.
	File file = new File(filename);
	
	//Exception is thrown to alert the compiler of what to do if it doesn't find the file.
	try {	
		//Creates an instance of Scanner named input.
	Scanner input = new Scanner(file);
				while (input.hasNext()) {
			//Creates a string out of Text found within file.
			String num = input.nextLine();
			//Prints num string from past line
			System.out.print(num);
		}
				input.close();
	}
	//Alerts the compiler of what to do in case of the exception.
catch(FileNotFoundException e){
	//Prints off if FileNotFoundException is true.
	System.err.format("File does not exist\n");
}
}
}
