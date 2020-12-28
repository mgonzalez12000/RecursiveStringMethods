package recursiveStringMethodExcercise;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveProbs recursive = new RecursiveProbs();
		
		//recursiveContains()
		System.out.println("TESTING recursiveContains()");
		//s does not exist in "Hello" so it should return false
		System.out.println("CASE: Where s is empty ");
		System.out.println(recursive.recursiveContains('a', ""));
		System.out.println("CASE: Where 's' in 'Hello'");
		System.out.println(recursive.recursiveContains('s', "Hello"));
		//e does exist in "Hello" so it should return true
		System.out.println("CASE Where 'e' in 'Hello'");
		System.out.println(recursive.recursiveContains('e', "Helllo"));
		System.out.println();
		
		//recursiveAllCharacterSame()
		System.out.println("TESTING recursiveAllCharacterSame()");
		System.out.println("CASE: Where string has no characters");
		System.out.println(recursive.recursiveAllCharactersSame(""));
		System.out.println("CASE: Where string has only one character:");
		System.out.println(recursive.recursiveAllCharactersSame("a"));
		System.out.println("CASE: Where string has repeating characters 'aaa':");
		System.out.println(recursive.recursiveAllCharactersSame("aaa"));
		System.out.println("CASE: Where string has no repeating characters 'absa':");
		System.out.println(recursive.recursiveAllCharactersSame("absa"));
		System.out.println();
		
		//recirsuveHead()
		System.out.println("TESTING recursiveHead()");
		System.out.println("CASE: When int is 5 and string is 'Hello'");
		System.out.println(recursive.recursiveHead(5, "Hello"));
		System.out.println("CASE: When n = 0");
		System.out.println(recursive.recursiveHead(0, "Michael"));
		System.out.println("END OF PROGRAM");

	}

}
