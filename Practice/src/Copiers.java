
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Copiers implements Interfacer {

	public void copyIt() {

		// Creates a variable of file2 to use as the file that will be copied
		// Receives filename variable since it implements Interfacer
		File file2 = new File(filename);
		// Creates a new instance of File named filecopy
		// Indicates the change in repository if one occurs when it gets copied
		File filecopy = new File("C:\\Users\\fz3\\workspace\\Dog\\TheTest.txt");
		// Creates a BufferedReader named reader.
		BufferedReader reader;
		// Creates a PrintWriter named writer.
		PrintWriter writer;
		// Creates a String named line
		String line;
		// Exception is thrown to alert the compiler of what to do if it doesn't
		// find the file

		try {
			// Creates a variable success that is true. If a new file is
			// created...
			boolean success = filecopy.createNewFile();
			// If a new file2 is created copy it over to filecopy and its
			// repository
			if (success) {
				// Creates a buffering character input string that reads the
				// content in file2
				reader = new BufferedReader(new FileReader(file2));
				// Creates a printWriter that writes content to filecopy
				writer = new PrintWriter(new FileWriter(filecopy));
				// Loop copies over content from file2 to filecopy
				// Loop runs as long as file has content
				while ((line = reader.readLine()) != null) {
					// Writes the content from file2 to filecopy
					writer.println(line);
				}
				// Closers the BufferedReader
				reader.close();
				// Closes the PrintWriter
				writer.close();
			}

		} // Alerts the compiler of what to do in case of the exception.
		catch (IOException ioEx) {
			// Prints off if FileNotFoundException is true.
			System.err.println(" Check your directory destination. It may have copied over.");
		}
	}
}
