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


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public GroceryItemSize getSize() {
			return size;
		}


		public void setSize(GroceryItemSize size) {
			this.size = size;
		}


		public GroceryItemBreakability getBreakability() {
			return breakability;
		}


		public void setBreakability(GroceryItemBreakability breakability) {
			this.breakability = breakability;
		}


		public GroceryItemMaterial getMaterial() {
			return material;
		}


		public void setMaterial(GroceryItemMaterial material) {
			this.material = material;
		}


		public GroceryItemPerishability getPerishability() {
			return perishability;
		}


		public void setPerishability(GroceryItemPerishability perishability) {
			this.perishability = perishability;
		}


		public GroceryItemRigidness getRigdness() {
			return rigdness;
		}


		public void setRigdness(GroceryItemRigidness rigdness) {
			this.rigdness = rigdness;
		}


		public GroceryItemWeight getWeight() {
			return weight;
		}


		public void setWeight(GroceryItemWeight weight) {
			this.weight = weight;
		}
		
		



		
		
}
