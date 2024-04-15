package days01;


//생성자(Constructor)
//클래스의 객체가 생성될때, 멤버필드 초기화 등의 목적으로 사용되는 메소드
//new 에 각각의 객체가 생성될 때, 서로 다른 메모리를 할당해서 서로 겹치지 않게 하는 기능도 포함됩니다

//생성자의 특징
//1. 멤버메소드 입니다(특별한 멤버메소드 - 처음 객체생성시만 호출, 중간에 호출되지 않음)
//2. 클래스의 이름과 동일한 이름을 가짐
//3. 리턴값이 없는 메소드

class Aclass{
	private int age;

	// 1. 생성자는 별도로 정의하지 않아서 디폴트 생성자(매개변수가 없는)가 존재합니다
	// 2. 컴파일러는 클래스안에 생성자 정의 내역이 없다면, 자동을 디폴트 생서자를 만듭니다.
	
	// 생성자가 하는 일 : 메모리를 확보하고 확보된 메모리 주소를 생성자 보이지 않는 메서드의 리턴값으로 반환하는 일
	// 생성자 본연의 일이외에 다른명령을 같이 실행하고자 한다면 숨어있는 생성자를 꺼내서 따로 정의합니다.
	
	Aclass() {
		age = 100;
		//매개변수가 없는 생성자 + 멤버변수 age를 100으로 초기화도 함께
	}
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	
}


public class ClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aclass a1 = new Aclass(); //Aclass() 생성자 호출
		
	}

}
