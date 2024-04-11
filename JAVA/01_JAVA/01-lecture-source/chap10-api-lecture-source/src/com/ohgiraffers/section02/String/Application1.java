package com.ohgiraffers.section02.String;

public class Application1 {
    public static void main(String[] args) {

        /*String 클래스에서 자주 사용되는 메소드에 대해 숙지하고 응용할 수 있다 */

        /*charAt(): 해당 문자열의 인덱스에 해당하는 문자를 반환한다*/
        /*인덱스는 0부터 시작하는 숫자체계를 의미하며, */
        /*인덱스를 벗어난 정수를 인자로 전달하는 경우 indexOutBoundsException*/

        String str = "apple";

        for (int i = 0; i < str.length(); i++) {
            System.out.println("charAt(" + i + ") : " + str.charAt(i));
        }

        /*compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여*/
        /*두 문자열이 같으면 0을, 인자로 전달한 문자열보다 작으면 음수를, 크면 양수를 반환*/
        /*단, 이 메소드는 대소문자를 구분하여 비교한다.*/

        /*((str1).compareTo(str2))*/
        /*if str1 > str2 then return positive number*/
        /*if str1 < str2 then return negative number*/
        /*if str1 == str2 then return 0 */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";
        String str6 = "ORACLE";


        System.out.println("compareTo() : "+(str2.compareTo(str3)));//0

        System.out.println("compareTo() : "+(str4.compareTo(str2)));//-32
        System.out.println("compareTo() : "+(str2.compareTo(str4)));//32

        System.out.println("compareTo() : "+(str2.compareTo(str5)));//-5
        System.out.println("compareTo() : "+(str5.compareTo(str2)));//5


        /*concat() : 문자열에 인자로 전달한 문자열을 합치기하여 새로운 문자열을 반환함*/
        /*원본 문자열에는 영향을 미치지 않는다.*/

        System.out.println("concat() : "+(str2.concat(str5)));
        System.out.println("str2 : " + str2);


        /*indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.*/
        /*단, 일치하는 문자가 없는 경우 -1을 반환한다.*/
        /*공백도 인덱스에 포함됨*/

        String indexOf = "java oracle";
        System.out.println("indexOf('a') : " + indexOf.indexOf('a')); //1
        System.out.println("indexOf('z') : " + indexOf.indexOf('z')); //-1


        /*lastIndexOf() : 뒤에서부터 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환*/
        /*단, 일치하는 문자가 없는 경우 -1을 반환한다.*/
        /*공백도 인덱스에 포함됨*/

        System.out.println("lastIndexOf('a') : "+indexOf.lastIndexOf('a')); //7
        System.out.println("lastIndexOf('z') : "+indexOf.lastIndexOf('z')); //-1


        /*trim() : 문자열의 앞뒤에서 공백을 제거한 문자열을 반환*/
        String trimStr = "   java   ";// 앞뒤 공백 3칸
        System.out.println("trimStr = #"+trimStr+"#");
        System.out.println("trim() = #"+trimStr.trim()+"#");
        //공백이 제거된것을 확인 가능


        /*toLowerCase() : 모든 문자를 소문자로 변환시켜 반환*/
        /*toUpperCase() : 모든 문자를 대문자로 변환시켜 반환*/
        //원본에는 영향 X

        String castStr = "javaOracle";
        System.out.println("toLowerCase() : "+castStr.toLowerCase());
        System.out.println("toUpperCase() : "+castStr.toUpperCase());

        System.out.println("castStr = " + castStr);


        /*substring() : 문자열 일부분을 잘라내어 새로운 문자열을 반환*/
        /*변수명.substring(시작할 인덱스, 끝 인덱스) > 시작할 인덱스부터 끝 인덱스의 직전글자까지 자름 */
        /*or 변수명.substring(시작할 인덱스) 시작 인덱스부터 문자열의 끝까지 자름*/
        /*원본에는 영향X*/

        String javaoracle = "javaoracle";
        System.out.println("substring(3, 7) : "+javaoracle.substring(3, 7)); //aora
        System.out.println("substring(3) : "+javaoracle.substring(3)); //aoracle


        /*replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환한다.*/
        /*원본에는 영향X*/
        System.out.println("replace() : "+javaoracle.replace("java", "python"));


        /*length() : 문자열의 길이를 정수형으로 반환한다.*/
        System.out.println("length() : "+javaoracle.length());
        System.out.println("빈 문자열의 길이도 측정가능 : "+("   ".length()));


        /*isEmpty() : 문자열의 길이가 0이면 true를, 아니면 false를 반환*/
        System.out.println("isEmpty() : "+"".isEmpty());
        System.out.println("isEmpty() : "+"    ".isEmpty());


        /*길이가 0인 문자열은 null과는 다르다.*/
        String str7 = null;
        String str8 = "";


        /**/
        /**/


    }
}
