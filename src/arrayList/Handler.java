package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Handler {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(5);
		// add 8
		list.add(3); list.add(-9); list.add(65);
		System.out.println(list);
		list.add(1, 8);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.indexOf(65));
	}

}
