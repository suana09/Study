package days02;

class MemberCall{
	
	int iv = 10; //인스턴스 변수
	static int sv = 20; //스태틱 변수
	int iv2 = sv; //스태틱 변수로 인스턴스 변수 값을 초기화 (가능)
	//static int sv2 = iv; //인스턴스 변수로 스태틱 변수 초기화 (불가)
	
	void instanceMethod01() { //인스턴스 메소드
		System.out.println(iv); //인스턴스 메소드에서는 인스턴스 변수 사용 O
		System.out.println(sv); //스태틱 변수도 사용 O
		instanceMethod01(); //인스턴스 메소드도 호출 O
		staticMethod(); //스태틱 메소드도 호출 O
	}
	
	static void staticMethod() { //스태틱 메소드
		//System.out.println(iv); //인스턴스 메소드에서는 인스턴스 변수 사용 X
		System.out.println(sv); //스태틱 변수도 사용 O
		//instanceMethod01(); //인스턴스 메소드 호출 X
		staticMethod(); //스태틱 메소드 호출 O
		
		//정리: non-static context 에서는 static members 를 사용할 수 있지만
		//static context 에서는 non-static members를 사용할 수 없음
		
	}
	
	void instanceMethod02() {
		
	}
	
	static void staticMethod02() {
		
	}
	
}

public class ClassStatic03 {

	public static void main(String[] args) {

		
		//스태틱 멤버는 객체 생성 없이 바로 사용 가능
		MemberCall.sv = 300;
		MemberCall.staticMethod();
		
		//인스턴스 메소드는 객체생성 후 사용 가능
		MemberCall mc = new MemberCall();
		mc.iv = 30;
		mc.instanceMethod01();
		
		//Integer.parseInt(null)
		//Math.random();
		//Math.sqrt(0);
		//Math.abs(0);
		//...etc...
		
		
		
		
		
		
		
		
		
	}

}
