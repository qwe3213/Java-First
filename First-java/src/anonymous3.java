public class anonymous3 {
    public static void main(String[] args) {

        Window w = new Window();// 버튼 2개를 가지는 Window 인스턴스 생성
        w.button1.touch();
        w.button2.touch();
    }

}

// 버튼의 클릭 이벤트 처리
// Button 클래스 정의
class Button{

    static interface onClickListener{
        // 중첩 인터페이스 선언
        void onClick(); // 추상 메서드 선언


    }

    onClickListener listener; // 인터페이스 타입 변수 선언

    public void setOnclickListener(onClickListener listener) {

        this.listener = listener;

    }
    // => 외부에서 구현 객체를 받아 필드에 대입

    public void touch() {
        listener.onClick(); // 현재 설정되어 있는 구현 객체의 onClick() 메서드 호출
    }

    // => 버튼 이벤트가 발생했을떄(touch() 메서드가 호출되었을때 )
    //    인터페이스를 통해 구현 객체의 메서드를 호출(listnenr.onClick())

}

// window 클래스를 button 2개를 가지고 있는 창이라고 가정
class Window{
    // 버튼 2개를 생성
    Button button1 = new Button();
    Button button2 = new Button();

    // 필드 초기값으로 대입 (익명 객체를 활용)
    Button.onClickListener listener = new Button.onClickListener() {

        @Override
        public void onClick() {
            System.out.println("전화를 겁니다!");
        }

    };

    public Window() {
        button1.setOnclickListener(listener);
        // => onClick() 메서드가 "전화를 겁니다!" 가 오버라이딩 되어 있는 익명 객체를
        //    매개변수로 전달
        button2.setOnclickListener(new Button.onClickListener() {

            @Override
            public void onClick() {
                System.out.println("메세지를 보냅니다!");
            }

        });
    }

}
