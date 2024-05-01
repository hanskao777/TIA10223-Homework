package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		int[] num = new int[49];// 存所有樂透號碼的矩陣
		int count = 0;// 用來計數去除阿文討厭的數字後還有多少個數字

		System.out.println("阿文...請輸入你討厭哪個數字？");
		Scanner sc = new Scanner(System.in);
		int numHate = sc.nextInt();// 用numHate接阿文討厭的數字
		System.out.println();
		for (int i = 0; i < 49; i++) {
			num[i] = i + 1;
		}
		int index = 0;// 存放樂透號碼的矩陣的索引值
		while (num[index] <= 49) {
			if (num[index] % 10 != numHate && num[index] / 10 != numHate) {
				System.out.print(num[index] + "\t");
				count++;
				if (count % 6 == 0)// 六個六個一排
					System.out.println();
			} else {
				num[index] = 0;// 把阿文不喜歡的數字都變成0，方便之後推薦六個號碼用
			}
			index++;
			if (index == 49)
				break;// 超過矩陣大小要break，不然會報錯
		}
		System.out.println("總共有" + count + "個數字可以選");

		int countToSix = 0;// 用來計數隨機選出的六個數字
		int[] numSix = new int[6];// 建立一個存放選出來的六個數字的矩陣然後準備sort用，因為直接print出來很醜
		while (countToSix < 6) {
			int ran = (int) (Math.random() * 49);// 用ran來接0~48的隨機數字
			if (num[ran] != 0) {
				numSix[countToSix] = num[ran];
				countToSix++;
				num[ran] = 0;
			}

		}
		
		System.out.println();

		Arrays.sort(numSix);// 排序後比較好看，舒服
		System.out.println("我推薦下面六個數字哦OuO");
		for (int i = 0; i < 6; i++) {
			System.out.print(numSix[i] + "\t");
		}
	}
}
