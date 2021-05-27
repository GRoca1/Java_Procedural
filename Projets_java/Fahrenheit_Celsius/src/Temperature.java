import java.text.*;
import java.util.*;

public class Temperature {

	private static String rep;

	public static void main(String[] args) {


		System.out.println("Convertisseur Degr�s Celcius et Degr�s Fahreinheit");
		System.out.println("--------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		char mode = ' ';
		String test = "";

		do {

			do {

				System.out.println("choisissez le mode de conversion !");

				System.out.println(" 1 - Convertisseur Celcius --> Fahrenheit ");
				System.out.println(" 2 - Convertisseur Fahrenheit --> Celcius ");  


				test=sc.nextLine();
				mode = test.charAt(0);

				System.out.println(test);

				if (mode!='1' && mode!='2' && test.length()>1 ) {

					System.out.println(" Mode inconnu !!! veuillez r�it�rer l'op�ration");

				}
			} 
			while (mode!='1' && mode!='2' && test.length()>1 );

			DecimalFormat modele=new DecimalFormat("0.00");

			if (mode=='1') {
				System.out.println("Veuillez entrer la temp�rature en Celcius � convertir!");
				double a=sc.nextDouble();
				double s=a*(9)/5+32;
				s=nombreArrondi(s);
				//String result = modele.format(s);

				System.out.println("temp�rature �quivalente en fahrenheit :" +s );

			}
			else
			{
				System.out.println("Veuillez entrer la temp�rature en Fahrenheit � convertir!");
				double f=sc.nextDouble();
				double c=(f-32)*5/9;
				c=nombreArrondi(c);
				//String result2 =modele.format(c);
				System.out.println("temp�rature �quivalente en Celcius :" +c );

			}
			sc.nextLine();
			System.out.println("Voulez vous convertir une autre temp�rature? O/N");
			rep = sc.nextLine().toUpperCase();

		} while ( rep.charAt(0)== 'O' && rep.length()<2);

		System.out.println("programme termin�!");
		sc.close();


	}
	public static double nombreArrondi( double _nb)
	{
		double nbarrondis=Math.round(_nb*100.0)/100.0;		
		return nbarrondis;

	}





}
