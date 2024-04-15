package days01;

class Scores{
	int kor;
	int mat;
	int eng;
	int tot;
	double ave;
}

//클래스(Class)
//프로그램으로 처리하고자 하는 대상의 요소들을 자료화하여 하나의 자료형으로 정의한 사용자 정의 자료형
//필요에 의해 기본자료형 (int, double, char 등...) 외에 그들을 그룹화하여 새롭게 정의한 자료형
//한 개 이상의 자료, 하나이상의 자료형을 저장할 수 있는 복합 자료형

//클래스는 프로그램 단위로도 사용됩니다
//클래스=자바의 프로그램 단위
//하나의 파일 안에 여러개의 클래스를 정의하여 사용 가능
//다만 여러개의 클래스 중 하나는 파일이름과 반드시 같아야 하며, public이어야 하고,
//실행여부에 따라 public void main(){}을 포함해야 함

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scores std1 = new Scores(); //std1: 참조변수, new Scores(): 인스턴스, std1 + new Scores() : 객체
		
		String string = "Korea";

		System.out.println("겁나쉬운 자바프로그램");
		
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		int[] tot = new int[5];
		double[] ave = new double[5];
		
		
		
	}

}
