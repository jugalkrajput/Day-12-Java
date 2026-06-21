package com.revision;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {

    	File file = new File("test.txt");
        
        try {
            
        	if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Can read? " + file.canRead());
            System.out.println("Can write? " + file.canWrite());
            System.out.println("File size: " + file.length() + " bytes");
            
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}