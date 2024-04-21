package hw2;

public class Practice6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {			//共10行
			for (int j = 1; j <= 11 - i; j++) {	//規律為每行個數+行數=11
				System.out.print(j + " ");		//所需印出的數字與列數相同
			}
			System.out.println();
		}
	}
}
