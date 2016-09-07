//Brian Truong (bt7tg)
//CS 2110-001
public class Random {
	public static int[] random(int r, int a, int b, int m) {
		int[] arr = new int[25];
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr[i] = ((a * r + b) % m);
			} else {
				arr[i] = ((a * arr[i-1] + b) % m);
			}
		}
		return arr;
	}
}
