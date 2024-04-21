package hw2;

public class Practice3 {
	public static void main(String[] args) {
		int i = 1;
		int product = 1;
		while (i <= 10) {
			product *= i;
			i++;
		}
		System.out.println("1~10的連乘積為：" + product);
	}
}
