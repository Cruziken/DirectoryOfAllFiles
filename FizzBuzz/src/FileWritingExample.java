


import java.io.IOException;

/**
 * @author Jay Jay Billings
 *
 */
public class FileWritingExample {

	public static void main(String[] args) throws IOException {
		// Open the file with a SimpleFileWriter
		SimpleFileWriter writer = new SimpleFileWriter("test.log");

		// Loop over n lines for n = 1000*random number
		int n = (int) (1000.0 * (1.0 + Math.random()));
		for (int i = 0; i < n; i++) {
			writer.writeLine(String.valueOf(i));
		}
		// Print the number n so that we know how many lines we should have.
		// This is a
		// simple check against our loop above for both the file and console
		// output.
		System.out.println("n = " + n);

		// Close the file
		writer.close();

		return;
	}

}
