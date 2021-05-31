package recherche_lettre;

import java.util.*;

public class recherche {

	public static void main(String[] args)

	{

		String maphrase="";
		char malettre;
		boolean passe = false;
		int nbOccurences=0;
		int [] tabPosition = new int[120];
		boolean trouve=false;
		Scanner sc= new Scanner(System.in);



		do {
			System.out.println("Veuillez entrer une phrase d'au moins 120 caractères terminée par un point !");
			maphrase = sc.nextLine();
			int depart=maphrase.length()-1;
			String souschaine = maphrase.substring(depart,maphrase.length());
			if (maphrase.length()>120 && souschaine.equals(".")) 
			{

				passe = true;
			}
		} while (passe = false);
		//sc.nextLine();

		if (maphrase.length()==1)
		{
			System.out.println("la phrase est vide");
		}
		else
		{
			System.out.println("Veuillez entrer une lettre à rechercher !");
			malettre=sc.nextLine().charAt(0);
			for (int i =0; i <= maphrase.length()-1;i++) {


				if (malettre==maphrase.charAt(i)) {

					trouve = true;
					tabPosition[nbOccurences]=(i+1);
					nbOccurences++;



				}

			}
			if (trouve==false) {
				System.out.println("La lettre n'est pas présente dans la phrase!!");

			} else
			{
				System.out.println("La lettre est présente"+ nbOccurences+"fois dans la phrase aux positions suivante");
				for (int element : tabPosition) {

					if (element !=0) {

						System.out.print(element);				
					}sc.close();

				}
			}
		}

	}
}
