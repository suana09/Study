package com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {

    /*접근제한자에 대해 이해하고 필드에 접근하지 못하게 강제화 할 수 있다.*/

    /*접근제한자*/
    /*클래스 혹은 클래스 멤버에 참조연산자로 접근할 수 있는 범위를 제한시키기 위한 키워드이다.*/
    /*1. public : 모든 패키지에 접근 허용*/
    /*2. protected : 동일 패키지 접근 허용. 단, 상속관계에 있는 경우 다른 패키지에서도 접근 가능*/
    /*3. default : 동일 패키지에만 접근 허용 (작성하지 않은 경우 default)*/
    /*4. private : 해당 클래스 내부에만 접근 가능.*/

    /*위의 4가지 접근제한자는 클래스 멤버 (필드, 메소드) 에 모두 가능하다*/
    /*하지만 클래스는 public, default 만 사용 가능하다.*/

    private String kinds;
    private int hp;

    public void setKinds(String kinds){
        this.kinds = kinds;

    }

    public void setHp(int hp) {

        if (hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String getinfo() {

        return "몬스터의 종류는 "+this.kinds+"이고, 체력은 "+this.hp+" 입니다.";
    }




    /**/
    /**/


}
