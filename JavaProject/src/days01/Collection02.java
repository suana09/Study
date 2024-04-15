package days01;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection02 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add(10); //Integer
		a.add(1.1); //Double
		a.add("Hello"); //String
		
		Integer i0 = (Integer)a.get(0);
		Double i2 = (Double)a.get(1);
		String i3 = (String)a.get(2);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		//list.add("String"); //error
		list.add(200);
		list.add(300);
		
		for (int i = 0; i < a.size(); i++) {
			int b = list.get(i); //제네릭으로 생성된 ArrayList 자료를 꺼낼때는 강제캐스팅 필요 X
			System.out.printf("list[%d} = %d\t\t", i, b);
		}
	}
}
