package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P1_Collection {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("===============================================================");
		for (Object xx:list) {
			System.out.print(xx+" ");
		}//是用Object嗎？總覺得怪怪的，但是跑得出來耶:D
		System.out.println();
		System.out.println("===============================================================");
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i) instanceof Number != true) {
//				list.remove(list.get(i));
//			}
//		}//不能這樣寫耶，因為索引值會一直變，有些應該要刪掉的東西就不會被刪掉
		Iterator objs = list.iterator();
		while (objs.hasNext()) {
			Object obj = objs.next();
			if (!(obj instanceof Number)) {
				objs.remove();
			} else {
				System.out.print(obj+" ");
			}
		}//總覺得用了objs.remove();不符合老師要的，而且這個寫法有一點點神奇，不過算了ヽ( ´￢`)ノ

		// 就是在玩set，無視就好
//		Set set = new HashSet();
//		set.add(new Integer(100));
//		set.add(new Double(3.14));
//		set.add(new Long(21L));
//		set.add(new Short("100"));
//		set.add("Kitty");
//		set.add(new Integer(100));
//		set.add(new Object());
//		set.add("Snoopy");
//		set.add(new BigInteger("1000"));

//		Iterator objs = set.iterator();
//		while (objs.hasNext()) {
//			System.out.println(objs.next());//就玩一下set，不好玩(X)
//		}
	}
}
