

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;


public class Dog {
		File file;
		FileWriter writer;
		String msg = "fizzbuzz";
		void writeOutput(String msg ) throws IOException{
			System.out.println(msg);
			writer.write(msg);
		}
	private Dog(){
			file = new File ("C://Users//fz3//workspace//HelloWorld//src//TheSprint.log");
			try {
				writer = new FileWriter(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		
		
	}



		
