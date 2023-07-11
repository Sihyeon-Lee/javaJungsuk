import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        int score = 0; // 점수를 저장하기 위한 변수 정수형 타입으로 선언
        char grade = ' '; // 학점을 저장하기 위한 변수, 문자형 타입으로 선언, 공백으로 초기화.

        System.out.print("점수를 입력하세요.> ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 스캐너 객체를 이용하여 사용자에게 점수를 입력받아 score에 저장함.

        if(score >= 90) {          // if 함수로 묶어 점수마다 해당되는 학점을 부여함.
            grade = 'A';
        } else if (score >= 80) {  // eles if문으로 위에 내용이 아니면 else if문의 내용이 실행되게 함.
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {                   // else로 위에 조건들에 해당되지 않는 내용은 D로 출력되게 함.
            grade = 'D';
        }

        System.out.println("당신의 학점은 " + grade + "입니다.");

    }
}
