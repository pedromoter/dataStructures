package edu.wit.dcsn.comp2000.bagapp ;

/**
 * Enumeration of grocery item sizes for the GroceryBagger application.
 *
 * @author Pedro Moter
 * @version 1.0.0 initial version for GroceryBagger application
 * 
 */


public enum GroceryItemPerishability {
	 
    PERISHABLE (        "perishable",        1 ),
    NONPERISHABLE (       "nonperishable",       2 );
	
    public final String displayName ;

    public final int sizeValue ;


    

    GroceryItemPerishability(final String displayName , final int  value) {
		this.displayName = displayName;
		this.sizeValue = value;
	}
	
	public static GroceryItemPerishability
    interpretDescription( final String sizeDescription ) {
		
		GroceryItemPerishability corresponding;
		
		switch(sizeDescription.toLowerCase().charAt(0)) {
		
		case 'p':
            corresponding =     PERISHABLE ;
            break ;
            
		case 'n':
            corresponding =     NONPERISHABLE ;
            break ;
            
        default:
            corresponding =    PERISHABLE ;
            break;
		}
		
		return corresponding;
			
	}
	
    public String toString()
    {
    return this.displayName ;

    }   

    
    public static void main( final String[] args )
    {
    System.out.printf( "Members of the %s enumeration%n%n",
    		GroceryItemPerishability.class.getSimpleName() ) ;
    
    System.out.printf( "%-5s %-15s %-15s %-15s %-15s %-15s%n",
                       "#",
                       "Item Size",
                       "Name",
                       "Display Name",
                       "Size Value",
                       "Interpreted Size" ) ;

    for ( final GroceryItemPerishability anItemWeight : GroceryItemPerishability.values() )
        {
        System.out.printf( "%-5d %-15s %-15s %-15s %-15d %-15s%n",
        		anItemWeight.ordinal(),
        		anItemWeight,
        		anItemWeight.name(),
        		anItemWeight.displayName,
                           anItemWeight.sizeValue,
                           interpretDescription( anItemWeight.toString() ) ) ;
        }   

    }   
	
}

