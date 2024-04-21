package hw2;

public class Practice7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) { 				//六行
			for (int j = 1; j <= i; j++) {			//每行字母數剛好與i相同
				System.out.print((char) (i + 64));  //利用unicode印出英文字母
			}
			System.out.println();
		}
	}
}
