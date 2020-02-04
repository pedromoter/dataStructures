package edu.wit.dcsn.comp2000.bagapp ;

/**
 * Enumeration of grocery item sizes for the GroceryBagger application.
 *
 * @author Pedro Moter
 * @version 1.0.0 initial version for GroceryBagger application
 * 
 */


public enum GroceryItemBreakability {
	 
    BREAKABLE (        "breakable",        1 ),
    NONBREAKABLE (       "nonbreakable",       2 );
	
    public final String displayName ;

    public final int sizeValue ;


    

    GroceryItemBreakability(final String displayName , final int  value) {
		this.displayName = displayName;
		this.sizeValue = value;
	}
	
	public static GroceryItemBreakability
    interpretDescription( final String sizeDescription ) {
		
		GroceryItemBreakability corresponding;
		
		switch(sizeDescription.toLowerCase().charAt(0)) {
		
		case 'b':
            corresponding =     BREAKABLE ;
            break ;
            
		case 'n':
            corresponding =     NONBREAKABLE ;
            break ;
            
        default:
            corresponding =    NONBREAKABLE ;
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
    		GroceryItemBreakability.class.getSimpleName() ) ;
    
    System.out.printf( "%-5s %-15s %-15s %-15s %-15s %-15s%n",
                       "#",
                       "Item Size",
                       "Name",
                       "Display Name",
                       "Size Value",
                       "Interpreted Size" ) ;

    for ( final GroceryItemBreakability anItemWeight : GroceryItemBreakability.values() )
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

