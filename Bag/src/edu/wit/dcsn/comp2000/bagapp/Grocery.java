package edu.wit.dcsn.comp2000.bagapp;

public class Grocery {

		private String name;
		private GroceryItemSize size;
		
		
	   @Override
		public String toString() {
			
	   System.out.println(name);
	    return name + " size: " + size;
		}
}
