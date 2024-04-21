package hw2;

public class Practice1 {
	public static void main(String[] args) {
		int sum = 0;// 用sum來存偶數和
		int num = 0;
		while (num <= 1000) {
			sum += num;
			num += 2;// 僅計算偶數
		}
		System.out.println("1~1000的偶數和為：" + sum);
	}
}
