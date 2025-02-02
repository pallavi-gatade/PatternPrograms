package patternPrograms;

public class LeftArrow {

	public static void main(String[] args) {

		   int n = 5;
	        int x = n / 2 + 1;
	        for (int i = 1; i<= n; i++) {
	        	
	            for (int j = 1; j <= n; j++) {
	            	
	                if (i == x || i + j == x + 1 || i - j == x - 1) {
	                	
	                    System.out.print(" *");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}


