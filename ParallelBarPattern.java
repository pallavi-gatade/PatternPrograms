package patternPrograms;

public class ParallelBarPattern {

	public static void main(String[] args) {

		int n = 5;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j == 1 || j == n)
					System.out.print("* ");
				else
					System.out.print("  ");

//				if(j != 1 || j != n)
//					System.out.print("  ");
			}
			System.out.println();

		}
	}
}

//output
//
//*         *   
//*         *   
//*         *   
//*         *   
//*         *   