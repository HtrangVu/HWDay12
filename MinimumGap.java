package BE5day7;

public interface MinimumGap {
	public static int findMinGap(int[] arr) {
		int minGap = 0;
		int currentGap = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					minGap = j - i;
					if (currentGap < minGap) {
						int tmp = currentGap;
						currentGap = minGap;
						minGap = tmp;
					}
					currentGap = minGap;

				}

			}
		}
		return minGap;
	}

	public static void main(String args[]) {
		int[] arr = { 7, 1, 6, 1, 7, 4 };
		int minGap = findMinGap(arr);
		System.out.println(minGap);
	}

}
