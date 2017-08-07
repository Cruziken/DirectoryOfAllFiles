
import java.util.Scanner;
public class Exercise2 {

	private void tellNprompt(){
		//The line directly below prints the phrase "Hello World!"
		System.out.print("Hello World!");
		//Prompts the user for a String.
		System.out.print(" Enter a word.");
	}
		
	private void scanNimput(){
		//Creates an instance of Scanner.
		Scanner scan = new Scanner(System.in);
		//Takes the user input of a string from a command line.
		scan.next();
		//Gives the user necessary congratulations.
		System.out.println("Nicely done!!!");
		//Closes the scanner
		scan.close();
	}
	public static void main(String[] args) {
		//Creates a new instance of Exercise2 called exce2
				Exercise2 exce2 = new Exercise2();
				//Calls the tellNprompt method on exce2
				exce2.tellNprompt();
				//Calls the scanNimput method on exce2
				exce2.scanNimput();

	}

}
