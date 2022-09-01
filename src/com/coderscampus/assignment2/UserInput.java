package com.coderscampus.assignment2;
import java.util.Scanner;

public class UserInput {
	int readInput (int random, int valid_attempts, Scanner scanner) {

		int resultNumeric = -1;
		//Scanner scanner = new Scanner(System.in);		
		while (resultNumeric == -1 || resultNumeric < 1 || resultNumeric > 100) {
		//System.out.println(resultNumeric);
		
			System.out.println("Please, type any number between 1 and 100: ");
		
			String userInput = scanner.nextLine();
			//userInput newInput = new userInput();
			//String userInput = newInput.readInput();
			IsNumeric newNumeric = new IsNumeric();
			resultNumeric = newNumeric.readString(userInput);
			//scanner.close();
		}
	
		if (valid_attempts < 4 && resultNumeric != random) {
			if (resultNumeric > random){
				System.out.println("Please pick a lower number");
			}
			else {
		
			System.out.println("Please pick a higher number");	
			}
		}
	
		return resultNumeric;
	}
}
