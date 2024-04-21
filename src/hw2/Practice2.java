package hw2;

public class Practice2 {
	public static void main(String[] args) {
		int product = 1;// 用product存乘積
		for (int i = 1; i <= 10; i++) {
			product *= i;
		}
		System.out.println("1~10的連乘積為："+product);
	}
}
