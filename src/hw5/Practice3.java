package hw5;

public class Practice3 {
	public static void main(String[] args) {
		int[][] x = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] y = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		Practice3 p3 = new Practice3();
		System.out.println(p3.maxElement(x));
		System.out.println(p3.maxElement(y));
	}

	public int maxElement(int x[][]) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public double maxElement(double x[][]) {
		double max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
}
