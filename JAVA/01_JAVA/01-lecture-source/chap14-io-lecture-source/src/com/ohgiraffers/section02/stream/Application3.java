package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

    public static void main(String[] args) {

        /*FileOutputStream*/
        /*프로그램 데이터를 파일로 내보내기 위한 용도의 스트림*/
        /*1바이트 단위로 데이터를 처리한다*/

        /*write()*/

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("src/com/ohgiraffers/section02/stream/testOutputStream.txt");

            fos.write(97);

            byte[] bar = new byte[]{98, 99, 100, 101, 102, 10};
            fos.write(bar);
            fos.write(bar, 1, 3);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
            /*예외에 상관없이 무조건 파일을 close() , 닫아줌*/
            /*리소스가 null이 아닌 경우에만 close() 실행하여 파일 반납*/

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        /**/
        /**/
        /**/
        /**/
        /**/
        /**/
        /**/




    }

}
