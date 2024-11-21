package patternPrograms;

public class PatternProgram19 {
	
	    public static void main(String[] args) {
	        int i, j,k,s;
	        int n = 5;
	      
	        // Upper Part
	        for (i = 1; i <= n; i++) {
	            for (j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            
	            s=2*(n-i);
	            for(k = 1;k<=s;k++)
	            {
	                System.out.print("  ");
	            }
	            for (j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        
	        // Lower Part
	        for (i = n; i >= 0; i--) {
	            for (j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            
	            // for spaces with
	            s=2*(n-i);
	            if(i<=n) {
	                for (k = 1; k <= s; k++) {
	                    System.out.print("  ");
	                }
	            }
	            for (j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}

