package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The implementation of creating numbers
 */
public class Implementation implements NumberRangeSummarizer{

	/**
	 * Instance variables
	 */
	Collection<Integer> collection;
	int testNumber = 1;

	/**
	 * Print the test output.
	 * @param input
	 */
	public void testOutput(String input) {
		collection = collect(input);
		System.out.println("Test number " + testNumber++ + ":");
		System.out.println(summarizeCollection(collection));
		System.out.println("");
	}
	

	/**
	 * Store the input data into a collection.
	 * @param input The comma separated values
	 * @return The collection of values
	 */
	@Override
	public Collection<Integer> collect(String input) {
		String array[];		
		ArrayList<Integer> arrayList;
		
		// create array of String values
		array = input.split(",");
		
		// create arrayList
		arrayList = new ArrayList<Integer>(array.length);
		
		// convert and store Integer values to arrayList 
		for (int i = 0; i < array.length; i++) {
			arrayList.add(Integer.valueOf(array[i]));
		}
		
		return arrayList;
	}

	/**
	 * Create a result String that groups all the the sequential
	 * values to specified ranges, and include single values,
	 * i.e. "1, 3, 6-8, 12-15, 21-24, 31".
	 * @param input The collection of values
	 * @return The result
	 */
	@Override
	public String summarizeCollection(Collection<Integer> input) {
		String output = "";
		int numbers[];
		java.util.ArrayList<Integer> arrayListCollection;
		int i = 0, j = 0;
		
		// Downcast Collection to ArrayList
		arrayListCollection= (java.util.ArrayList<Integer>) input;  
		
		// create array
		numbers = new int[arrayListCollection.size()];
		
		// load array
        for (int index = 0; index < arrayListCollection.size(); index++) {
        	numbers[index] = (int) arrayListCollection.get(index);
		}

		while(i < numbers.length) {
			j = i + 1;
			// sequential?
			while (j < numbers.length
					&& numbers[j] - numbers[i] <= j - i) {
				j += 1;
			}
			// non sequential values
			if (j - i == 1) {
				output += numbers[i] + ", ";
				i += 1;
			}
			// sequential values
			else {
				output += numbers[i] + " - " + numbers[--j] + ", ";
				i = j + 1;
			}
		}
		
        return output;
	}	
}
