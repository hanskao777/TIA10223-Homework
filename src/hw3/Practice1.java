package hw3;

import java.util.Scanner;
import java.util.Arrays;

public class Practice1 {
	public static void main(String[] args) {
		int[] tri = new int[3]; // 創建triangle矩陣儲存三角形的三個邊
		System.out.println("請輸入三個整數：");
		for (int i = 0; i < 3; i++) {// 讓使用者輸入三次整數
			Scanner sc = new Scanner(System.in);
			tri[i] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print(tri[i] + " ");
		}

		Arrays.sort(tri);// 排序一下tri陣列方便三角形條件判斷

		if ((tri[0] + tri[1]) > tri[2]) {// 短邊相加大於第三邊即為三角形
			if (tri[0] == tri[2]) {// 因為排序過，最小邊等於最大邊必定是正三角形
				System.out.print("正三角形");
			} else if (tri[0] == tri[1] || tri[1] == tri[2]) {
				System.out.print("等腰三角形");// 其中兩邊相等為等腰三角形
			} else if (Math.pow(tri[0], 2) + Math.pow(tri[1], 2) == Math.pow(tri[2], 2)) {
				System.out.print("直角三角形");// 短邊平方和等於長邊平方即為直角三角形
			} else {
				System.out.print("其他三角形");
			}
		} else {
			System.out.print("不是三角形");
		}
	}
}
