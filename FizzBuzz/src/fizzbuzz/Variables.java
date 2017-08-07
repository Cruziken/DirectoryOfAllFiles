package fizzbuzz;

import java.util.LinkedHashMap;
import java.util.Properties;

/**
 * This class assigns the values to variables necessary for the completion of
 * the FizzBuzz problem
 *
 */
public class Variables {
	// Creates an integer called max_int
	private int maxInt;
	// Creates a integer called lower_divisor
	private int lowerDivisor;
	// Creates a integer called upper_divisor
	private int upperDivisor;
	// Creates a String called lower_divisor_label
	private String lowerDivisorLabel;
	// Creates a String integer called upper_divisor_label
	private String upperDivisorLabel;
	// Creates a Variables instance called variables

	/**
	 * This method assigns values to the variables used in the LogicController
	 * class
	 * 
	 * @param properties
	 */
	public void setVars(Properties props) {

		// Creates a LinkedHash map that will store the keys and values of propy
		LinkedHashMap<String, String> mymap = new LinkedHashMap<String, String>();
		// For as long as there are keys to convert to string in the file, call
		// them key)
		for (String key : props.stringPropertyNames()) {
			// For each key converted, get its key
			String value = props.getProperty(key);
			// Puts the keys and values into the LinkedHashMap
			mymap.put(key, value);
		}
		// Assigns max_int the value of the key "max_int"
		maxInt = intIt(mymap.get("max_int"));
		// Assigns lower_divisor the value of the key "lower_divisor"
		lowerDivisor = intIt(mymap.get("lower_divisor"));
		// Assigns upper_divisor the value of the key "upper_divisor"
		upperDivisor = intIt(mymap.get("upper_divisor"));
		// Assigns lower_divisor_label the value of the key
		// "lower_divisor_label"
		lowerDivisorLabel = (mymap.get("lower_divisor_label"));
		// Assigns upper_divisor_label the value of the key
		// "upper_divisor_label"
		upperDivisorLabel = (mymap.get("upper_divisor_label"));

	}

	/**
	 * Getter method for max_int
	 * 
	 * @return
	 */
	int getMaxInt() {

		return maxInt;
	}

	/**
	 * Getter method for lower_divisor
	 * 
	 * @return
	 */
	int getLowerDivisor() {
		return lowerDivisor;
	}

	/**
	 * Getter method for upper_divisor
	 * 
	 * @return
	 */

	int getUpperDivisor() {
		return upperDivisor;
	}

	/**
	 * Getter method for lower_divisor_label
	 * 
	 * @return
	 */

	String getLowerDivisorLabel() {
		return lowerDivisorLabel;
	}

	/**
	 * Getter method for upper_divisor_label
	 * 
	 * @return
	 */
	String getUpperDivisorLabel() {
		return upperDivisorLabel;
	}

	/**
	 * Method that makes Integers out of numbers that are Strings
	 * 
	 * @param assign
	 * 
	 * @return
	 */
	private int intIt(String assign) {
		// Returns back the value in integer form of a string
		return Integer.valueOf(assign);
	}
}
