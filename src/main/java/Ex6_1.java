/* 한 파일에 여러 클래스 작성하기 */
class Ex6_1 {
    public static void main(String[] args) {
        Tv t; // 클래스명 변수명, Tv 인스턴스를 참조하기 위한 변수를 t로 선언
        t = new Tv(); // Tv 인스턴스를 생성
        t.channel = 7; // Tv 인스턴스의 멤버변수 channel을 선언, 값을 7로 정해줌
        t.channelDown(); // Tv 인스턴스의 메서드 channelDown을 호출
        System.out.println("현재 채널은 " + t.channel + "입니다."); // Tv 인스턴스의 멤버변수 channel 값 출력
    }
}

class Tv {
    // Tv의 속성 (멤버변수)
    String color; // Tv의 색상
    boolean power; // Tv의 전원상태
    int channel; // Tv의 채널

    // Tv의 기능 (메서드)
    void power() {power = !power;} // Tv를 켜거나 끄는 기능을 하는 메서드
    void channelUp() {++channel;} // Tv의 채널을 올리는 기능을 하는 메서드
    void channelDown() {--channel;} // Tv의 채널을 내리는 기능을 하는 메서드

    /* 인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야함 !! */
}
