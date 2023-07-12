public class Ex4_7 {
    public static void main(String[] args) {
        int num = 0; // 정수형 변수 num 선언 (난수로 표현될 변수)

        for (int i = 1; i <= 5; i++) { // for문을 돌려 5번의 임의의 값을 만들어줌
            num = (int) (Math.random() * 6) + 1; // 구하는 값은 1 이상의 값이기 때문에 0은 포함하지 않기 위해 +1을 해줌
            System.out.println(num); // 만들어진 난수를 출력해줌
        }
    }
}
