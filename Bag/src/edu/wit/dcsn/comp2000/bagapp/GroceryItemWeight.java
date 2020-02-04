package edu.wit.dcsn.comp2000.bagapp ;

/**
 * Enumeration of grocery item sizes for the GroceryBagger application.
 *
 * @author Pedro Moter
 * @version 1.0.0 initial version for GroceryBagger application
 * 
 */


public enum GroceryItemWeight {
	 
    LIGHT (        "light",        1 ),
    MEDIUM (       "medium",       2 ),
    HEAVY (        "heavy",        3 ),;
	
	
    public final String displayName ;

    public final int sizeValue ;


    

	GroceryItemWeight(final String displayName , final int  value) {
		this.displayName = displayName;
		this.sizeValue = value;
	}
	
	public static GroceryItemWeight
    interpretDescription( final String sizeDescription ) {
		
		GroceryItemWeight corresponding;
		
		switch(sizeDescription.toLowerCase().charAt(0)) {
		
		case 'l':
            corresponding =     LIGHT ;
            break ;
            
		case 'm':
            corresponding =     MEDIUM ;
            break ;
            
		case 'h':
            corresponding =     HEAVY ;
            break ;
          
        default:
            corresponding =    MEDIUM ;
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
                       GroceryItemWeight.class.getSimpleName() ) ;
    
    System.out.printf( "%-5s %-15s %-15s %-15s %-15s %-15s%n",
                       "#",
                       "Item Size",
                       "Name",
                       "Display Name",
                       "Size Value",
                       "Interpreted Size" ) ;

    for ( final GroceryItemWeight anItemWeight : GroceryItemWeight.values() )
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

