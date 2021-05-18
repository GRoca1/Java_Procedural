
import java.text.DecimalFormat;
import java.util.*;

public class Kms_Miles {

	
	public static void main(String[] args) {
		     
        double kiloMeters,miles;
        
        double conversionFactor = 1.609344;
 
        
        System.out.println("Enter distance value in Kilometers : ");
        try (Scanner sc = new Scanner(System.in)) {
			kiloMeters = sc.nextDouble();
		}
        miles = kiloMeters / conversionFactor;
 
        DecimalFormat mode = new DecimalFormat("#.##");
        System.out.println("The distance in Miles : " + mode.format(miles));
        
        
        
        
        

	}

	
}