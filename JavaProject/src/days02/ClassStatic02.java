package days02;
class Student {
	int bunho;
	String name;
	int[] scores;
	
	static int cnt = 1;
	
	//항상 클래스 관련 불변의 값을 갖고 필요할 때 불러올 값이 저장되기도 함
	static final String academyName = "Himedia academy";
	
	
	public Student() {
		bunho = cnt;
		name = "아무개" + cnt;
		cnt++;
		scores = new int [3];	
	}
	
	
	
	
}

public class ClassStatic02 {

	public static void main(String[] args) {

		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		
		System.out.println("훈련기관명 : "+Student.academyName);
		System.out.println("현재 학생수 : "+ (Student.cnt-1));
		
		System.out.println("int 형 자료의 가장 큰 값 : " + Integer.MAX_VALUE);
		System.out.println("int 형 자료의 가장 작은 값 : " + Integer.MIN_VALUE);
		
	}
}
