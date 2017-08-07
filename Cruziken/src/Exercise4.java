import java.io.*;
import java.util.Scanner;

public class Exercise4 {

	private void hEllo() {
		// Prints out the statement "Hello World".
		System.out.print("Hello World! ");
	}

	private void prompt() {
		// Prompts the user for an absolute file name.
		// Either have the file in Cruziken folder or
		// C://Users//fz3//....filename.txt
		System.out.println("Enter a file name by listing it's absolute path: ");
	}

	private void scanNprint() {
		// Creates a new instance of the scanner named scanner.
		// Whatever the user inputs into the console is scanned
		Scanner scanner = new Scanner(System.in);
		// Stores variable filename as the user input requested
		String filename = scanner.nextLine();

		// Changes the variable named filename into a file instance.
		File file = new File(filename);

		// Exception is thrown to alert the compiler of what to do if it doesn't
		// find the file.
		try {
			// Creates an instance of Scanner named input.
			// Scans the file for its contents(input)
			Scanner input = new Scanner(file);
			while (input.hasNext()) {
				// Creates a string out of Text found within file.
				String num = input.nextLine();
				// Prints num string from past line
				System.out.print(num);
			}
			// Closes the input
			input.close();

		}

		// Alerts the compiler of what to do in case of the exception.
		catch (FileNotFoundException e) {
			// Prints off if FileNotFoundException is true
			System.err.println("File does not exist");
		}
		// Creates a new instance of File named file2 as an equivalent of
		// filename
		File file2 = new File(filename);
		// Creates a new instance of File named filecopy
		// Indicates the change in depository if one occurs
		File filecopy = new File("C:\\users\\fz3\\workspace\\MidiPlayer\\TheCodingApprentice.txt");
		// Creates a BufferedReader named reader.
		BufferedReader reader;
		// Creates a PrintWriter named writer.
		PrintWriter writer;
		// Creates a String named line
		String line;

		// If the filecopy is or isn't equal to its new file then the following
		// code runs
		try {
			// Creates a variable success that is true. If a new file is
			// created...
			boolean success = filecopy.createNewFile();
			// If a new file2 is created copy it over to filecopy and its
			// repository
			if (success) {

				// Reads off the content in file2
				reader = new BufferedReader(new FileReader(file2));
				// Creates a printWriter that will write content to filecopy
				writer = new PrintWriter(new FileWriter(filecopy));
				// Copies over content from file2 to filecopy for as long as the
				// file has content

				while ((line = reader.readLine()) != null) {
					// Literally takes the content from file2 and writes it into
					// filecopy
					writer.println(line);
					// Closers the BufferedReader
					reader.close();
					// Closes the PrintWriter
					writer.close();
				}
			}

		} // Alerts the compiler of what to do in case of the exception.
		catch (IOException ioEx) {
			// Prints off if FileNotFoundException is true.
			System.err.println(" Couldn't move to directory.");

		}
		// Closes the scanner
		scanner.close();
	}

	public static void main(String[] args) {

		// Creates an instance of Exercise4 called doit4
		Exercise4 doit4 = new Exercise4();
		// Calls the hEllo method on doit4 that prints off Hello World.
		doit4.hEllo();
		// Calls the prompt method on doit4 that prompts for the file
		doit4.prompt();
		// Calls the scanNprint method on doit4 that scans the file, prints its
		// contents, and copies them to another file
		doit4.scanNprint();

	}
}
