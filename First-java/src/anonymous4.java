public class anonymous4 {
    public static void main(String[] args) {

        /*
         *  익명 객체의 로컬 변수 사용
         *  - 메서드의 매개 변수나 로컬 변수를 익명 객체 내부에서 사용할 때 제한이 있음.
         *  - 익명 객체는 메서드 실행이 종료되면 없어지는 것이 일반적이지만
         *    메서드가 종료되어도 계속 실행 상태로 존재할 수 있음
         *    (ex. 익명 쓰레드 객체 사용)
         *  - 메서드의 매개 변수나 로컬 변수를 익명 객체 내부에서 사용할 때 매개 변수나
         *    로컬 변수는 메서드 실행이 끝나면 스택 메모리에서 사라지기 때문에
         *    익명 객체에서 지속적으로 사용할 수 없다!
         *  - 이런 문제를 해결하기 위해 자바는 컴파일 시 익명 객체에서 사용하는 매개 변수나
         *    로컬 변수의 값을 익명 객체 내부에 복사해두고 사용한다.
         *  - 매개 변수나 로컬 변수가 수정되어 값이 변경되면 수정된 값과 익명 객체에
         *    복사해 둔 값이 달라지게 되어 매개 변수나 로컬 변수를 final로 선언할 것을 요구
         *  - 자바 7 이전까지는 final 키워드 없이 선언된 매개 변수나 로컬 변수를 익명 객체에서
         *    사용 시 컴파일 에러가 발생 했었음!
         *    (자바 8부터 final 키워드 없이 선언된 매개 변수나 로컬 변수 사용 시 에러 발생하지 않음!)
         *  - final 선언을 하지 않아도 값이 수정될 수 없도록 final 의 특성을 부여하기 때문
         *
         */
        AnonymousClass ac = new AnonymousClass();
        ac.method(0, 5);


    }

}

interface Calculatable{

    public int sum(); // 추상메서드

}

class AnonymousClass{
    private int num; // 인스턴스 멤버 변수

    public void method(final int arg1, int arg2) {
        // 매개변수 arg1, arg2
        final int num1 = 0 ; // 로컬 변수
        int num2 = 0; // 로컬 변수

        num = 10; // 인스턴스 멤버 변수의 값은 변경 가능

//    arg1 = 20;    final이 선언된 매개 변수의 값은 변경 불가!
//    arg2 = 20;    final이 선언되지 않아 변경 가능
        // => 만약, 이 매개 변수를 익명 객체에서 사용하려고 할 경우
        // 위의 문장은 컴파일 에러를 발생시키는 문장이 된다!
        // 주석처리를 통해 값의 변경이 없음을 확인시켜줘야 익명 객체에서
        // 해당 매개 변수를 사용할 수 있음!
//    num1 = 30;   final이 선언된 매개 변수의 값은 변경 불가!
//    num2 = 30;   final이 선언되지 않아 변경 가능
        // => 만약, 이 매개 변수를 익명 객체에서 사용하려고 할 경우
        // 위의 문장은 컴파일 에러를 발생시키는 문장이 된다!
        // 주석처리를 통해 값의 변경이 없음을 확인시켜줘야 익명 객체에서
        // 해당 매개 변수를 사용할 수 있음!

//    method() 내부에 익명 구현 객체를 생성
        // 위에서 정의한 Calculatable 인터페이스를 활용
        Calculatable cal = new Calculatable() {

            @Override
            public int sum() {
                int result = num+ arg1+ arg2 + num2;
                return result;
            }
            // => 익명 객체에서 매개 변수값 또는 로컬 변수를 사용 시 값의 변경이 있으면 컴파일 에러가 발생한다.
        };
        System.out.println(cal.sum());

    } // method() 메서드 끝
}
