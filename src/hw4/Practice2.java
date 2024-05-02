package hw4;

public class Practice2 {
	public static void main(String[] args) {

		String s = "Hello World";

		char[] array = new char[11];

		for (int i = 0; i < array.length; i++) {
			array[i] = s.charAt(array.length - 1 - i);// charAt是講義上有的方法，講義P.132
			System.out.print(array[i]);
		}

	}
}
