import java.util.*;

public class Jeu_0_1_2 {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int NbMachine;
		int NbUtilisateur, Diff;
		int ScoreUtilisateur;
		int ScoreBot;
		boolean continuer = false;
		
		Random aleas= new Random();
		String rep;

		do
		{
			ScoreUtilisateur = 0;

			ScoreBot = 0;

			
				do
				{
					System.out.println("veuillez choisir un chiffre parmis : 0 - 1 - 2:  \n Taper un nombre négatif pour arrêter la partie :");


                     NbUtilisateur= sc.nextInt();

				} while ( NbUtilisateur > 3);





				NbMachine = aleas.nextInt(3);
				Diff = NbUtilisateur - NbMachine;
				Diff = Math.abs(Diff);
				switch (Diff)
				{
				case 2:
					if (NbUtilisateur > NbMachine)
					{
						ScoreUtilisateur++;
						System.out.printf("Vous marquez un 1 point \n score joueur:{0} \n score machine: {1} ",ScoreUtilisateur,ScoreBot );

					}
					else
					{
						ScoreBot++;
						System.out.printf("La machine marque un point \n score joueur:{0} \n score machine: {1} ", ScoreUtilisateur, ScoreBot);

					}
					break;



				case 1:
					if (NbUtilisateur < NbMachine)
					{
						ScoreUtilisateur++;
						System.out.printf("Vous marquez un 1 point \n score joueur:{0} \n score machine: {1} ", ScoreUtilisateur, ScoreBot);

					}
					else
					{
						ScoreBot++;
						System.out.printf("La machine marque un point \n score joueur:{0} \n score machine: {1} ", ScoreUtilisateur, ScoreBot);

					}
					break;

				case 0:
					System.out.printf("exaequo aucun joueur ne marque de point...\n score joueur:{0} \n score machine: {1} ", ScoreUtilisateur, ScoreBot);



					break;

				default:

					break;
				}




			} while (NbUtilisateur >= 0 && ScoreUtilisateur < 10 && ScoreBot < 10);
			if (NbUtilisateur < 0)
			{
				System.out.printf("Vous avez arrêté le jeu!! \n votre score est de :{0} et le score de la machine est : {1}",ScoreUtilisateur, ScoreBot);
			}
			else if (ScoreUtilisateur == 10)
			{
				System.out.println("Bravo vous avez gagné vous avez!!");
				System.out.printf("votre score est de :{0: #,###} et le score de la machine est : {1}", ScoreUtilisateur, ScoreBot);
			}
			else
			{
				System.out.println(" La machine gagne!! Essayez encore!!");

				System.out.printf("votre score est de :{0: #,###} et le score de la machine est : {1}", ScoreUtilisateur, ScoreBot);

			}


			System.out.println("Voulez vous rejouer OUI/NON?");
			rep = sc.nextLine().toUpperCase();
			if (rep == "OUI")
			{
				continuer = true;
			}
			else
			{
				continuer = false;
			}

		} while (continuer == true);

		System.out.println("Jeu terminé!!");
		sc.close();

	}



}


