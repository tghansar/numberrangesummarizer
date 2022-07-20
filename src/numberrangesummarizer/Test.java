package numberrangesummarizer;

public class Test {

	/**
	 * Instance variables
	 */
	int testNumber;
	NumberSequence numberSequence;
	
	Test() {
		testNumber = 1;
		numberSequence = new NumberSequence();
	}

	/**
	 * Print the test output.
	 * @param input
	 */
	public void printOutput(String input) {
		String output;
		
		System.out.println("Test number " + testNumber + ":");
		output = numberSequence.getResult(input);
		System.out.println(output + "\n");
		
		testNumber += 1;
	}

	public static void main(String[] args) {
		Test test = new Test();

		// test 1
		test.printOutput("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
        
		// test 2
		test.printOutput("4,7,8,9,10,15,20,21,22,23,28,29");
		
		// test 3
		test.printOutput("1,3,5,7,8,9,10,11,12,13,14,18");
        
    }
		
}

