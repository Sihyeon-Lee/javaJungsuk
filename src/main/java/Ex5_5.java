public class Ex5_5 {
    public static void main(String[] args) {
        int[] ball = new int[45]; // 배열 선언, 45자리 확보

        for (int i = 0; i < ball.length; i++) // 배열의 크기만큼 반복
            ball[i] = i+1; // 0~44번 자리에 1부터 차례대로 저장

        int tmp = 0; // 임시변수 tmp 선언
        int j = 0; // 임의의 값을 저장할 j 선언

        for (int i = 0; i < 6; i++) { // 반복문을 통해 숫자 섞어주기, 다 섞을 필요는 없으니 6번만 지정
            j = (int)(Math.random() * 45); // 임의의 숫자를 랜덤으로 생성
            tmp = ball[i]; // 빈 tmp에 ball[i]의 값을 저장
            ball[i] = ball[j]; // ball[i]의 자리엔 fhE랜덤한 숫자의 자리에 있는 값을 저장
            ball[j] = tmp; // 그 랜덤한 숫자의 자리에 있는 배열엔 tmp에 저장한 값 저장
        } // 위와 같은 방식으로 숫자를 생성하면 중복이 되지 않는다 (그냥 랜덤으로 생성만 했을시엔 중복가능성 있음)

        for (int i = 0; i < 6; i++) // 반복문을 통해 섞어준 숫자를 0~5까지 총 6개 출력
            System.out.printf("ball[%d] = %d\n", i, ball[i]);
    }
}
