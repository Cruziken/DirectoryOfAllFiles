

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Jay Jay Billings
 *
 */
public class SimpleFileWriter {

	private FileWriter testFileWriter;
	private BufferedWriter testBufferedWriter;

	public SimpleFileWriter(String fileName) throws IOException {
		File testFile = new File("test.log");
		testFileWriter = new FileWriter(testFile);
		testBufferedWriter = new BufferedWriter(testFileWriter);
	}

	public void writeLine(String msg) throws IOException {
		// Write lines to the file
		testBufferedWriter.write(msg);
		testBufferedWriter.newLine();
		// Write lines to stdout
		System.out.println(msg);

	}

	public void close() throws IOException {
		testBufferedWriter.close();
		testFileWriter.close();
	}

}
