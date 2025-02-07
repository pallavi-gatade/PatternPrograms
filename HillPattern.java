package patternPrograms;

public class HillPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
System.out.println("================ Triangle pattern================================");		
		for(int i = 1 ; i <= n ; i++) {
			
		for(int j = i; j <= n; j++) {
			System.out.print(" ");
		}
		
		for(int j = 1; j <= i; j++){
			System.out.print("* ");
		}
		
		System.out.println();
		}
		
System.out.println("================ Hill pattern================================");
		
//		     * 
//		    * * 
//		   * * * 
//		  * * * * 
//		 * * * * * 
//================================================================
		for(int i = 1 ; i <= n ; i++) {
			
		for(int j = i; j <= n; j++) {
			System.out.print("  ");
		}
		
		for(int j = 1; j < i; j++){
			System.out.print("* ");
		}
		
		for(int j = 1; j <= i; j++){
			System.out.print("* ");
		}
		
		System.out.println();
		}
		
	}

}


//output
//		   * 
//	     * * * 
//     * * * * *
//	 * * * * * * *
// * * * * * * * * *