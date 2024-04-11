package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("test.dat"));

            String s;
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }

            /*캐치블럭은 상위타입부터 적어줘야 함*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                /*NullPointerException*/
                /*null을 참조하는 상태에서 참조 연산자를 사용시 발생하는 예외*/
                if (in != null) {
                    in.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
