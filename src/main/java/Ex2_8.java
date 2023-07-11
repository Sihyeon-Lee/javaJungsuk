public class Ex2_8 {
    public static void main(String[] args) {
    // 두 변수의 값 바꿔주기

        int x = 10, y = 5; // 정수형 변수 x와 y에 각각 10과 5라는 값 지정
        System.out.println("x = " + x); // 값 바꿔주기 전 원래 값 출력
        System.out.println("y = " + y);

        int tmp = x; // 값이 없는 정수형 변수 tmp를 선언해 x값을 대입
        x = y; // x 자리엔 y값을 대입
        y = tmp; // tmp에 저장해놓았던 원래의 x의 값을 y에 대입
        System.out.println("x = " + x); // 값 바꿔준 후 바뀐 값 출력
        System.out.println("y = " + y);
    }
}

