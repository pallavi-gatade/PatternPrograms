package patternPrograms;

public class PatternProgram16 {

	public static void main(String args[]) {
		int i, j, n = 6;
		for (i = n; i > 0; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= n - i; j++) {

				System.out.print(j);
			}

			System.out.println();
		}
	}
}
//output

//	   1
//    12
//   123
//  1234
// 12345
