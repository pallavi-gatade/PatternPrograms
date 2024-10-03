package patternPrograms;

public class PatternProgram5 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}

	}
}

//output 
//55555
//4444
//333
//22
//22
//1
