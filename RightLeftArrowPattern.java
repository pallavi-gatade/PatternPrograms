package patternPrograms;

public class RightLeftArrowPattern {

	public static void main(String[] args) {
		
		int n = 7;

		int mid = n / 2;

		for (int i = 1; i < n - 1; i++) {
			
			for (int j = 0; j < n; j++) {

				int abs = Math.abs(mid - i);
				if (i == mid || j == abs || j == n - abs - 1)

					System.out.print("* ");
				else
					System.out.print("  ");

			}
			System.out.println();
		}
		
	}
}

//   output
//    *   *     
//  *       * 
//* * * * * * * 
// *        *   
//    *   *   
