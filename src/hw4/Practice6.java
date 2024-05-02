package hw4;

public class Practice6 {
	public static void main(String[] args) {
		int[][] array = { { 10, 37, 100, 77, 98, 90 }, { 35, 75, 70, 95, 70, 80 }, { 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 75 }, { 90, 64, 75, 60, 75, 50 }, { 85, 75, 70, 75, 90, 20 },
				{ 75, 70, 79, 85, 89, 99 }, { 70, 95, 90, 89, 90, 75 } };
		int[] count = new int[8];
		int[] scoreHighest = new int[6];
		for (int i = 0; i < array[1].length; i++) {
			scoreHighest[i] = array[0][i];
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j][i] < array[j + 1][i] && scoreHighest[i] < array[j + 1][i]) {
					scoreHighest[i] = array[j + 1][i];
				}
			}

		}
		for (int i = 0; i < array[1].length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j][i] == scoreHighest[i]) {
					count[j]++;
				}
			}

		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(i + "號同學考最高分的次數為");
			System.out.print(count[i] + "次\t");
			if (i % 4 == 3) {
				System.out.println();
			}
		}
	}
}
