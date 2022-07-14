package numberrangesummarizer;

public class MainClass {

	public static void main(String[] args) {
		
		Implementation implementation = new Implementation();
		
		// test 1
		implementation.testOutput("1,3,6,7,8,12,13,14,15,21,22,23,24,31");
        
		// test 2
		implementation.testOutput("4,7,8,9,10,15,20,21,22,23,28,29");
		
		// test 3
		implementation.testOutput("1,3,5,7,8,9,10,11,12,13,14,18");
        
    }
		
}

