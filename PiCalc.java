//Brian Truong (bt7tg)
//CS 2110-001
public class PiCalc {
	public static double pi(int n) {
		double num_pi = 0;
		boolean add = true;
		for (int i = 1; i < 10000000; i += 2) {
			if (add) {
				num_pi += (double)1/i;
				add = false;
			} else {
				num_pi -= (double)1/i;
				add = true;
			}
		}
		num_pi *= 4;
		num_pi = Double.parseDouble(Double.toString(num_pi).substring(0,n+2));
		return num_pi;
	}
}