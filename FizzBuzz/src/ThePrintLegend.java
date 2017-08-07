


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ThePrintLegend {
/*	public static void main(String[] args) throws Exception{
		ThePrintLegend thePrintLegend = new ThePrintLegend();
		thePrintLegend.writeFile();
	} */
	
	static void writeFile() throws IOException
	{ 
		
		FileWriter fileWriter = null;

		try {
			File file = new File("C://Users//fz3//workspace//Files//Despair.log");

			fileWriter = new FileWriter(file, true);

			fileWriter.write("Well lets go.\n");
			System.out.println("Success!");
		} finally {
			if (fileWriter != null) {
				fileWriter.close();
			}
		}
	
	}
	ThePrintLegend() throws Exception{
		ThePrintLegend.writeFile();
	}
	}
	
				
