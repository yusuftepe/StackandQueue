package ParenthesisChecker;

public class Main {
	public static void main(String[] args) {
		
		String test1 = "([{}])"; 
        String test2 = "([)]";
        String test3 = "({[";
        String test4 = "{[()]}";
        
        System.out.println("--- Test 1: " + test1 + " ---");
        ParenthesisChecker.check(test1); 

        System.out.println("\n--- Test 2: " + test2 + " ---");
        ParenthesisChecker.check(test2); 

        System.out.println("\n--- Test 3: " + test3 + " ---");
        ParenthesisChecker.check(test3); 

        System.out.println("\n--- Test 4: " + test4 + " ---");
        ParenthesisChecker.check(test4);
	}

}
