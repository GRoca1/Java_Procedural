import java.io.*;


public class Aire_Sphere
{
	public static void main (String[] args) throws IOException
	{
       double rayon, cote, perimetre, surface;

          
       rayon = Utile.lireReel("Tapez le rayon d'un cercle ");
	   
       
         perimetre = 2 * Math.PI * rayon ;
         surface = Math.PI * Math.pow( rayon, 2.0);
	   
       
	   System.out.println("Pour un cercle de rayon : " + rayon);
         System.out.println(" - le perimetre : " + perimetre);
         System.out.println(" - la surface   : " + surface);
	   
       
      
   }
}

	
	       
	   
	 