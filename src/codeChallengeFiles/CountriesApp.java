package codeChallengeFiles;
// Joe Garza
// Yasmin Rodriguez
// Pratima Kaza
import java.util.Scanner;

import javax.xml.validation.Validator;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInput =0;
		String country;
		
		System.out.println("Welcome to the countries Maintenance Application!");
		while (userInput !=3 ) {
		System.out.println("1 - See the list of countries");
		System.out.println("2 - Add a country");
		System.out.println("3 - Exit");
		
		userInput = codeChallengeFiles.Validator.getInt(scnr, "Enter menu number: ", 1 , 3);
		if (userInput == 1) {
			CountriesTextFile.createFile("countries.txt");
			CountriesTextFile.readFromFile();
			
		}
		
		if (userInput == 2) {
			
			country = codeChallengeFiles.Validator.getString(scnr, "Enter Country: ");
			CountriesTextFile.writeToFile(country);
			
			
		}
	
			
		}
		System.out.println("Buh-bye!");
	}

}
