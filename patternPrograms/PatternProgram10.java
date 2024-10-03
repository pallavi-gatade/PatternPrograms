package patternPrograms;

public class PatternProgram10 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				int k = i + j;
				if (k % 2 == 0) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println(" ");
		}
	}
}

//output
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1
