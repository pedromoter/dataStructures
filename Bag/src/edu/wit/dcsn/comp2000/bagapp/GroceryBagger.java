package edu.wit.dcsn.comp2000.bagapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GroceryBagger {
	
		private static ArrayBag
		
		private static int numberOfItems = 0;
		
		public static void main(String[] args) {
			
			//read from file here 
		    File file = new File("data/groceries.txt");

			// initialize number of bags = number of groceries (simulates unlimited number of bags, some remain empty at the end)
			// I assume we need to make a Bag class and implement the BagInterface interface
//			Bag[] bag = new Bag[ numberOfBags ]; // array of Bags
			
			

		    
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
		        System.out.println("Unkown error ocurred. "+ e.getMessage());

		    }
			
			
		}	
		
				
		private static void interpretDescription(String entry) {
			numberOfItems++;
			String[] data = entry.split("\t");
			Grocery grocery = new Grocery(data[0], 
					data[1],
					data[5],
					data[3], 
					data[6], 
					data[4],
					data[2]);
			
			addToBag(grocery);
			
		}
		
		private static void addToBag(Grocery grocery) {
			
			
			
			
		}
		
		private static String displayData() {
			
		}
	
		
}