package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class P3_CopyFile {
	public static void main(String[] args) {
		File f1 = new File("C:\\TIA102_Workspace\\TIA10223-Homework\\src\\hw7\\Sample.txt");
		File f2 = new File("C:\\TIA102_Workspace\\TIA10223-Homework\\src\\hw7\\SampleCopy.txt");
		P3_CopyFile p3 = new P3_CopyFile();
		p3.copyFile(f1, f2);
	}

	public void copyFile(File f1, File f2) {
		try {
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			String s = "";

			FileWriter fw = new FileWriter(f2);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter ws = new PrintWriter(bw);

			while ((s = br.readLine()) != null) {
				ws.println(s);
			}
			ws.close();
			bw.close();
			fw.close();
			br.close();
			fr.close();

			System.out.println("複製成功");
		} catch (IOException e) {
			System.out.println("格式錯誤");
		}

	}
}
