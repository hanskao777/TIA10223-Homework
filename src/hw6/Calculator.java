package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public Calculator() {

	}

	public int powerXY(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義！");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		} else {
			return (int) (Math.pow(x, y));
		}
	}

	public int getInt(String s, Scanner sc) {
		while (true) {
			System.out.println("請輸入" + s + "的值：");
			try {
				int num = sc.nextInt();
				return num;
			} catch (InputMismatchException i) {
				System.out.println("輸入格式不正確");
				sc.next();
			}
		}
	}
}
