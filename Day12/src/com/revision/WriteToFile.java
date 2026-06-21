package com.revision;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    
	public static void main(String[] args) {
        
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Hello, this is Day 12!");
            bw.newLine(); 
            bw.write("Writing to file is easy.");
            System.out.println("File written successfully.");
        } 
        
        catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}