package projets;

import java.util.Scanner;

public class Tulipe 
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		String reponse;

		System.out.println("Est-ce qu'il fera beau demain?");
		reponse = sc.nextLine().toLowerCase();

		System.out.println(reponse);

		if (reponse.equals("oui")) {
			System.out.println("J'arrache les mauvaises herbes");
			System.out.println("je plante des tulipes");
		} else {
			System.out.println("je reste sur mon canap� � la maison");
		}
		sc.close();
	}

}
