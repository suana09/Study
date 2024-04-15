package days01;

class BClass{
	private int age;
	//BClass(){
	//	age = 10;
	//}
	
	BClass(int age){
		this.age = age;
	}
	//매개변수가 있는 생성자를 새로 정의하면, 안보이던 디폴트 생성자가 매개변수가 잇는 생성자로 대체됨
	//디폴트 생성자는 지워지는 셈
	//둘을 모두 사용하려면 디폴트 생성자도 따로 작성해주어야
	
	public BClass() {}
	
}

public class ClassConstructor02 {

	public static void main(String[] args) {
		
		BClass b = new BClass(); //숨어있는 디폴트생성자 호출 
		BClass c = new BClass(20);
		BClass d = new BClass(30);
	}

}
