package edu.wit.dcsn.comp2000.bagapp;

public class Grocery {

		private String name;
		private GroceryItemSize size;
		private GroceryItemBreakability breakability;
		private GroceryItemMaterial material;
		private GroceryItemPerishability perishability;
		private GroceryItemRigidness rigdness;
		private GroceryItemWeight weight;
		
		
		public Grocery(String name, String size, String breakability,
				String material, String perishability, String rigdness,
				String weight) {
			super();
			this.name = name;
			this.size = GroceryItemSize.interpretDescription(size);
			this.breakability = GroceryItemBreakability.interpretDescription(breakability);
			this.material = GroceryItemMaterial.interpretDescription(material);
			this.perishability = GroceryItemPerishability.interpretDescription(perishability);
			this.rigdness = GroceryItemRigidness.interpretDescription(rigdness);
			this.weight = GroceryItemWeight.interpretDescription(weight);
		}

		
		public boolean compareTo( Grocery item) {
			
			if(item.breakability.sizeValue > this.breakability.sizeValue) {
				return false;	
			}
		
			
			
			return true;
		}

		@Override
		public String toString() {
			return "Grocery [name=" + name + ", size=" + size + ", breakability=" + breakability + ", material="
					+ material + ", perishability=" + perishability + ", rigdness=" + rigdness + ", weight=" + weight
					+ "]";
		}
		
		



		
		
}
