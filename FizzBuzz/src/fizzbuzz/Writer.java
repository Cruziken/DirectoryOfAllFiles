package fizzbuzz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;

/**
 * This class gets content from other files and writes it in desired file in
 * addition to printing the content to the console
 *
 */
public class Writer {
	// Creates a FileWriter variable named fileWriter
	private FileWriter fileWriter;
	// Creates a BufferedWriter variable named buffWriter
	private BufferedWriter buffWriter;

	/**
	 * Method allows the passing of filenames from other classes. Creates a new
	 * File and also creates new instances of fileWriter and buffWriter
	 * 
	 * @param filename
	 */
	public Writer(String filename) {

		// Creates an instance of Absolute path
		AbsolutePath myAbsPath = new AbsolutePath();
		// Creates (or gets access to ) a file from this absolute path
		File file = new File(myAbsPath.getAbsPath(filename));

		// In case there is no file to write to...
		try {
			// Creates a new FileWriter for that file.
			// Without the true you write over it. With it, you append
			fileWriter = new FileWriter(file, true);
			// Creates an instance buffWriter that writes the content from the
			// fileWriter
			buffWriter = new BufferedWriter(fileWriter);

		}
		// ...do this.
		catch (IOException e) {
			// Throws NullPointerException if doesn't work
			System.out.println("Problem in Writer contructor");
		}
	}

	/**
	 * Method allows content to be passed into it when accessed by other classes
	 * and methods. This content is then written out to a file and also the
	 * console
	 * 
	 * @param content
	 */
	public void log(String content) {

		// In case no content is there to be read...
		try {
			// buffWriter writes content to file passed from other classes
			buffWriter.write(content);
			// Each time new content is passed, give it a new line
			buffWriter.newLine();
		}
		// ...do this.
		catch (IOException e) {
			// Throws NullPointerException if doesn't work
			System.out.println("Something wrong happened in log(content)");
		}
		// Prints out the content that other classes pass to this method to the
		// console
		System.out.println(content);
	}

	/**
	 * This method takes the keys and values of the properties props, converts
	 * them to strings and has them passed to the writeFile method
	 */
	public void log(Properties props) {
		// Creates an instance of StringWriter that is a character stream that
		// collects its output in a string buffer
		StringWriter writer = new StringWriter();
		// In case there is no content in the property file...
		try {
			// Writes the keys and values to the StringWriter
			props.store(writer, "");
		}
		// ...Do this
		catch (IOException e) {
			// Throws NullPointerException if doesn't work
			System.out.println("Something wrong happened in log(props)");
		}
		// Takes the StringWriter, returns a string buffer, then finally returns
		// a String named INIcontent
		String iniContent = writer.getBuffer().toString();
		// Passes the content from the INIfile to the writeFile method
		log(iniContent);
		// Closes the bufferedReader
		closeIt();
	}

	/**
	 * Method closes any implementation of the buffWriter
	 */
	public void closeIt() {
		// Closes the buffWriter if there is something to close.
		try {
			buffWriter.close();
		}
		// If there is nothing to close...
		catch (IOException e) {
			// Throws NullPointerException if doesn't work
			System.out.println("Something wrong happened in closeIt()");
		}

	}

}
