import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
public class Anagram {
	
	
	public static boolean isAnagram(String word1, String word2) {
		
		

		
		

		
		
		if(word1.length() != word2.length()) {
			return false;
		}
		
			char[] c_arr1 = word1.toCharArray();
			char[] c_arr2 = word2.toCharArray();
			
			Arrays.sort(c_arr1);
			Arrays.sort(c_arr2);
			
			
			for(int i = 0; i<word1.length(); i++) {
				
				if(c_arr1[i] != c_arr2[i]) {
						return false;
					}	
				
//			
			}
			return true;
				
			
	}
	 
	
	
	public static void main(String args[]) {
	     
		
		 boolean ret = isAnagram("bleat", "table");
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

} 