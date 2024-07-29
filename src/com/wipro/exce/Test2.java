package com.wipro.exce;
import java.util.Arrays;

public class Test2 {
	    
	    public static boolean areAnagrams(String str1, String str2) {
	        // Remove spaces and convert to lowercase
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();
	        
	        // Check if lengths are different
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
	        
	        if (areAnagrams(str1, str2)) {
	            System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams.");
	        } else {
	            System.out.println("'" + str1 + "' and '" + str2 + "' are not anagrams.");
	        }
	    }
	}



