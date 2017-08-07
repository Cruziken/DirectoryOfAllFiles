import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	private void starters(){
		//Creates an instance of Dog called exc1
		//Dog exc1 = new Dog();
		//Creates an instance of TheEnds called exc2
		//exc1.writeOutput("msg");
		//Creates an instance of MusicTest1 called exc2
		MusicTest1 exc2 = new MusicTest1();
		//Calls the doit method on exc2
		 exc2.doit();
		//Creates an instance of TheEnds called exc2
		TheEnds exc3= new TheEnds();
		//Calls the logIt method on exc1
		exc3.lesgo();
	}
	
	
		
		
	
		//Creates the main method that starts the program
		 public static void main (String[] args){
			//Creates an instance of Main called mainer
			Main mainer = new Main();
			//Calls the Starters method on mainer
			mainer.starters();
			
}
}