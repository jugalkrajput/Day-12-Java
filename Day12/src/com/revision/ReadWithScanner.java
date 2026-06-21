package com.revision;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWithScanner {
   
	public static void main(String[] args) {
        
		try {
            File file = new File("test.txt");
            Scanner sc = new Scanner(file);
            
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } 
		
		catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
