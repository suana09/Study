package days01;

//this의 용도 #2
//오버로딩 되어 있는 생성자들 간에 서로를 재호출하기 위한 이름으로 사용
//호출하는 형태 (매개변수의 형태) 대로 생성자가 오버라이딩 되어 있어야 사용 가능


class Dclass{
	private int num1;
	private int num2;
	private int num3;
	
	Dclass(int i) {		//Constructor01
		num1 = i;
	}
	
	Dclass(int n1, int n2) {	//Constructor02
		//num1 = n1;
		this(n1); //객체생성은 안 하고 형제생성자의 코드만 실행하겠다는 호출 
		//Constructor01(n1) 과 같음
		this.num2 = n2;
	}
	
	Dclass(int n1, int n2, int n3){		//Constructor03
		this(n1, n2);
		//Constructor02(n1, n2) 와 같음
		this.num3 = n3;
	}

	
}

public class ClassThis02 {

	public static void main(String[] args) {
		Dclass d1 = new Dclass(10);
		Dclass d2 = new Dclass(10, 20);
	}

}
