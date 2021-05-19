import java.util.*;

public class JeuFourche {

	public static void main(String[] args) {
		
		
		    Scanner sc = new Scanner(System.in);		   	    
		    int compteur = 0;
		    int essai=5;
		    int min, max, nbUser, nbMachine;
		    boolean continuer = false;
		    Random aleas = new Random();
		    
		    boolean continuer2 = false;
		    do {
				
		   continuer=false;
		    compteur=0;
		    essai=5;
		    
		    nbMachine = aleas.nextInt(101);
		    min = 0;
		    max = 100;
		    do {
		    System.out.println("Choisissez un nombre entre " + min + " et " + max);
		    System.out.println("Vous avez " + essai +"  essais " );
		    nbUser=sc.nextInt();		    
		    if (nbUser > nbMachine) {
		    	
		    	max=nbUser;
		    	compteur++;essai--;
		    	
		    	
		    }
		    
		    else if (nbUser<nbMachine)
		    {
		    	min=nbUser;
		    	compteur++;essai--;
		    }
		    else {
		    	compteur++;	essai--;
		    	
		    	continuer = true;
		    }
		    }
		    while(continuer==false && compteur < 5);
		    
		    if(continuer) {
		    	System.out.println("Bravo ! vous avez réussi en:" +compteur+ "coups");
		    }
		    else {
		    	System.out.println("Perdu! Essayez encore! ");
		    	System.out.println("le nombre choisi est:" + nbMachine);
		    	
		    } sc.nextLine();
		    System.out.println("Voulez vous continuer? O/N");
		   String rep= sc.nextLine().toUpperCase();
		   if(rep.equals("O"))
		   {
			   continuer2= true;
			   
			
		}
		
		  else { continuer2 = false; }
		 
			
			} while (continuer2==true);   
	
sc.close();
  System.out.println("programme terminé");

}}
