package patternPrograms;

public class PatternProgram9 {

	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
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
//1 0 1 0 1 0
//0 1 0 1 0 1
//1 0 1 0 1 0
//0 1 0 1 0 1
//1 0 1 0 1 0
//0 1 0 1 0 1

