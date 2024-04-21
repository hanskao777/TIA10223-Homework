package hw1;

public class Practice5 {
	public static void main(String[] args) {
//		p為本金，i為利息，n為期數
		int p = 1_500_000;
		double i = 0.02;
		int n = 10;
//		複利的公式是p*(1+i)^n
		double money = p * Math.pow(i + 1, 10);
		System.out.printf("本金加利息共有%.2f元", money);
	}
}
