
package hello;


public class WordController {
    // TODO Implement the /words/{word} endpoint
	static final int NO_OF_CHAR=256;

	public static void main(String[] args) {
		System.out.println(checkStringAnagramOfPalindrome("madam"));
	}		
	public Boolean checkStringPalindrome(String word){
		
		// reverse the given String 
		String reverse = new StringBuffer(word).reverse().toString(); 

		// check whether the string is palindrome or not 
		if (word.equals(reverse)){
			return true;
		}else{
			return false;
		}
	}

	public static Boolean checkStringAnagramOfPalindrome(String word) {

		int[] count = new int[NO_OF_CHAR];

		for (int i = 0; i < word.length(); i++) {
			count[word.charAt(i)]++;
		}

		int odd = 0;
		for (int i = 0; i < NO_OF_CHAR; i++) {
			if ((count[i] & 1) != 0)
				odd++;

			if (odd > 1)
				return false;
		}
		return true;
	}
}