
    public class anonymous2 {

        public static void main(String[] args) {

            // 익명 구현 객체 활용
            UseAnonyInterfaceClass uic = new UseAnonyInterfaceClass();
            uic.rc.turnOn();
            uic.rc.turnOff();
            System.out.println("-------------------------------");
            UseAnonyInterfaceClass2 uic2 = new UseAnonyInterfaceClass2();
            uic2.method();
            System.out.println("-------------------------------");

            UseAnonyInterfaceClass3 uic3 = new UseAnonyInterfaceClass3();
            uic3.method(new RemoteControl() {

                @Override
                public void turnOn() {
                    System.out.println("스마트폰을 켭니다!");
                }

                @Override
                public void turnOff() {
                    System.out.println("스마트폰을 끕니다!");
                }
            });
        }

    }

    // 인터페이스 타입의 필드를 선언하고, 구현 객체를 초기값으로 대입
    interface RemoteControl{
        public abstract void turnOn(); // 추상메서드 선언
        void turnOff(); // public abstract 생략 가능
    }

    class TV implements RemoteControl{

        @Override
        public void turnOn() {

        }

        @Override
        public void turnOff() {

        }

    }

    class UseImplementsClass{

        RemoteControl rc = new TV(); // 멤버변수에 구현 객체를 대입
        public void method() {
            RemoteControl localRc = new TV(); // 로컬변수에 구현 객체를 대입
        }
    }

// => 구현 클래스를 선언하고, new 연산자를 이용해서 구현 객체를 생성한 후
//    인터페이스 타입의 필드 또는 로컬 변수에 대입하는 것이 일반적인 경우
// => 재사용성이 높음
// => 그러나, 구현 클래스가 재사용되지 않고, 특정 위치에서 사용할 경우라면 구현 클래스를
//    명시적으로 선언하는 것은 귀찮은 작업이 되며 이럴 경우 "익명 구현 객체"를 생성

    /*
     *  익명 구현 객체 생성 방법
     *  인터페이스 [필드|변수] = new 인터페이스(){
     *       // 인터페이스에 선언된 추상 메서드의 실체 메서드 선언
     *       // 필드(멤버변수)
     *       // 메서드
     *
     *    };
     */

    // 익명 구현 객체를 사용한 클래스의 정의
// (멤버변수(rc)를 선언할 때 초기값으로 익명 구현 객체를 사용)
    class UseAnonyInterfaceClass{
        RemoteControl rc = new RemoteControl() {

            @Override
            public void turnOn() {
                System.out.println("TV를 켭니다!");

            }

            @Override
            public void turnOff() {
                System.out.println("TV를 끕니다!");

            }
        };
    }

    // 익명 구현 객체를 사용한 클래스 정의
// (멤버 메서드 내에서 로컬변수를 선언할 때 초기값으로 익명 구현 객체 사용)
    class UseAnonyInterfaceClass2{
        public void method() {
            RemoteControl localVar = new RemoteControl() {

                @Override
                public void turnOn() {
                    System.out.println("라디오를 켭니다!");
                }

                @Override
                public void turnOff() {
                    System.out.println("라디오를 끕니다!");
                }
            };
            localVar.turnOff();
            localVar.turnOn();
        }
    }

// 익명 구현 객체를 사용한 클래스 정의
// (메서드의 매개변수가 부모타입일 경우 메서드를 호출하는 코드에서 익명 구현 객체를 생성해 매개값으로 대입)

    class UseAnonyInterfaceClass3 {
        void method(RemoteControl rc) {
            rc.turnOn();
            rc.turnOff();
        }
    }


