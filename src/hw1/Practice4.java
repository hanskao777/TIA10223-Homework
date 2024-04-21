package hw1;

public class Practice4 {
	public static void main(String[] args) {
		final double PI = 3.1415;// PI為圓周率，定義為常數
		int r = 5;// r為半徑
//		圓面積公式為PI*r^2，圓周長公式為2*PI*r
		System.out.printf("半徑為5的圓面積為%.4f，圓周長為%.4f", PI * r * r, 2 * PI * r);
	}
}
