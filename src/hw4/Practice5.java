package hw4;

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Practice5 p5 = new Practice5();
		int[] ymd = new int[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入年份：");

		while (true) {
			ymd[0] = sc.nextInt();
			if (ymd[0] >= 1583) {
				break;
			} else {
				System.out.println("1583年前運行之年曆規則與現時不同，請重新輸入1583年以後的年份：");// 有空會補1852年的運算
			}

		}

		System.out.println("請輸入月份：");

		while (true) {
			ymd[1] = sc.nextInt();
			if (ymd[1] >= 1 && ymd[1] <= 12) {
				break;
			} else {
				System.out.println("請正確輸入1~12月之月份：");
			}
		}

		System.out.println("請輸入幾號：");

		while (true) {
			ymd[2] = sc.nextInt();
			if (p5.isLeapYear(ymd[0]) == true) {
				if (p5.monthType(ymd[1]) == 1) {
					if (ymd[2] >= 1 && ymd[2] <= 31) {
						p5.countDays(ymd[1], ymd[2], true);
						break;
					} else {
						System.out.println(ymd[1] + "月只有1~31號，請輸入正確的日期：");
					}
				} else if (p5.monthType(ymd[1]) == 3) {
					if (ymd[2] >= 1 && ymd[2] <= 30) {
						p5.countDays(ymd[1], ymd[2], true);
						break;
					} else {
						System.out.println(ymd[1] + "月只有1~30號，請輸入正確的日期：");
					}
				} else {
					if (ymd[2] >= 1 && ymd[2] <= 29) {
						p5.countDays(ymd[1], ymd[2], true);
						break;
					} else {
						System.out.println(ymd[1] + "月只有1~29號，請輸入正確的日期");
					}
				}

			} else {
				if (p5.monthType(ymd[1]) == 1) {
					if (ymd[2] >= 1 && ymd[2] <= 31) {
						p5.countDays(ymd[1], ymd[2], false);
						break;
					} else {
						System.out.println(ymd[1] + "月只有1~31號，請輸入正確的日期：");
					}
				} else if (p5.monthType(ymd[1]) == 3) {
					if (ymd[2] >= 1 && ymd[2] <= 30) {
						p5.countDays(ymd[1], ymd[2], false);
						break;
					} else {
						System.out.println(ymd[1] + "月只有1~30號，請輸入正確的日期：");
					}
				} else {
					if (ymd[2] >= 1 && ymd[2] <= 28) {
						p5.countDays(ymd[1], ymd[2], false);
						break;
					} else {
						System.out.println(ymd[1] + "月只有1~28號，請輸入正確的日期");
					}
				}

			}
		}

	}

	public void countDays(int month, int day, boolean isLeapYear) {
		int[] monthDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
		if (isLeapYear == true) {
			monthDays[2] = 29;
		}
		int daysTotal;
		int sum = 0;
		for (int i = 0; i <= month - 1; i++) {
			sum += monthDays[i];
		}
		daysTotal = sum + day;
		System.out.println("輸入的日期為該年第" + daysTotal + "天");
	}

	public boolean isLeapYear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		} else {
			return false;
		}

	}

	public int monthType(int month) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 1;// 回傳1代表大月31天
		case 2:
			return 2;// 回傳2代表2月
		case 4:
		case 6:
		case 9:
		case 11:
			return 3;// 回傳3代表小月30天
		}
		return 0;
	}

}
