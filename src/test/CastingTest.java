package test;

public class CastingTest {
    public static void main(String[] args) {
        byte age = 127;
        int age2 = age;
        System.out.println("age2 = " + age2);

        // byte age3 = age2;
        byte age3 = (byte) age2;
        System.out.println("age3 = " + age3);

        // <input name = "age" value = "100"> ----> String으로 인식
        String data = "100"; // 입력 데이터는 String으로 인식함.
        // int num = data; // 기본형 <---- 기본형 X
        // 부품을 이용해주어야함. (Integer.parseInt())
        int num = Integer.parseInt(data); // 기본형 <---- 기본형 X
        System.out.println("num = " + (num+1));

        String data2 = "11.11";
        double num2 = Double.parseDouble(data2);
        System.out.println("num2 = " + num2);

        // 숫자를 문자열로 바꾸고 싶은 경우(=로 안됨)
        // 문자열에 들어있는 것을 기본형 변수에 바로 넣을 수 없음
        // 기본형 변수에 들어있는 것을 문자열 변수에 바로 넣을 수 없음
        // 부품을 써야함!!!
        String data3 = String.valueOf(num2);


    }
}
