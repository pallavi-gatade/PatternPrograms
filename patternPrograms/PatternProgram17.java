package patternPrograms;

public class PatternProgram17 {

	public static void main(String args[]) {
		int i, j, n = 6;
		for (i = n; i > 0; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= n - i; j++) {

				System.out.print(i);
			}

			System.out.println();
		}
	}
}
//output
//     5
//    44
//   333
//  2222
// 11111
