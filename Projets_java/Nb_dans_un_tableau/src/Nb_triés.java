
import java.util.Arrays; 
  
public class Nb_tri�s
{ 
    private static int taille;
	private static int[] contenu;

	public static void main(String[] args) 
    { 
        int[] tab = {5, 1, 8, 0, 9, 6, 4, 3, 2, 7 }; 
  
        Arrays.sort(tab); 
  
        System.out.printf("tab[] : %s", Arrays.toString(tab)); 
    
   
		int somme = 0;
		for (int i = 0; i < taille; i++)
		    somme += contenu[i];
		return (somme/(float)taille);
	    
}
}