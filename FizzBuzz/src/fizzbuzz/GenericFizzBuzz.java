package fizzbuzz;

/**
 * 
 * This class contains the main method that starts the program.
 *
 */
public class GenericFizzBuzz {
	/**
	 * Method begins the program
	 */
	public static void start() {
		// Creates an instance of INI called myINI
		INIfileLoader myINI = new INIfileLoader();
		// Creates an instance of Writer called myWriter that takes Valerie.log
		// as a parameter
		Writer myWriter = new Writer("Valerie.log");
		// Creates an instance of LogicController called myLogicController
		LogicController myLogicController = new LogicController();
		// Creates an instance of Variables called myVariables
		Variables myVariables = new Variables();
		// Calls the getVars method in myVariables on the method readIt() called
		// on myINI
		// MyINI.readIt gets the keys and values of the properties file and
		// myVariables.getVars takes the keys' values and assigns them to
		// variables needed to solve the FizzBuzz problem
		myVariables.setVars(myINI.readIt());
		// Calls the log method on this particular instance of Variables
		// This gets the string values for the variables and sends them along
		// with their associated variable names to the log(String content)
		// method within Writer
		myWriter.log(myINI.readIt());
		// Calls the setVariables method on myLogicController that takes this
		// specific instance of Variables and gets the variable values needed
		// in order to solve FizzBuzz
		myLogicController.setVariables(myVariables);
		// Runs the program that solves the FizzBuzz problems and passes the
		// results to the log(String content) method in Writers
		myLogicController.run();

	}

	/**
	 * Method starts the program
	 */
	public static void main(String[] args) {
		// This Starts the program
		start();
	}

}