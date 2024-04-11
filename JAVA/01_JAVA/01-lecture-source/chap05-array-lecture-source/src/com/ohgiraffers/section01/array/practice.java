package com.ohgiraffers.section01.array;

public class practice {
    public static void main(String[] args) {


        //App1,App2

        //int 타입의 길이가 10인 배열을 선언하고 .length, .hashCode 를 활용하여 길이와 주소값을 출력해본다
        //for 구문을 활용하여 10 길이의 배열 oneToTen에 1~10까지의 숫자를 담아본다
        int[] oneToTen = new int[10];
        System.out.println("oneToTen.length: "+ oneToTen.length);
        System.out.println("oneToTen.hashCode(): " + oneToTen.hashCode());
        for(int i=0, j=0;i<oneToTen.length;i++){
            oneToTen[i] = j = j+1;
            System.out.println(oneToTen[i]);
        }

        System.out.println("==========================");

        int[] arr2 = new int[10];

        for(int i=0,j=1;i<arr2.length;i++){
            arr2[i] = j;
            j++;
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        System.out.println("==========================");

        //배열도 변수와 똑같이 활용가능!
        //oneToTen 배열을 for구문을 활용하여 변수 sum에 담아 1~10까지의 합을 구해보기
        int sum = 0;
        for(int i=0; i<oneToTen.length;i++){
            sum += oneToTen[i];
        }
        System.out.println(sum);

        //App4.
        System.out.println("==========================");
        //뉴진스 멤버 5명의 *소수점을 무시한* 키를 배열에 대입하고 평균 구해보기
        int[] njheight = new int[]{170, 169, 165, 164, 161}; //변수(대열) 선언 및 대입
        int sum2 = 0;
        int avg2 = 0;
        for(int i=0;i<njheight.length;i++){
            sum2 += njheight[i];
        }
        avg2 = sum2/ njheight.length;
        System.out.println("뉴진스 멤버들의 키의 평균은 약"+avg2+"cm 이다.");

        //App5.
        System.out.println("==========================");
        //체스말+색을 랜덤으로 출력해보기

        //배열 선언 및 초기화
        String[] chessc = new String[] {"black", "white"};
        String[] chessp = new String[] {"pawn", "knight", "bishop","king","queen","rook"};

        java.util.Random rn = new java.util.Random();

        int cindex = (int)(Math.random()*chessc.length);
        int pindex = (int)(Math.random()*chessp.length);

        System.out.println(chessc[cindex]+", "+chessp[pindex]);






    }
}
