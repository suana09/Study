package com.ohgiraffers.section03.copy;

public class Application1 {
    public static void main(String[] args) {
        /*배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다.*/

        /*배열의 복사에는 두 종류가 있다*/
        /*1. 얕은 복사: stack의 주소값만 복사*/
        /*2. 깊은 복사: heap의 배열의 저장한 값 복사 */

        /* 얕은 복사는 stack에 저장되어 있는 배열의 주소값만 복사*/
        /*따라서 두 개의 레퍼런스 변수는 동일한 배열의 주소값을 가짐*/
        /*하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경) 을 하게 되면*/
        /*다른 레퍼런스 변수로 배열에 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어있음 */
        
        int[] originArr = {1,2,3,4,5};
        
        int[] copy = originArr;       //얕은복사, stack의 주소값만 복사한 것

        System.out.println("originArr.hashCode() = " + originArr.hashCode()); //originArr.hashCode = 1283928880
        System.out.println("copy.hashCode() = " + copy.hashCode()); //copy.hashCode() = 1283928880

        for(int i = 0;i<originArr.length;i++){
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for(int i = 0;i<copy.length;i++){
            System.out.print(copy[i] + " ");
        }
        System.out.println();

        copy[0] = 99;

        for(int i = 0;i<originArr.length;i++){
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        for(int i = 0;i<copy.length;i++){
            System.out.print(copy[i] + " ");
        }

        /**/
        /**/
    }
}
