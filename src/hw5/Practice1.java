package hw5;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高：");
		int i,j;
		i = sc.nextInt();
		j = sc.nextInt();
		Practice1 p1 = new Practice1();
		p1.starSquare(i, j);
	}
	
	public void starSquare(int width,int height) {
		for(int i=0 ;i<4;i++) {
			for(int j =0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
