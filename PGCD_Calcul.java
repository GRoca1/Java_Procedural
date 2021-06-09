import java.util.Scanner;
public class PGCD_Calcul {

	public static void main (String[] args){

		System.out.println("Calcul du plus grand  diviseur commun de deux nombres entiers positifs.");
		System.out.println("--------------------------------------------------");

		Scanner sc=new Scanner(System.in);
		System.out.println("Entrez un nombre positif :  ");
		int nb1 = sc.nextInt();
		System.out.println("Entrez un nombre positif :  ");
		int nb2 = sc.nextInt();        

		int a = nb1;
		int b = nb2;

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		} 
		System.out.println("Le plus grand diviseur commun de " + nb1 + " et " + nb2 + " est " + a);
	}


}
