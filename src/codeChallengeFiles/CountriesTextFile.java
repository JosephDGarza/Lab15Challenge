package codeChallengeFiles;
//Joe Garza
//Yasmin Rodriguez
//Pratima Kaza
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {

	
public static void readFromFile() {
	Path writeFile = Paths.get("countries.txt");
	File file = writeFile.toFile();
	
	try {
		FileReader fr = new FileReader(file);
		//this is a buffer and the benefit of using this is to store a block of memory that we can read data from later. 
		//more efficient than Scanner and doesnt have errors that scanner does.
		BufferedReader reader = new BufferedReader(fr);
		//this is attempting to read the first line from the text document
		
		String line = reader.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = reader.readLine(); // scnr.nextLine essentially, pushes to the next line
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void createFile(String fileString) {
	// the get() method is overloaded, and I can just pass in the name for the file
	// if I want. If I don't want it to live in a folder
	Path filePath = Paths.get(fileString);
	// this will only happen if file is not there
	if (Files.notExists(filePath)) {
		try {
			Files.createFile(filePath);
			System.out.println("Your file was created succesfully");
		} catch (IOException e) {
			System.out.println("Something went wrong with the file creation");
			e.printStackTrace();
		}

	}

//	System.out.println("File name: " + filePath.getFileName());
//	System.out.println("Absolute Path: " + filePath.toAbsolutePath());
}

public static void writeToFile(String country) {
	
	Path writeFile = Paths.get("countries.txt");
	File file = writeFile.toFile();
	try {
		// the true parameter in the fileoutputstream constructor allows us to append to the end of the document, otherwise false will overwrite the enire doc
		PrintWriter out = new PrintWriter(new FileOutputStream(file, true));
		out.println(country); // the printwriter out inputs text to the file.
		System.out.println("This country has been saved!");
		out.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("File not found here...");
		e.printStackTrace();
	}
	
	
}

}



