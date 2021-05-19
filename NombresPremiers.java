import java.util.*;

public class NombresPremiers{


	public static void main (String [] arg)
	{

		Scanner sc = new Scanner(System.in);
		String recommencer="";
		long nombre;
		boolean pre=true;
		long div=2;
		do {
			System.out.println ("Veuillez saisir un nombre entier : ");
			nombre=sc.nextLong();
			while(div<Math.sqrt(nombre)&& pre==true)
			{
				if(nombre%div==0) {

					pre=false;
				}
				div++;
			}
			if (!pre) {
				System.out.println("le nombre n'est pas premier:"+div);
			}
			else {
				System.out.println("le nombre"+ nombre + "est premier");
			}

			sc.nextLine();

			System.out.println("Voulez vous recommencer O/N?");
			recommencer=sc.nextLine();
		}
		while (recommencer.charAt(0)=='0' && recommencer.length()<2);

		sc.close();



	}
}

