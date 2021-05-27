import java.util.*;

public class Temperature {

	private static String rep;

	public static void main(String[] args) {


		System.out.println("Convertisseur Degrés Celcius et Degrés Fahreinheit");
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

					System.out.println(" Mode inconnu !!! veuillez réitérer l'opération");

				}
			} 
			while (mode!='1' && mode!='2' && test.length()>1 );

			//DecimalFormat modele=new DecimalFormat("0.00");

			if (mode=='1') {
				System.out.println("Veuillez entrer la température en Celcius à convertir!");
				double a=sc.nextDouble();
				double s=a*(9)/5+32;
				s=Temperature.nombreArrondi2(s,3);
				//String result = modele.format(s);

				System.out.println("température équivalente en fahrenheit :" +s );

			}
			else
			{
				System.out.println("Veuillez entrer la température en Fahrenheit à convertir!");
				double f=sc.nextDouble();
				double c=(f-32)*5/9;
				c=nombreArrondi2(c,3);
				//String result2 =modele.format(c);
				System.out.println("température équivalente en Celcius :" +c );

			}
			sc.nextLine();
			System.out.println("Voulez vous convertir une autre température? O/N");
			rep = sc.nextLine().toUpperCase();

		} while ( rep.charAt(0)== 'O' && rep.length()<2);

		System.out.println("programme terminé!");
		sc.close();


	}
	public static double nombreArrondi( double _nb)
	{
		double nbarrondi=Math.round(_nb*100.0)/100.0;		
		return nbarrondi;

	}
	public static double nombreArrondi2( double _nb, int _chiffrevirgule)
	{
		double temp=_nb*Math.pow(10, _chiffrevirgule);
		double nbarrondi=Math.round(temp)/Math.pow(10, _chiffrevirgule);		
		return nbarrondi;

	}




}
