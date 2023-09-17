import java.util.Scanner;

public class Oppgave_O3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.print("n = ");
			n = scanner.nextInt();
		} while (n <= 0);
		
		int nFakultet = 1;
		for (int i = 1; i <= n; i++) {
			nFakultet *= i;
		}
		System.out.println("n! = " + nFakultet);
		scanner.close();
	}
}
