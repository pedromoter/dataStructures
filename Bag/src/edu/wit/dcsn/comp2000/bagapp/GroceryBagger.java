package edu.wit.dcsn.comp2000.bagapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroceryBagger {
	
	
		public static void main(String[] args) {
			
			//read from file here 
		    File file = new File("data/groceries.txt");

		    
		    try {

		        Scanner sc = new Scanner(file);

		        while (sc.hasNextLine()) {
		        	
		        	interpretDescription(sc.nextLine());
		        
		        	
		        }
		        sc.close();
		    } 
		    catch (FileNotFoundException e) {
		        System.out.println("File was not found, please retry!");
		    }
		    catch(Exception e ){
		        System.out.println("Unkown error ocurred, please retry!");

		    }
			
	
			
			
			
			
		}	
		
		private static void interpretDescription(String entry) {
			

			String[] data = entry.split("\t");
			
			
			
			
		}
	
		
}