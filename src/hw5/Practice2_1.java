package hw5;

//有重複數字
public class Practice2_1 {
	public static void main(String[] args) {
		Practice2_1 p2 = new Practice2_1();
		System.out.println("本次亂數結果：");
		p2.randAvg();
	}

	public void randAvg() {
		int[] array = new int[10];
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 100);
			sum += array[i];
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print(sum / 10);
	}
}
