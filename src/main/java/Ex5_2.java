public class Ex5_2 {
    public static void main(String[] args) {
        int sum = 0; // 합계를 구할 정수형 변수 sum 선언
        float average = 0f; // 평균을 구할 실수형 변수 average 선언

        int[] score = {100, 88, 100, 100, 90}; // 정수형 배열을 선언해 초기값을 지정해줌

        for (int i = 0; i < score.length; i++) { // 반복문을 돌려 배열의 크기만큼 반복되게함
            sum += score[i]; // 합계 변수에 점수를 더해줌
        }

        average = sum / (float)score.length; // 평균 변수의 값을 합계 나누기 점수 개수만큼 해주되 실수형으로 받기 위해 형변환시킴

        System.out.println("총합 : " + sum); // 총합계 출력
        System.out.println("평균 : " + average); // 평균 출력
    }
}