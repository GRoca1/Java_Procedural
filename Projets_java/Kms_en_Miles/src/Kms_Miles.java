


import java.util.*;

public class Kms_Miles {


	public static void main(String[] args) {




		System.out.println("Convertisseur: Kilometers <--> Miles : ");
		System.out.println("----------------------------------------------------------");
		String saisie="";
		double distance;
		String [] montab ;
		Scanner sc = new Scanner(System.in);

		System.out.print(" Veuillez entrer une distance à convertir en Km ou Mi: ");
		saisie=sc.nextLine();

		montab=saisie.split(" ");
	
		distance =Double.parseDouble(montab[0]);
		String unite;
         if(montab.length<2)
         {
        	 unite="";
         }
         else 
         {
        	unite=montab[1]; 
         }

		for(String el : montab) 
		{
			System.out.print(el+" ");
		}
		if (unite.equals("km") ) {

			double res = distance/1.609344;
			System.out.println(" Cela donne en Miles : " +res);



		}
		else {
			double res2= distance*1.609344;
			System.out.println(" Cela donne en Kilometres : " +res2);
				sc.close();
		}
	}


}