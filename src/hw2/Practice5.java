package hw2;

public class Practice5 {
	public static void main(String[] args) {
		int num = 1, count = 0;//count為計數器
		System.out.println("阿文可以選擇的數字如下：");
		while (num <= 49) {
//			排除個位數以及十位數為4的數字，並且印出符合條件的數字，每印一次count+1
			if (num / 10 != 4 && num % 10 != 4) {
				System.out.print(num + "\t");
				count++;
				if (count % 5 == 0)// 五個五個一排
					System.out.println();
			}
			num++;
		}
		System.out.println("總共有" + count + "個");
	}
}
