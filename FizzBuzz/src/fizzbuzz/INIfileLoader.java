package fizzbuzz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * This class holds the method that reads a properties file and has its contents
 * shipped to other methods that need the content and then calls those methods
 * to complete the program
 *
 */
public class INIfileLoader {

	/**
	 * This method reads the INI file and returns an instance of Properties
	 * named myProps as a result
	 * 
	 * @return
	 */

	public Properties readIt() {
		// Creates a private Property variable named myProps
		Properties myProps;
		// Creates an instance of Properties named myProps
		myProps = new Properties();
		// Creates an instance of myAbPath called myAbPath
		AbsolutePath myAbPath = new AbsolutePath();
		// Attempting to scan from file a to file b (file a may not exist)
		try {
			// Loads the keys and values from the character stream from the file
			myProps.load(new FileInputStream(myAbPath.getAbsPath("TheRun.ini")));

		}
		// Catches the exception in case the file does not exist
		catch (IOException e) {
			// Throws NullPointerException if doesn't work
			System.out.println("Problem in INIfileLoader");
		}
		// Whenever this method is called myProps will be the result
		return myProps;

	}
}
