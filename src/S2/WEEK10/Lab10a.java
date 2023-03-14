package WEEK10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10a {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
		}
		File inFile = new File("Student Assignment Scores.csv");
		String line;
		Scanner pf = null;
		

		try {
			pf = new Scanner(inFile);
		}catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(1);
		}
		
		line = pf.nextLine();
//		String[] lineArray = line.split(",");
		System.out.println(line);
//		System.out.println("----------------------------------------------");
		
		while(pf.hasNext()){
			line = pf.nextLine();
			System.out.println(line);

		}
		
	}//end of main
}