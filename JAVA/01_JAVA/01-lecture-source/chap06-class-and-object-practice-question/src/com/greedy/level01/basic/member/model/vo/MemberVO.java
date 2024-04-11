package com.greedy.level01.basic.member.model.vo;

public class MemberVO {

    private String id;
    private String pwd;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;


    public void setInfo(String id, String name, String pwd, int age, char gender, String phone, String email){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    public String getInfo(){
        return ("id : "+id+
                " pwd : "+pwd+
                " name : "+name+
                " age : "+age+
                " gender : "+gender+
                " phone : "+phone+
                " email : "+email);
    }


    //Constructor
    
    public MemberVO(){}
    public MemberVO(String id, String pwd, String name, int age, char gender, String phone, String email) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    //toString
    public String toString() {
        return "MemberVO{" +
                "id :'" + id + '\'' +
                ", pwd : '" + pwd + '\'' +
                ", name : '" + name + '\'' +
                ", age : " + age +
                ", gender : " + gender +
                ", phone : '" + phone + '\'' +
                ", email : '" + email + '\'' +
                '}';
    }
}
