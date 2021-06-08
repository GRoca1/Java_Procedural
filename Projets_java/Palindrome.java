package palindromeoupas;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Entrez la phrase ou les mots");
		String t=sc.next();
		
		if (t.length()==0);
		
		System.out.println("La phrase est vide");

		char[] tab; 

		tab=t.toCharArray();  


		int p=t.length()-1;

		int i=0;
		int j=p;



		{
			i++;
			j--;
		}
		
		if ((i<=j)&&(tab[i]==tab[j]))

			System.out.println("la chaîne de caractères:"+t+" est un palindrome");
		else
			System.out.println("la chaîne de caractères:"+t+" n'est pas un palindrome");
		sc.close();
	}
}
	