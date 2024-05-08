package hw5;

//無重複數字
public class Practice2_2 {
	public static void main(String[] args) {
		Practice2_2 p2 = new Practice2_2();
		System.out.println("本次亂數結果：");
		p2.randAvg();
	}

	public void randAvg() {
		int[] array = new int[10];
		int sum = 0;
		int count = 0;
		int i = 0;

		while (count < 10) {
			array[count] = (int) (Math.random() * 100);
			while (count > 0) {
				if (array[count] != array[i]) {
					i++;
				} else {
					if (i == count) {
						break;
					} else {
						array[count] = (int) (Math.random() * 100);
						i = 0;
					}

				}

			}
			sum += array[count];
			System.out.print(array[count] + " ");
			count++;
		}

		System.out.println();
		System.out.print(sum / 10);
	}
}
