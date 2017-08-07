import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReaderINI {
	
public void iniReader() {
	//creates a variable ini that instance represents the ini file 
File ini = new File("C://Users//fz3//workspace//FizzBuzz//TheRun.ini");
//Exception is thrown to alert the compiler of what to do if it doesn't find the file.
try {	
	//Creates an instance of Scanner named input.
Scanner input = new Scanner(ini);
			while (input.hasNext()) {
		//Creates a string out of Text found within file.
		String num = input.nextLine();
		String args[] = num.split("=");
		//Prints num string from past line
		System.out.println(args[0] + "" + args[1]);
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
