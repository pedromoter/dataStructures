package edu.wit.dcsn.comp2000.bagapp ;

/**
 * Enumeration of grocery item sizes for the GroceryBagger application.
 *
 * @author Pedro Moter
 * @version 1.0.0 initial version for GroceryBagger application
 * 
 */


public enum GroceryItemRigidness {
	 
    RIGID (        "rigid",        1 ),
    FLEXIBLE (       "flexible",       2 ),
    FIRM (       "firm",       3 );
	
    public final String displayName ;

    public final int sizeValue ;


    

    GroceryItemRigidness(final String displayName , final int  value) {
		this.displayName = displayName;
		this.sizeValue = value;
	}
	
	public static GroceryItemRigidness
    interpretDescription( final String sizeDescription ) {
		
		GroceryItemRigidness corresponding;
		
		switch(sizeDescription.toLowerCase()) {
		
		case "rigid":
            corresponding =     RIGID ;
            break ;
            
		case "flexible":
            corresponding =     FLEXIBLE ;
            break ;
            
		case "firm":
            corresponding =     FIRM ;
            break ;
            
            
        default:
            corresponding =    FIRM ;
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
    		GroceryItemRigidness.class.getSimpleName() ) ;
    
    System.out.printf( "%-5s %-15s %-15s %-15s %-15s %-15s%n",
                       "#",
                       "Item Size",
                       "Name",
                       "Display Name",
                       "Size Value",
                       "Interpreted Size" ) ;

    for ( final GroceryItemRigidness anItemWeight : GroceryItemRigidness.values() )
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

