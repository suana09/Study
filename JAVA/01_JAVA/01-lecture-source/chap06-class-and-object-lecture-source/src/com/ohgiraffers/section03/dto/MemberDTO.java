package com.ohgiraffers.section03.dto;

public class MemberDTO {

    private int number; //회원번호
    private String name; //회원이름
    private int age; //나이
    private char gender; //성별
    private double height; //키
    private boolean isActive; //활성화여부

    /*
     *  설정자(setter)/접근자(getter)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다.
     *  설정자(setter) 작성 규칙
     *  : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
     *    호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
     *  [표현식]
     *  public void set필드명(매개변수) {
     *      필드 = 매개변수;
     *  }
     *  [작성예시]
     *  public void setName(String name) {
     *      this.name = name;
     *  }
     * */

    /*
     *  접근자(getter) 작성 규칙
     *  : 필드의 값을 반환받을 목적의 메소드 집함을 의미한다.
     *    각 접근자는 하나의 필드에만 접근하도록 한다.
     *    필드에 접근해서 기록된 값을 return을 이용하여 반환하며, 이 때 반환타입은 반환하려는 값의 자료형과 일치시킨다.
     *  [표현식]
     *  public 반환형 get필드명() {
     *      return 반환값;
     *  }
     *  [작성예시]
     *  public void getName() {
     *      return this.name;
     *  }
     *
     * 단, boolean type의 필드의 접근자 (getter)의 경우 이름을 get(필드이름)이 아닌 is(필드이름) 으로 하는것이 관례
     *
     *
     * */

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", isActive=" + isActive +
                '}';
    }
}
