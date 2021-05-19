import java.util.*;

public class Nb_de_Jeunes
{
	public static void main ( String args [])
	{
		int a , c = 0, d=0;
		Scanner sc= new Scanner(System.in);
		for ( int i = 0; i < 20; i ++) {
			System.out.println ("Veuillez saisir l'âge de la personne n° :" + (i + 1)); 
			a = sc.nextInt() ;
			if ( a >= 20) c ++;
			else {
				d++;
			}
		}
		System.out.println ("Il y a : "+ c +" plus de 20 ans et "+d+" moins de vinght ans ") ;
	sc.close();
	}
}