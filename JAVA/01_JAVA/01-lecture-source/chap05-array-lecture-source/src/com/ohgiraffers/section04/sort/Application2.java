package com.ohgiraffers.section04.sort;

public class Application2 {
    public static void main(String[] args) {
        /*순차정렬에 대해 이해하고 활용할 수 있다.*/

        /*순차정렬이란 정렬 알고리즘에서 가장 간단하고 기본이 되는 알고리즘으로*/
        /*배열의 처음과 끝을 탐색하며 순차대로 정렬하는 가장 기초적인 정렬 알고리즘이다.*/

        int[] iarr = {2,5,4,6,1,3};



/*        for(int i=1; i<iarr.length;i++){
            for(int j=0;j<iarr.length;j++){
                boolean b = (iarr[i]<iarr[j]);
                System.out.println("iarr["+i+"]"+"<"+"iarr["+j+"] ? : "+b);
                if(iarr[i]<iarr[j]){
                    int temp;
                    temp=iarr[i];
                    iarr[i]=iarr[j];
                    iarr[j]=temp;
                }
            }
        }
        for(int i : iarr){
            System.out.print(i+" ");
        }*/



        for(int i=1;i<iarr.length;i++){
            for(int j=0;j<i;j++){
                boolean b = (iarr[i]<iarr[j]);
                System.out.println("iarr["+i+"]"+"<"+"iarr["+j+"] ? : "+b);
                if(iarr[i]<iarr[j]){
                    int temp;
                    temp=iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }



        /**/
        /**/
        /**/
    }
}
