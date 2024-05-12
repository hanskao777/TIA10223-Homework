package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = c1.getInt("x", sc);
			int y = c1.getInt("y", sc);

			try {
				System.out.println(x + "的" + y + "次方等於" + c1.powerXY(x, y));
			} catch (CalException cal) {
				cal.printStackTrace();
			}
			System.out.println("是否繼續？結束請輸入\"0\"，繼續請輸入任意字元");
			String c2 = sc.next();
			if (c2.equals("0")) {
				break;
			}
		}
		sc.close();
	}

}
