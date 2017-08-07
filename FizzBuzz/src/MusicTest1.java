import java.util.*;
import java.io.*;

public class MusicTest1 {
	
		  
		  public void doit() {
			  //Initiates try to catch the exception that the file does not exist.
		    try{
		    //Creates an instance of properties called p
		      Properties p = new Properties();
		      //calls the load method on p to keys and values the data from  TheRun.ini
		      p.load(new FileInputStream("C://Users//fz3//workspace//FizzBuzz//TheRun.ini"));
		      //Prints off max_int + the value associated with the key max_int in the file TheRun.ini
		      System.out.println("max_int = " + p.getProperty("max_int"));
		      //Prints off lower_divisor + the value associated with the key lower_divisor in the file TheRun.ini
		      System.out.println("lower_divisor = " + p.getProperty("lower_divisor"));
		      //Prints off upper_divisor + the value associated with the key upper_divisor in the file TheRun.ini
		      System.out.println("upper_divisor = " + p.getProperty("upper_divisor"));
		      //Prints off lower_divisor_label + the value associated with the key lower_divisor_label in the file TheRun.ini
		      System.out.println("lower_divisor_label = " + p.getProperty("lower_divisor_label"));
		      //Prints off upper_divisor_label + the value associated with the key upper_divisor_label in the file TheRun.ini
		      System.out.println("upper_divisor_label = " + p.getProperty("upper_divisor_label"));
		      
		    }
		    //close the try 
		    catch (Exception e) {
		    	//If exception holds true prints off File does not exist
		      System.out.println("File does not exist");
		    }
		  }
		}
	

