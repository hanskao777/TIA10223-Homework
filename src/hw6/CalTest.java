package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("請輸入x的值：");
				int x = sc.nextInt();
				System.out.println("請輸入y的值：");
				int y = sc.nextInt();
				System.out.printf("%d的%d次方等於%d\n", x, y, c.powerXY(x, y));
				System.out.println("結束請輸入\"0\"，繼續請輸入任意字元");
				String s = sc.next();
				if(s.equals("0")) {
					sc.close();
					break;
				}
			} catch (InputMismatchException e1) {
				System.out.println("輸入格式不正確");
				sc.next();// 清空sc的值，神奇操作，chatgpt大神教的:D
			} catch (CalException e2) {
				e2.printStackTrace();
			}
		}
	}
}
