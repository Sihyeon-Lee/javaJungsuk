public class Ex5_3 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95}; // 배열선언 , 초기값 지정해줌

        int max = score[0]; // max 변수 선언, 초기값으로 배열의 0번째를 지정해줌
        int min = score[0]; // min 변수 선언, 초기값으로 배열의 0번째를 똑같이 지정해줌

        for (int i = 1; i < score.length; i++) { // 반복문으로 배열의 크기만큼 반복해줌, 이미 0번째 값은 서로 비교할 필요가 없기에 i의 값은 1로 초기화
            if (score[i] > max) { // if문으로 조건을 지정해줌, 만약 max의 값보다 score 값이 크다면
                max = score[i]; // 그 큰 값은 max의 값으로 저장됨
            } else if (score[i] < min) { // 같은 방식으로 만약 min의 값보다 score 값이 작다면
                min = score[i]; // 그 작은 값은 min의 값으로 저장됨
            }
        }

        System.out.println("최대값 : " + max); // 저장된 max 출력
        System.out.println("최소값 : " + min); // 저장된 min 출력
    }
}
