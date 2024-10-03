package patternPrograms;

public class PatternProgram15 {

	public static void main(String args[]) {
		int i, j, n = 5;
		for (i = n; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (j = 0; j < n - i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}
}
//output
//    *
//   **
//  ***
// ****

