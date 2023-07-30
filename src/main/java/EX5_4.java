import java.util.Arrays;

public class EX5_4 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // 배열 선언, 초기값 선언
        System.out.println(Arrays.toString(numArr)); // 초기에 배열의 값들을 순서대로 출력

        for (int i = 0; i < 100; i++) { // 반복문을 돌려 100번을 반복하게 함
            int n = (int)(Math.random() * 10); // 0~9까지의 숫자를 랜덤으로 생성해서 n에 저장
            int tmp = numArr[0]; // tmp 변수를 추가 선언하여 0번 배열값을 저장함
            numArr[0] = numArr[n]; // 0번 배열엔 랜덤으로 생성한 숫자 차례인 배열의 값을 저장함
            numArr[n] = tmp; // 랜덤으로 생성한 숫자 차례인 배열의 자리엔 tmp의 값을 저장함
        } // 이것을 100번 반복하여 완전하게 순서가 섞이게 함
        System.out.println(Arrays.toString(numArr)); // 섞인 값들을 배열의 순서대로 출력
    }
}
