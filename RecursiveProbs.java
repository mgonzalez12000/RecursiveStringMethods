package recursiveStringMethodExcercise;

public class RecursiveProbs {

	/*  public boolean recursiveContains(char c, String s) returns true 
	 * if the String contains the char, otherwise returns false.
	 */

	public boolean recursiveContains(char c, String s){
		if(s.length() == 0) return false;
		if(s.charAt(s.length()-1)==c) return true;
		else return recursiveContains(c, s.substring(0, s.length() -1));        
	}

	/*Public boolean recursiveAllCharactersSame(String s) returns true if all 
	 * the characters in the String are identical, otherwise false.  If the 
	 * String has length less than 2, all the characters are identical.
	 */

	public boolean recursiveAllCharactersSame(String s) {
		if (s == null || s.length() < 2) return true;
		return s.charAt(0) == s.charAt(1) && recursiveAllCharactersSame(s.substring(1));
	}

	/* public String recursiveHead(int n, String s) returns the substring of s beginning 
	 * with the first character and ending with the character at n - 1; in other words, it 
	 * returns the first n characters of the String. Return empty String ("") in cases in 
	 * which n is zero or negative or exceeds the length of s.
	 */

	public String recursiveHead(int n, String s) {
		if (n == 0 || n < 0 || n > s.length()) {
			return "";
		}
		return s.substring(0, n-1);
	}
}
