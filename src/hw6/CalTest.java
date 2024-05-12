package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		CalTest c1 =new CalTest(); 
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = c1.getInt("x",sc);
			int y = c1.getInt("y",sc);
			
			try {
				System.out.println(x+"的"+y+"次方等於"+c.powerXY(x, y));
			} catch (CalException cal) {
				cal.printStackTrace();
			}
			System.out.println("是否繼續？結束請輸入\"0\"");
			String c2 = sc.next();
			if(c2.equals("0")) {
				break;
			}
		}
		sc.close();
	}
	
	
	public int getInt(String s,Scanner sc) {
		while(true) {
			System.out.println("請輸入"+s+"的值：");
			try {
				int num = sc.nextInt();
				return num;
			}catch(InputMismatchException i){
				System.out.println("輸入格式不正確");
				sc.next();
			}
		}
	}
}
