package test;

// 모든 변수는 class 안으로 들어가야함.
// int x = 100; 전역변수 없음


public class VariableTest {
    public static void main(String[] args) {
        // 이 부품은 독립적으로 실행할 수 있는 부품이 됨.
        // 함수인데, 만약에 함수가 여러개인 경우 무조건 main()을 호출

        // 기본형 4가지: 정수, 실수, 문자1, 논리
        // 정수: byte(1), short(2), int(4), long(8)
        byte age = 127; // 변수는 소문자로 시작
        short year = 2025;
        int hit = 2100000000;
        long money = 2200000000L;

        // 실수 : float(소수점 7자리/ 4바이트), double(소수점 15자리 / 8바이트)
        float w = 70.5f;
        double h = 170.000000000000001;

        // 문자1: char
        char gender = 'M'; // ' 홑따옴표

        // 논리형: boolean
        boolean flag = true; // true/false 만 사용 가능

        System.out.println("flag = " + flag);
        System.out.println("age = " + age + " 세야");
        // + 연산자가 하나라도 문자열이면 결과는 String(결합연산자)로 처리함
        System.out.print("gender = " + gender);
        String name = "이재성"; // 이중 따옴표 ""
        String plan = """
                뚜따따따따따따뚜따뚜따뚜따뚜따ㅜ따ㅜ따뚜ㅏ뚜따ㅜ따ㅜ따뚜ㅏㄸ
                나는
                바보
                입니다.
                """;
        System.out.println();
        System.out.println("내 계획은 " + plan);
        System.out.printf("내 이름은 %s이야!", name);
        System.out.printf("내 몸무게는 %.2f, 내 키는 %10.3f이야!", w, h);
    }
}
