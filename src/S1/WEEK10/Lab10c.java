package WEEK10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab10c {

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
		String[] lineArray = line.split(",");
		String stu = "Student";
		String ass = "Assignments with 0";

		System.out.printf("\n\n%-30s%s\n",stu, ass);
		System.out.println("--------------------------------------------------------");
		
		
		while(pf.hasNext()){
			line = pf.nextLine();
			lineArray = line.split(",");

			if(line.contains(",0,")){
				for(int i = 1; i<7; i++){
					if(lineArray[i].equals("0")){
						System.out.printf("%-30s%s\n",lineArray[0],i);
					}
				}
			}
		}
	}
}
