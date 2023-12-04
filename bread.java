package bread;

import java.util.Scanner;

public class outputClass {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);

		//* arxizei o pinakas
		
		int[] pinakas = {1,25,9,8,33,7,8};
		int [] theseis = new int[pinakas.length];
		int searchvalue = 8 , theseiscount = 0;
		
		//* to mikos tou pinka
		
		for (int i=0; i<pinakas.length; i++) {
			System.out.print(pinakas[i]+"");
			if (searchvalue == pinakas[i]) {
				theseis[theseiscount]=i;
				theseiscount++;
				
			}
			
			
		}
		System.out.print("\nH timh vrethike stis parakato theseis:");
		for (int i=0; i<theseiscount; i++) {
			System.out.print(theseis[i]+1+"");
		}
	}
}