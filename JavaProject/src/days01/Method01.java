package days01;


class Animal{
	private String name;
	private int age;
	
	//멤버 메소드는 특별한 경우를 제외하면 static을 사용하지 않음
	//현재 메소드를 호출하는 호출객체 (a1, a2 등..) 를 별도의 매개변수로 받지 않아도 전달되어져 있음
	public void prn() {
		
		//멤버메소드
		//호출 객체는 묵시적으로 this 로 전달됨.
		System.out.println("저의 이름은 "+this.name+", 나이는"+this.age+"살 입니다.");
		
		//멤버메소드는 같은 클래스의 private 멤버변수에 자유롭게 접근 가능
	}

	public void input(String name, int age) {
		this.name = name;
		this.age = age;
	}


	
	//멤버변수, 멤버메소드들은 필요한 만큼 자유롭게 정의하여 사용할 수 있다.
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public String getName() {
//		return this.name;
//	}
//	public int getAge() {
//		return this.age;
//	}
	
	//위 네개의 메소드들을 getter/setter라고 부름
	//보통 멤버변수의 값을 저장하거나 얻기 위한 메소드인데,
	//그 목적만 있다면 메소드이름이 반드시 위와 같지 않아도 무방함
	//그러나 getter와 setter는 개발자가 호출하여 사용하기도 하나
	//시스템 또는 컴파일러가 사용하기도 하기 때문에 약속된 이름 (get변수명, set변수명) 을 사용하는 것이 일반적	
	
	//직접 입력하여 생성하면 오타가 있을 수 있으므로 메뉴를 통해 getter/setter를 생성할 수 있다.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class Method01 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
//		a1.name = "댕댕이";
//		a1.age = 10;
//		a2.name = "냥냥이";
//		a2.age = 6;
		
		a1.input("댕댕이", 10);
		a2.input("냥냥이", 6);
		
		//System.out.println("저의 이름은"+a1.name+", 나이는 "+a1.age+"살 입니다.");
		
		prn(a1);
		a1.prn();
		//멤버메소드의 장점: private 변수에 다른 클래스에서도 제한없이 접근 가능
		
		//System.out.println("저의 이름은"+a2.name+", 나이는 "+a2.age+"살 입니다.");
		
		prn(a2); //객체를 매개변수로 받아 메소드를 호출
		a2.prn(); //직접 Animal 클래스의 객체 a2로 Animal 클래스의 멤버메소드 호출
		
	}

	private static void prn(Animal a1) {
		//System.out.println("저의 이름은"+a1.name+", 나이는 "+a1.age+"살 입니다.");
		System.out.println("저의 이름은 "+a1.getName()+", 나이는 "+a1.getAge()+"살 입니다.");
		
	}

}
