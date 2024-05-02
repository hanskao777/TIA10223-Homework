package hw4;

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		int[][] array = new int[5][2];
		array = new int[][] { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		Scanner sc = new Scanner(System.in);
		System.out.println("小華想借多少錢？");
		int money = sc.nextInt();
		int count = 0;
		System.out.print("有錢可借的員工編號:");
		for (int i = 0; i < 5; i++) {
			if (array[i][1] >= money) {
				System.out.print(array[i][0] + " ");
				count++;
			}
		}
		if (count == 0)
			System.out.print("無，");
		System.out.println("共" + count + "人");
	}
}
