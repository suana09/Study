package days02;

import java.util.ArrayList;

class Point{
	private int x;
	private int y;
}

public class Collection03 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add(10); //정수
		list.add("강아지"); //스트링
		list.add('먀'); //문자
		
		Point p = new Point();
		list.add(p); //객체
		
		int i = (Integer)list.get(0); 
		//배열에 오브젝트 형태로 데이터를 넣었기 때문에 형변환해서 꺼내줘야 함
		String s = (String)list.get(1);
		Point p1 = (Point)list.get(2);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Point> list3 = new ArrayList<Point>();
		
		list1.add(20);
		list2.add("강아지");
		list3.add(p);
		
		i = list1.get(0);
		s = list2.get(0);
		p1 = list3.get(0);
		
		
		
		
		
		
	}

}
