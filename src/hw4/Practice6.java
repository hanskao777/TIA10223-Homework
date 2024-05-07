package hw4;

public class Practice6 {
	public static void main(String[] args) {
		int[][] array = { { 10, 37, 100, 77, 98, 90 }, { 35, 75, 70, 95, 70, 80 }, { 40, 77, 79, 70, 89, 100 },
				{ 100, 89, 90, 89, 90, 75 }, { 90, 64, 75, 60, 75, 50 }, { 85, 75, 70, 75, 90, 20 },
				{ 75, 70, 79, 85, 89, 99 }, { 70, 95, 90, 89, 90, 75 } };
		int[] count = new int[8];//用來記數考最高分的次數
		int[] scoreHighest = new int[6];//用來存每次考試的最高分，這支程式中僅拿來操作
		
		for (int i = 0; i < array[1].length; i++) {
			int countHighest=0;
			scoreHighest[i] = array[0][i];
			for (int j = 0; j < array.length - 1; j++) {
				if (scoreHighest[i] < array[j + 1][i]) {
					scoreHighest[i] = array[j + 1][i];
					countHighest=j+1;
				}
			}
			
			count[countHighest]++;
		}
//		for (int i = 0; i < array[1].length; i++) {//第一版淘汰了，換成其他輸入資料很可能會出錯
//			for (int j = 0; j < array.length; j++) {
//				if (array[j][i] == scoreHighest[i]) {
//					count[j]++;
//				}
//			}
//
//		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(i+1 + "號同學考最高分的次數為");
			System.out.print(count[i] + "次\t");
			if (i % 4 == 3) {
				System.out.println();
			}
		}
	}
}
