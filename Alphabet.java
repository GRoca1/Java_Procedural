package Alphabet_phrase;


import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] alphabet= new char [26];
		String phrase="En se r�veillant un matin apr�s des r�ves agit�s, Gregor Samsa se retrouva, dans son lit, m�tamorphos� en un monstrueux insecte.";

		int [] tabfrequence= new int[26];
		
		Scanner sc= new Scanner (System.in);
		/*
		 * do { System.out.
		 * println("Veuillez saisir une phrase d'au moins 120 caract�res ponctuation non comprise!"
		 * ); phrase=sc.nextLine(); } while (phrase.length()<120);
		 */
		
		
		char lettre='a';
		for (int i =0; i<alphabet.length; i++) {
			
			alphabet[i]= lettre;
			lettre++;
		}
		
		
		for (char element : alphabet) {
			
			System.out.print(element + " ");
			
		}sc.close();
	}

}
