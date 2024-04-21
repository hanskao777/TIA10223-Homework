package hw1;

public class Practice1 {
	public static void main(String[] args) {
//		因12與6兩個數值會重複使用到，因此指定給num1,num2兩個變數再進行計算
		int num1 = 12;
		int num2 = 6;
//		plus變數為num1與num2的和
		int plus = num1 + num2;
//		mult變數為num1與num2的積
		int mult = num1 * num2;

		System.out.printf("12，6兩個數值的和為%d\n", plus);
		System.out.printf("12，6兩個數值的積為%d", mult);
	}
}