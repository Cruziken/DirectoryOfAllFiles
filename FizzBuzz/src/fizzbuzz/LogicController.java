package fizzbuzz;

/**
 * This class controls the logic for FizzBuzz and sends the output to the
 * console and to a file
 * 
 *
 */
public class LogicController {
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
	 * Method that gets the variable name values from the Variables class in
	 * order to run the FizzBuzz problem
	 * 
	 */
	public void setVariables(Variables variables) {
	
		// Assigns max_int equal to the what is was assigned in Variables; In
		// this case 100
		maxInt = variables.getMaxInt();
		// Assigns lower_divisor equal to what it was assigned in Variables; In
		// this case 3
		lowerDivisor = variables.getLowerDivisor();
		// Assigns upper_divisor equal to what it was assigned in Variables; In
		// this case 5
		upperDivisor = variables.getUpperDivisor();
		// Assigns lower_divisor_label equal to what it was assigned in
		// Variables; In this case fizz
		lowerDivisorLabel = variables.getLowerDivisorLabel();
		// Assigns upper_divisor equal to what it was assigned in Variables; In
		// this case buzz
		upperDivisorLabel = variables.getUpperDivisorLabel();

	}

	/**
	 * Method that runs the logic necessary to solve the FizzBuzz Problem and
	 * passes the content through the Writer class's writeFile method
	 * 
	 */
	public void run() {
		// Creates an instance of Writer to access those methods and pass the
		// desired file name
		Writer myWriter = new Writer("Valerie.log");

		// Run the loop starting at zero, ending less than max_int, and
		// incrementing by one in subsequent run through
		for (int x = 1; x <= maxInt; x++) {

			// If x is divisible by 3 and is by 5 print "fizzbuzz"
			if ((x % (lowerDivisor * upperDivisor) == 0)) {
				// Prints off fizzbuzz to console
				myWriter.log(x + "-" + (lowerDivisorLabel + upperDivisorLabel));
			}

			// If x is divisible by 3 but not 5 do the following
			else if (x % lowerDivisor == 0) {
				// Print out fizz
				myWriter.log(x + "-" + lowerDivisorLabel);

			}

			// If x is not divisible by 3 but is by 5 print "buzz"
			else if (x % upperDivisor == 0) {
				// Prints off buzz to console
				myWriter.log(x + "-" + upperDivisorLabel);
			}
			// If the other conditions aren't met print the number
			else {
				// Prints value of x onto console
				myWriter.log(String.valueOf(x));
			}

		}

		// Closes the writer
		myWriter.closeIt();

	}

}
