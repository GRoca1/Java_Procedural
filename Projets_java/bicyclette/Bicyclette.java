package projets;

import java.util.Scanner;

public class Bicyclette {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String reponse;

		System.out.println("Est-ce qu'il fera beau demain?");
		reponse = sc.nextLine().toLowerCase();

		System.out.println(reponse);

		if (reponse.equals("oui")) {

			System.out.println("J'irai faire une balade ? bicyclette");

			System.out.println("Ma bicyclette est elle en ?t?t de fonctionnement?");
			reponse = sc.nextLine().toLowerCase();

			System.out.println(reponse);

			if (reponse.equals("non")) {
				System.out.println("je passe chez le garagiste");
			} else
				System.out.println("j'irais jusqu'? l'etang cueillir les joncs");

			System.out.println("les r?parations seront elles imm?diates?");
			reponse = sc.nextLine().toLowerCase();

			System.out.println(reponse);

			if (reponse.equals("oui")) {
				System.out.println("je pedalerais jusqu'? l'etang cueillir les joncs");
			} else
				System.out.println("j'irais ? pied jusqu'? l'etang cueillir les joncs");

		} else {
			System.out.println("je consacre ma journ?e ? la lecture");

			System.out.println("est-ce que je poss?de le 1er tome de Games of Thrones?");
			reponse = sc.nextLine().toLowerCase();

			if (reponse.equals("oui")) {
				System.out.println("je m'installerai confortablement dans un fauteuil pour le lire");
			} else {
				System.out.println("j'irais l'emprunter ? la biblioth?que");

				System.out.println("Est-ce que je peux emprunter G.O.T?");
				reponse = sc.nextLine().toLowerCase();

				System.out.println(reponse);

				if (reponse.equals("oui")) {
					System.out.println("je rentre directement ? la maison");
				} else {
					System.out.println("je vais emprunter un roman policier et je rentre directement ? la maison" + "");
				}

			}
		}

	}
}
