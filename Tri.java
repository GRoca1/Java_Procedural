package Tri;

import java.util.Arrays;
import java.util.Collections;

public class Tri {

   
public static void main(String[] args) {

   
   int array[] = {};

   
   Integer[] integerArray = new Integer[array.length];
   
   for (int i=0; i < array.length; i++) {
      System.out.println("nombre: " + array[i]);
  
   integerArray[i] = new Integer(array[i]);
   }
 
  
   Arrays.sort(integerArray, Collections.reverseOrder());

  
   System.out.println("Tableau trié\n");
   for (int entier : integerArray) {
      System.out.println("nombre: " + entier);
   }
   }
}
