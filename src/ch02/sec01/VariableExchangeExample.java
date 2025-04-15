package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.print("x: " + x);
        System.out.println(", y: " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.print("x: " + x);
        System.out.println(", y: " + y);

        // 확인 필요

    }
}
