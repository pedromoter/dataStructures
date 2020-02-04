package edu.wit.dcsn.comp2000.bagapp ;

/**
 * Enumeration of grocery item sizes for the GroceryBagger application.
 *
 * @author Pedro Moter
 * @version 1.0.0 initial version for GroceryBagger application
 * 
 */


public enum GroceryItemMaterial {
	 
    SOFT (        "soft",        1 ),
    FIRM (       "firm",       2 ),
    LIGHT   ( "light ", 3),
    HARD (        "hard",        4 );
	
	
    public final String displayName ;

    public final int sizeValue ;


    

    GroceryItemMaterial(final String displayName , final int  value) {
		this.displayName = displayName;
		this.sizeValue = value;
	}
	
	public static GroceryItemMaterial
    interpretDescription( final String sizeDescription ) {
		
		GroceryItemMaterial corresponding;
		
		switch(sizeDescription.toLowerCase().charAt(0)) {
		
		case 'l':
            corresponding =     LIGHT ;
            break ;
            
		case 'f':
            corresponding =     FIRM ;
            break ;
            
		case 's':
            corresponding =     SOFT ;
            break ;
		
		case 'h':
            corresponding =     HARD ;
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
    		GroceryItemMaterial.class.getSimpleName() ) ;
    
    System.out.printf( "%-5s %-15s %-15s %-15s %-15s %-15s%n",
                       "#",
                       "Item Size",
                       "Name",
                       "Display Name",
                       "Size Value",
                       "Interpreted Size" ) ;

    for ( final GroceryItemMaterial anItemWeight : GroceryItemMaterial.values() )
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

