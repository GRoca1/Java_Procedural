import java.util.*;

public class JeuFourche {

	public static void main(String[] args) {
		
		
		    Scanner sc = new Scanner(System.in);		   	    
		    int compteur = 0;
		    int min, max, nbUser, nbMachine;
		    boolean continuer = false;
		    Random aleas = new Random();
		    nbMachine = aleas.nextInt(101);
		    min = 0;
		    max = 100;
		    do {
		    System.out.println("Choisissez un nombre entre " + min + " et " + max);
		    System.out.println("Vous avez 5 essais " );
		    nbUser=sc.nextInt();		    
		    if (nbUser > nbMachine) {
		    	
		    	max=nbUser;
		    	compteur++;
		    	
		    	
		    }
		    
		    else if (nbUser<nbMachine)
		    {
		    	min=nbUser;
		    	compteur++;
		    }
		    else {
		    	compteur++;		    
		    	continuer = true;
		    }
		    }
		    while(continuer==false && compteur < 5);
		    
		    if(continuer) {
		    	System.out.println("Bravo ! vous avez r�ussi en:" +compteur+ "coups");
		    }
		    else {
		    	System.out.println("Perdu! Essayez encore! ");
		    	System.out.println("le nombre choisi est:" + nbMachine);
		    	sc.close();
		    }
		    
	

}}