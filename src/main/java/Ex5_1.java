import java.util.Arrays;

public class Ex5_1 {
    public static void main(String[] args) {
        /* 배열을 이해하기 위해 여러개의 변수 선언 */
        int[] iArr1 = new int[10]; // 배열은 한 번 길이를 정하면 그 길이는 변하지 않은 상수이기에 바꿀 수 없음
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 95, 80, 70, 60}; // 배열은 생성하면 자동적으로 기본값(0)으로 초기화됨
        char[] chArr = {'a', 'b', 'c', 'd'}; // 원하는 값이 있다면 선언할 때 중괄호를 사용하여 값을 지정해줘도 됨

        for (int i = 0; i < iArr1.length; i++) { // 변수이름.length로 배열의 길이를 알 수 있음
            iArr1[i] = i + 1; // 0~9 자리에 1부터 10까지의 숫자를 차례대로 저장
        }

        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random()*10) + 1; // 1~10까지의 랜덤한 숫자를 0~9자리에 저장
        }

        /* 배열에 저장한 값들을 출력하는 print 함수 실행 */

        for (int i = 0; i < iArr1.length; i++) { // 반복문을 통해 배열의 개수만큼 반복하게 만들어줌
            System.out.print(iArr1[i] + ","); // 배열을 하나씩 출력하되, 구분할 수 있게 ','를 추가해줌 (단점 : 마지막 배열 출력후에도 ','를 출력함)
        }
        System.out.println(); // 위 반복문이 끝나면 줄넘김 해줌

        // Arrays.toString 메서드를 이용해 배열의 내용을 문자열로 변환하여 출력, []로 묶여서 출력됨
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        // 위와 같은 메서드를 사용하지 않았을 때 int형은 배열의 참조변수로만 인식하기 때문에 배열의 저장값이 아닌 '타입@주소'를 출력하게 됨
        System.out.println(iArr3); // 출력형식이 맞지 않음 (출력 내용이 계속 바뀔 수 있음)
        System.out.println(chArr); // 예외로 문자형은 참조변수만 출력해도 배열 안의 저장값이 출력이 됨

    }
}
