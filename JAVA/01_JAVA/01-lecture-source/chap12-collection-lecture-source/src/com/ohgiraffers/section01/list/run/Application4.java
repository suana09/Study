package com.ohgiraffers.section01.list.run;


import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {
        /*Stack 에 대해 이해하고 사용할 수 있다*/

        /*Stack 메모리 구조는 선행 메모리 공간에 데이터를 저장하며  .. 메미로가뭐지?*/
        /*후입선출 (LIFO, Last input first out) 방식의 자료 구조*/

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println("integerStack = "+integerStack);



        /*인덱스가 1부터 시작*/
        System.out.println("integerStack.search(5) = " + integerStack.search(5)); //1

        System.out.println("===========peak");

        /*peek(): 해당 스택의 가장 마지막에 있는 (상단에 있는) 요소 반환*/
        System.out.println("integerStack.peek() = " + integerStack.peek());
        System.out.println("integerStack = " + integerStack);
        System.out.println("integerStack.peek() = " + integerStack.peek());
        System.out.println("integerStack = " + integerStack);

        System.out.println("===========pop");

        /*pop() : 해당 스택의 가장 마지막에 있는 요소를 반환 후 제거*/
        //원본에 영향을 미침!
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack = " + integerStack);

        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());

        //System.out.println("integerStack.pop() = " + integerStack.pop()); //EmptyStack
        
    }

}
