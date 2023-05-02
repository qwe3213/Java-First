public class anonymous {


        public static void main(String[] args) {

            /*
             * 익명(anonymous) 객체 - 클래스 이름이 없는 객체 - 클래스 선언과 객체의 생성을 동시에 하기 때문에 단 한번 사용될 수 있고 오직 하나의 객체만을 생성할 수
             * 있는 일회용 클래스 - 이름이 없기 때문에 생성자도 가질 수 없다. - 익명 객체를 만들기 위해서는 어떤 클래스를 상속하거나 인터페이스를 구현해야함 - 부모클래스의
             * 이름이나 구현하고자 하는 인터페이스의 이름을 사용해서 정의하므로 - 한번에 하나의 클래스로 상속받는 동시에 인터페이스를 구현하거나 하나 이사으이 - 인터페이스를 구현할
             * 수 없다. - 단 하나의 클래스를 상속받거나 단 하나의 인터페이스를 구현할 수 있음.
             *
             * < 익명 객체 문법 > new 슈퍼클래스이름(){ // 멤버 선언 };
             *
             * 또는
             *
             * new 구현인터페이스이름(){ // 멤버 선언 };
             */

            NormalParent pt = new NormalChild();
            pt.wake(); // 오버라이딩 된 NormalChild()의 wake() 메서드 호출
//      pt.work(); // 참조영역 축소로 인해 NormalChild () 의 메서드 접근 불가

            NormalInterface ni = new NormalChild2();
            ni.run();

            NormalParent pt2 = new NormalChild3();
            pt2.wake();
//      pt2.run();
            // =>

            NormalChild3 nc3 = new NormalChild3();
            nc3.wake();
            nc3.run();

            UseAnonyClass uac = new UseAnonyClass();
            uac.p.wake();
//      System.out.println(uac.p.childvar); 접근불가 class 내에서만 사용 가능
//      uac.p.childMethod(); 접근 불가 class 내에서만 사용 가능

            UseAnonyClass2 uac2 = new UseAnonyClass2();
            uac.method();

            UseAnonyClass3 uac3= new UseAnonyClass3();
            uac3.method3(new NormalParent() {
                public void study() {
                    System.out.println("공부합니다!");

                }

                @Override
                public void wake() {
                    System.out.println("4시에 일어납니다!");
                    study();
                }
            });
            // => 매개변수의 인자값으로 익명 객체 대입
            // => 익명 자식 객체는 NormalParent를 상속 받으므로 NormalParent
            //    타입의 매개변수값으로 전달 가능!

        }

    }


    // 익명 객체를 사용하지 않는 일반적인 상속 관계
    class NormalParent {
        public void wake() {
            System.out.println("7시에 일어납니다!");

        }
        public void work() {
            System.out.println("출근합니다!");
        }
    }


    // NormalParent를 상속 받는 NormalChild 클래스 정의
    class NormalChild extends NormalParent {
        public void work() {
            System.out.println("출근합니다!");
        }

        @Override
        public void wake() {
            System.out.println("6시에 일어납니다!");
            work();
        }

    }

// 익명 객체를 사용하지 않은 인터페이스 구현 관계


    interface NormalInterface {
        public abstract void run();
    }

// NormalInterface를 구현하는 NormalChild2 클래스 정의


    class NormalChild2 implements NormalInterface {

        @Override
        public void run() {

            System.out.println("출근전 런닝을 합니다!");
        }



    }

// NormalParent를 상속받는 동시에 normalInterface를 구현하는 NormalChild3 클래스 정의

    class NormalChild3 extends NormalParent implements NormalInterface{


        @Override
        public void run() {
            System.out.println("출근합니다");

        }

        @Override
        public void wake() {
            System.out.println("5시에 일어납니다!");
            work();
        }

    }
    //=============================================================================
// 상속 관계에 있는 서브클래스를 활용하는 클래스의 정의
    class UseExtendsClass{
        NormalParent p = new NormalChild();
        public void method() {
            NormalParent localP = new NormalChild(); // 로컬변수에 자식 객체를 대입
        }
    }
// => 자식 클래스를 명시적으로 선언하여 이미 선언된 자식 클래스로 간단히 객체를 생성하여 사용할 수 있음
// => 재사용성이 높음.
// => 그러나, 자식 클래스가 재사용되지 않고, 특정 위치에서 사용할 경우라면
//    자식 클래스를 명시적으로 선언하는 것은 귀찮은 작업!
//    이럴 경우 "익명 자식 객체" 를 생성

// 익명 자식 객체 생성 방법
// 부모클래스 [필드|변수] = new 부모클래스(매개값,...){
//  필드(멤버변수)
//  메서드
//};


//=============================================================================
// 익명 객체를 사용한 클래스의 정의
// 1. 멤버변수를 선언할 때 초기값으로 익명 클래스 사용
// 2. 멤버메서드 내에서 로컬변수를 선언할 때 초기화값으로 익명 클래스 사용
// 3. 매개변수의 매개변수값으로 익명 클래스 사용

    // 1. 멤버변수(p)를 선언할 때 초기값으로 익명 클래스 사용
    class UseAnonyClass {
        NormalParent p = new NormalParent() { // 일회성으로 사용할 익명 객체 생성
            int childVar = 10;
            public void childMethod() {
                System.out.println("익명객체에서 정의된 메서드!");
            }
            @Override
            public void wake() {
                // 부모클래스의 메서드
                System.out.println("부모 클래스로부터 오버라이딩 된 메서드");
            }

        };

        public void method() {
//      p.childvar = 20; // 접근불가
//      p.childMethod(); // 접근불가
            p.wake();
        }
        // => 익명 자식 객체에 새롭게 정의된 필드(멤버변수) 와 메서드는 익명 자식 객체
        //    내부에서만 사용가능, 외부에서는 접근할 수 없음
        // => 익명 자식 객체는 부모 타입 변수에 대입되므로 부모 타입에 선언된 것 만 사용할 수 있다.

    }

    //================================================================================================
// 2. 멤버메서드 내에서 로컬변수를 선언할 때 초기값으로 익명 클래스 사용
    class UseAnonyClass2{
        public void method() {
            NormalParent localP = new NormalParent() {
                int childVar = 10;
                public void childNormal() {
                    System.out.println("익명 객체에서 정의된 메서드");

                }
                @Override
                public void wake() {
                    System.out.println("로컬변수 loclP에 선언된 익명객체의 오버라이딩 된 wake() 메서드");
                }

            };
            localP.wake(); // localP의 wake() 메서드 호출
            // => 로컬 변수는 method()가 동작할 때만 존재하는 변수
            // => 따라서 localP의 wake() 메서드는 method()가 종료되기 전에 호출한다.
        }
//     localP.wake(); // 로컬변수는 method() {} 블럭이 끝나면 소멸됨!
    }


//=====================================================================================ㅜ

    // 3. 매개변수의 매개변수값으로 익명 클래스 사용
    class UseAnonyClass3{

        public void method1(NormalParent parent) {

        }
//   public NormalParent method2(NormalParent parent) {
//     return parent;
//   }

        // => 리턴 타입을 normalParent 로 설정하여 임시 객체를 리턴받음

        public void method2() {
            //     NormalParent p = method(익명객체);
            // => 리턴받은 임시 객체를 NormalParent 타입 참조변수에 저장

            method1(new NormalParent(){
                int childVar;
                void childMethod(){}
                @Override
                public void wake() {
                    System.out.println("매개변수로 사용된 익명객체의 오버라이딩 된 wake() 메서드");
                }

            });
        }

        public void method3(NormalParent parent) {
            parent.wake();
        }

    }

