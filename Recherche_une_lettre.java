import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recherche_une_lettre {

	public static void main(String[] args) throws IOException 
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 
	        System.out.println("entrez une phrase:");
	        String s1 = br.readLine();
	        StringBuffer sb=new StringBuffer(s1);
	        

	        while(sb.length() != 0)
	        {
	           char c = sb.charAt(0);
	           int cnt = 0;
	           
	           for(int i=0; i< sb.length(); i++)
	           {
	           if(c == sb.charAt(i))
	           {
	               cnt++;
	               sb.deleteCharAt(i);
	               i--;
	           }

	           }

	           System.out.println(c + "     occurence est :" + cnt);
	        }
	}
}
		
		
		

	


