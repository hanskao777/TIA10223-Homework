package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class P5_ObjectIn {
	public static void main(String[] args) {
		File myFile = new File("C:\\data\\Object.ser");
		try {

			FileInputStream fis = new FileInputStream(myFile);
			ObjectInputStream ois = new ObjectInputStream(fis);

			((Cat) ois.readObject()).speak();
			((Dog) ois.readObject()).speak();
			
			ois.close();
			fis.close();

		} catch (FileNotFoundException fe) {
			System.out.println("找不到檔案");
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}

	}
}
