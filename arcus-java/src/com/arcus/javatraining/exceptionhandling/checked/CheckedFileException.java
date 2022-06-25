package com.arcus.javatraining.exceptionhandling.checked;

import java.io.*;
import java.util.*;
 
// Main class
public class CheckedFileException {
 
    // Main driver method
    public static void main(String[] args)
        throws FileNotFoundException
    {
 
        // Assigning null value to object of FileInputStream
        FileInputStream GFG = null;
 
        // Try block to check for exceptions
        try {
 
            // Giving path where file should exists to read
            // content
            GFG = new FileInputStream(
                "/home/mayur/GFG.txt");
        }
 
        // Catch block to handle exceptions
        catch (FileNotFoundException e) {
 
            // Display message when exception occurs
            System.out.println("File does not exist");
        }
    }
}