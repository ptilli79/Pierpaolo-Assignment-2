package com.coderscampus.assignment2;

public class IsNumeric {
	
	int readString (String string) {
	    int intValue;
	    //System.out.println(String.format("Parsing string: \"%s\"", string));
	    if(string == null || string.equals("")) {
	        System.out.println("String cannot be parsed, it is null or empty.");
	        return -1;
	    }
	    
	    try {
	        intValue = Integer.parseInt(string);
	        if (intValue < 1 || intValue > 100) {
	        	System.out.println(intValue + " is not between 1 and 100. Try again!");
	        	return -1;
	        }
	        else {
	        	return intValue;
	        }
	        
	    } catch (NumberFormatException e) {
	        System.out.println("Input String cannot be parsed to Integer.");
	    }
	    return -1;
	}

}
