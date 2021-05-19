import java.util.*;

public class NombresPremiers{


	public static void main (String [] arg)
	{

		Scanner sc = new Scanner(System.in);
		String relance="";
		long nombre;
		boolean pre=true;
		long div;
		do {
			pre=true;
			div=2;
			System.out.println ("Veuillez saisir un nombre entier : ");
			nombre=sc.nextLong();
			while(div<=Math.sqrt(nombre)&& pre==true)
			{
				if(nombre%div==0) {

					pre=false;
				}
				div++;
			}
			if (!pre) {
				System.out.println("le nombre n'est pas premier car il a au moins un diviseur:"+(div-1));
			}
			else {
				System.out.println(" le nombre " + nombre + " est premier ");
			}

			sc.nextLine();

			System.out.println("Voulez vous recommencer O/N?");
			relance=sc.nextLine().toUpperCase();
		}
		while (relance.charAt(0)=='O' && relance.length()<2);

		sc.close();



	}
}

