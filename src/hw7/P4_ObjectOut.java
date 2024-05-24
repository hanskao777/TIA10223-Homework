package hw7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class P4_ObjectOut {
	public static void main(String[] args) {
		File myDir = new File("C:\\data");
		if (myDir.isDirectory() != true) {
			myDir.mkdir();
		}//會在C槽創建一個data資料夾
		Cat cat = new Cat("大小姐");
		Dog dog = new Dog("執事");

		File myFile = new File("C:\\data\\Object.ser");
		try {
			FileOutputStream fos = new FileOutputStream(myFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(cat);
			oos.writeObject(dog);
			
			oos.close();
			fos.close();//乖孩子都會關
			
		} catch (FileNotFoundException e) {
			System.out.println("沒有找到檔案");
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
