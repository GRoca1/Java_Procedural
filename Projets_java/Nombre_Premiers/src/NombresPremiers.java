import java.util.*;

public class NombresPremiers{


	public static void main (String [] arg)

	{

		Scanner sc = new Scanner(System.in);
		/*
		 * String relance=""; long nombre; boolean pre=true; long div; do { pre=true;
		 * div=2;
		 */
			System.out.println ("Veuillez saisir un nombre entier : ");
			
			long nombre=sc.nextLong();
			
			long[] div= new long [50];
			div = rechercheDiviseur(nombre);
			for(int i= 0; i<div.length; i++)
			{ 
				if (div[i]!=0)
				{
					System.out.println("Diviseur"+div[i]);
					}

			}
			/*
			 * while(div<=Math.sqrt(nombre)&& pre==true) { if(nombre%div==0) {
			 * 
			 * pre=false; } div++; } if (!pre) { System.out.
			 * println("le nombre n'est pas premier car il a au moins un diviseur:"+(div-1))
			 * ; } else { System.out.println(" le nombre " + nombre + " est premier "); }
			 * 
			 * sc.nextLine();
			 * 
			 * System.out.println("Voulez vous recommencer O/N?");
			 * relance=sc.nextLine().toUpperCase(); } while (relance.charAt(0)=='O' &&
			 * relance.length()<2);
			 */
		



	}
	
	public static long[] rechercheDiviseur(long _unNombre)
	{
		long [] mesDiviseurs= new long [500];
		int compteurCase=0;
		
		for (int i = 2; i < _unNombre; i++)
		{
			if(_unNombre%i==0) {
			mesDiviseurs[compteurCase]=i;
			compteurCase++;
				
			}
			
		}
		
		return mesDiviseurs;
	}
}

