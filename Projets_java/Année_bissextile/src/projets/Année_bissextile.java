package projets;

import java.util.Scanner;

public class Ann�e_bissextile {

	public static void main(String[] args) {

		int a;
		boolean continuer = true;
		String rep = "test";

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Veuillez entrer une ann�e formt aaaa!");

			a = sc.nextInt();

			if (a % 4 == 0) {

				if (a % 100 == 0) {

					if (a % 400 == 0) {

						System.out.println("Ann�e Bissextile !");

					} else {
						System.out.println("Ann�e non bissextile !");

					}

				} else

				{

					System.out.println("Ann�e Bissextile !");

				}

			} else {
				System.out.println("ann�e non bissextile !");

			}

			sc.nextLine();
			System.out.println("Voulez-vous rentrer une autre ann�e ?");

			rep = sc.nextLine();

			if (!rep.equalsIgnoreCase("oui")) {

				continuer = false;

			}

		} while (continuer);

		System.out.println("programme termin�");

	}

}

    

