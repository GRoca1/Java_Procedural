import java.util.Random;
import java.util.Scanner;

public class PierreFeuilleCiseaux {

	public static void main(String[] args) {

		int NbMachine;
		int NbUtilisateur;
		int Diff;
		int scoreUtilisateur;
		int scoreBot;
		boolean continuer=true;
		String rep;
		Scanner sc=new Scanner(System.in); 

		Random aleas= new Random();

		scoreBot=0;
		scoreUtilisateur=0;
		do 
		{
			System.out.println("Veuillez entrer un Nombre au choix entre 0-1-2, ou un nombre n?gatif pour arr?ter la partie!");
			NbUtilisateur=sc.nextInt();
			sc.nextLine();
			NbMachine=aleas.nextInt(3); 


			if (NbUtilisateur>0) 
			{

				Diff=Math.abs(NbUtilisateur-NbMachine);

			switch (Diff)
			{
			case 2:
				if (NbUtilisateur> NbMachine) 
				{

					scoreUtilisateur++;
					System.out.println("bravo vous avez gagn? un point  votre score est de " + scoreUtilisateur +" score Machine :" +scoreBot);


				}
				else
				{
					scoreBot++;
					System.out.println("La machine gagne un point  son score est de " + scoreBot +" et votre est de :" +scoreUtilisateur) ;


				}



				break;
				
			case 1:
				if (NbUtilisateur< NbMachine) 
				{

					scoreUtilisateur++;
					System.out.println("bravo vous avez gagn? un point  votre score est de " + scoreUtilisateur +" score Machine :" +scoreBot);


				}
				else
				{
					scoreBot++;
					System.out.println("La machine gagne un point  son score est de " + scoreBot +" et votre est de :" +scoreUtilisateur) ;


				}




				break;
				
			case 0:
				System.out.println(" Match nul, personne ne marque de point : Score utilisateur "+ scoreUtilisateur +" score machine :"+ scoreBot);



				break;
				
			default:
				System.out.println(" valeur impr?vue"); 

				break;
			}
		}


		}
		while (scoreBot<10 && scoreUtilisateur<10 && NbUtilisateur>=0  );

		if (NbUtilisateur<0)
		{

			System.out.println(" Vous avez arr?t? le jeu! Le score de la machine est :" + scoreBot+" votre score est : " +scoreUtilisateur);

		}
		else if(scoreUtilisateur >=10)
		{
			System.out.println(" Bravo vous avez gagn?! vous atteint 10 points, le score de la machine est :" + scoreBot);

		}
		else 
		{
			System.out.println(" Perdu ! La machine ? atteint 10 points! Votre score ?tait de :" + scoreUtilisateur);
		}
		
		
		do 
		{
		System.out.println("Voulez vous rejouer O/N?");
		rep = sc.nextLine().toUpperCase();
		if (rep.equals("O"))
		{
			continuer = true;
		}
		else
		{
			continuer = false;
		}

	} while (continuer == true);

	System.out.println("Jeu termin?!!");
		

		sc.close();

		

	}

}
		

	


