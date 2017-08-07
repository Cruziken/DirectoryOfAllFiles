import java.util.Scanner;

//Creates an instance of scanner that represents user input
public interface Interfacer {
	// Creates an instance of scanner that represents user input
	// Scans user input from console
	static Scanner scanner = new Scanner(System.in);
	// Creates a filename variable that stores the user input
	String filename = scanner.nextLine();

}
