
import java.util.*;
class Jouer

{

	public static void main(String[] args){

		Scanner sc1 = new Scanner(System.in);
		System.out.println("\n\n \t\t Saisie des noms :  \n ****************************************************");
		System.out.println("Le nom du premier joueur : ");
		String j1 = sc1.nextLine();
		System.out.println("Vous avez saisi : " +j1);

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Le nom du deuxieme joueur : ");
		String j2 = sc2.nextLine();
		System.out.println("Vous avez saisi : " +j2);


		System.out.println("\n\n \t\tSimulation du premier jeu: \n ****************************************************");


		Score joueur1= new Score (j1, 60);
		Score joueur2= new Score (j2, 60);

		for (int i=1; i<=10; i++)
		{
			joueur1.ajouteScore();
			joueur2.ajouteScore();
		}


		joueur1.affichage();
		joueur2.affichage();


		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		if (joueur1.getScore()<joueur2.getScore())  System.out.println("Le joueur  " +j2+ "  est le gagnant : BRAVO!"); 
		else if (joueur1.getScore()>joueur2.getScore()) System.out.println("Le joueur  " +j1+ "  est le gagnant : BRAVO!");
		else System.out.println("Les deux joueurs " +j1+ " et " +j2+ " ont des scores egaux!!!!!!");



	}}

