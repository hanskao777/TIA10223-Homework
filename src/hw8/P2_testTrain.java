package hw8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P2_testTrain {
	public static void main(String[] args) {
		Set<Train> set = new TreeSet<>();
		set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set.add(new Train(118, "自強", "高雄", "台北", 500));
		set.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set.add(new Train(122, "自強", "台中", "花蓮", 600));
		set.add(new Train(122, "區間", "樹林", "七堵", 300));
		set.add(new Train(202, "區間", "屏東", "基隆", 700));

		Iterator<Train> objs = set.iterator();
		while (objs.hasNext()) {
			System.out.println(((Train) objs.next()).getter());
		}
	}

}

class Train {
	int number;
	String type;
	String start;
	String dest;
	double price;

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public void setter(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public String getter() {
		return "班次" + number + type + "列車從" + start + "開往" + dest + "票價為：" + price;

	}

}