package BE5day7;

import java.util.Scanner;

public class TheFeast {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c = scanner.nextInt();
		int m = scanner.nextInt();

		int totalBar = findTheFeast(n, c, m);
		System.out.println(totalBar);

	}

	public static int findTheFeast(int n, int c, int m) {
		int numOfBar = (int) n / c;
		int numberOfWrap = (int) n / c;
		do {
			numOfBar += numberOfWrap / m;
			numberOfWrap += numberOfWrap % m;

		} while (numberOfWrap / m < 1);
		return numOfBar;

	}

}
