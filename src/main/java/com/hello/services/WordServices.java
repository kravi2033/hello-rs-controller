package com.hello.services;

import org.springframework.stereotype.Service;

@Service
public class WordServices {
	
	public boolean validatePalindrom(String word){
		
		String reverse="";
		for(int i=word.length()-1;i>=0;i--)
		{
			reverse=reverse+word.charAt(i);
			
		}
		return reverse.equals(word);
	}
	

	public Boolean validateAnagramOfPalindrome(String word) {
		int NO_OF_CHAR = 256;
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
