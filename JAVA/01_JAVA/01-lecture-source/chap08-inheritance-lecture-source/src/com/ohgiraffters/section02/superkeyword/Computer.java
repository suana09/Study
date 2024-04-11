package com.ohgiraffters.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Calling default constructor of class Computer...");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super();

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Calling constructor which initializes all the fields of class Computer...");

    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 부모 필드도 초기화하는 생성자 호출함...");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }


    @Override
    public String getInfomation() {
        return super.getInfomation()+
                "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem=" + operationSystem +
                '}';

    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operationSystem=" + operationSystem +
                '}';
    }


}
