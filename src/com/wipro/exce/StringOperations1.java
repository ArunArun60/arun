package com.wipro.exce;
import java.util.Arrays;
public class StringOperations1 {


	    
	    public static boolean areAnagrams(String str1, String str2) {
	        // Remove spaces and convert to lowercase
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();
	        
	        // Check lengths
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        
	        // Convert strings to char arrays
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        
	        // Sort both arrays
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        
	        // Compare sorted arrays
	        return Arrays.equals(charArray1, charArray2);
	    }
	    
	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";
	        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + areAnagrams(str1, str2));  // Output: true
	        
	        String str3 = "triangle";
	        String str4 = "integral";
	        System.out.println("Are '" + str3 + "' and '" + str4 + "' anagrams? " + areAnagrams(str3, str4));  // Output: true
	        
	        String str5 = "hello";
	        String str6 = "world";
	        System.out.println("Are '" + str5 + "' and '" + str6 + "' anagrams? " + areAnagrams(str5, str6));  // Output: false
	    }
	}



