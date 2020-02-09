package edu.wit.dcsn.comp2000.bagapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.wit.dcsn.comp2000.bagadt.BagInterface;
import edu.wit.dcsn.comp2000.bagadt.ResizableArrayBag;

public class GroceryBagger {
		
        

		private static  ResizableArrayBag<ResizableArrayBag<Grocery>> bags = new ResizableArrayBag<ResizableArrayBag<Grocery>>();
		private static ResizableArrayBag<Grocery> currentBag;
		private static int currentBagWeight = 0;
		private static int currentBagCount = 0;


		private static int numberOfItems = 0;
		
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
//			System.out.println("Read "+ grocery);

			addToBag(grocery);
			
		}
		
		private static void addToBag(Grocery grocery) {
			if(currentBag == null) {
				createNewBag();
				addToBag(grocery);
				return;
			}
			
			
				//System.out.println(currentBagWeight);
				if(currentBagWeight  + grocery.getWeight().sizeValue <  12 ) {
					if(!currentBag.add(grocery)) {
						currentBag  = new  ResizableArrayBag<Grocery>();
						bags.add(currentBag);
						currentBagWeight = 0;
						addToBag(grocery);
						return;
					}else {
						//System.out.println("Add");
						currentBagWeight += grocery.getWeight().sizeValue;
						currentBag.add(grocery);
						System.out.println(grocery);
						numberOfItems++;
					}
				} else {
					createNewBag();
					addToBag(grocery);
					return;
				}
		}
		
		private static void createNewBag() {

			System.out.println("Bag: " + ( 1 + currentBagCount) );
			currentBag  = new  ResizableArrayBag<Grocery>();
			bags.add(currentBag);
			currentBagWeight = 0;
			currentBagCount++;
		}
		
	
		
	}
		
	
		