package hw4;

public class Practice1 {
	public static void main(String[] args) {
		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		double ave = 0;//average，平均不是整數的機率很大，雖然這題是整數
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		ave = sum / array.length;
		System.out.println("此陣列所有元素的平均值為：\n"+ave+"\n");
		System.out.println("此陣列大於平均值的元素陳列如下：");

		for (int i = 0; i < array.length; i++) {
			if (array[i] > ave) {
				System.out.print(array[i] + "\t");
			}
		}
	}
}
