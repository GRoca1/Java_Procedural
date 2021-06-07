package tableau2dim_formation;

   
	class Tri  {
		 

		static int[] table = new int[4]; 
		    static void AfficherTable ( ) {
		      
		        int n = table.length-1;
		        for ( int i = 1; i <= n; i++) 
		            System.out.print(table[i]+" , ");
		         System.out.println();
		    }
		     static void InitTable  ( ) {
		     
		        int n = table.length-1;
		        for ( int i = 1; i <= n; i++) 
		          table[i] = (int)(Math.random()*100);
		    }

		 public static void main(String[ ] args) {
		        InitTable ( );
		        System.out.println("Tableau initial :");
		         AfficherTable ( );
		         TriSelect ( );
		         System.out.println("Tableau une fois trié :");
		        AfficherTable ( );
		        }
		

		static void TriSelect ( ) {
		  
		        int n = table.length-1;
		        for ( int i = 1; i <= n-1; i++)
		         { 
		           int m = i; 
		           for ( int j = i+1; j <= n; j++)   
		             if (table[ j ] < table[ m ]) 
		                  m = j ; 
		          
		              int temp = table[ m ];
		               table[ m ] = table[ i ];
		               table[ i ] = temp;
		         }
		}
	}
