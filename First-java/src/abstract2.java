public class abstract2 {

    public static void main(String[] args) {
        /*
         *  추상메서드(Abstract Method)
         *  - 메서드 바디(= 구현,{})가 존재하지 않는 메서드 = 미완성 메서드
         *   => 실행 코드가 없으므로 실행될 수 없는 메서드
         *   - 메서드 선언부 접근제한자 뒤에 abstract 키워드를 붙여서 선언
         *   => 바디가 없으므로 메서드 마지막을 세미클론으로 마무리ㅏ
         *   - 메서드 실행 코드가 없으므로 외부에서 호출되면 안되는 메서드
         *
         *   < 추상메서드 정의 기본 문법 >
         *   [접근제한자] abstract 리턴타입 메서드명([매개변수...]);
         *   --------------------------------------------------
         *   추상클래스
         *   - 인스턴스를 생성할 수 없는 미완성 클래스
         *    => 내부에 추상메서드를 가지고 있을 경우
         *       추상메서드가 호출되면 안되므로 인스턴스 생성을 못하게 차단함
         *    - class 키워드 앞에 abstract 키워드를 붙여서 정의
         *    - 추상메서드 뿐만 아니라 일반메서드, 멤버변수, 생성자를 가질 수 있음
         *    => 추상메서드가 없는 메서드도 추상클래스로 정의할 수 있음
         *    - 인스턴스를 생성할 수 없지만, 상속을 통한 슈퍼클래스로 사용하거나
         *    다형성 활ㅇㅇ을 위한 참조변수 타입으로 사용 가능함
         *    => 추상메서드를 포함하는 추상클래스를 상속받는 서브클래스에서는
         *    반드시 오버라이딩을 통해 추상메서드 바디{}를 구현해야 한다!
         *    즉, 추상메서드 오버라이딩을 강제할 수 있다!
         *    (what 에 대한 강제, how 는 서브클래스에게 위임)
         *    - 추상메서드에 대한 구현을 강제함으로써 코드의 강제성 및 통일성 향상
         *
         *
         *    < 추상클래스 정의 기본 문법 >
         *    [접근제한자] abstract class 클래스명 {
         *    // 멤버변수
         *    // 생성자
         *    // 일반메서드
         *    // 추상메서드
         *
         * }
         */
        // 추상클래스인 AbstractClass 인스턴스 생성
//    AbstractClass ac = new AbstractClass(); // 인스턴스 생성할 수 없음 (생성자가 있어도 직접 불가)

        SubClass sc = new SubClass();
        sc.normalMethod();
        sc.abstractMethod();
        sc.subClassMethod();

        // 추상클래스를 참조변수 타입으로 활용 가능 = 업캐스팅을 통한 다형성
        AbstractClass ac = new SubClass();
        ac.normalMethod(); // 공통(상속된) 메서드
        ac.abstractMethod(); // 공통(상속된) 메서드
        //   ac.subClassMethod(); // 참조 영역 축소로 보이지 않는 메서드

        System.out.println("--------------------------------------------------------------");

        // Flyer 클래스를 상속받은 SuperMan, Bird, AirPlane 인스턴스 생성
        Flyer f;

        SuperMan s = new SuperMan();
        s.fly();
        s.land();
        s.takeOff();

        Bird b = new Bird();
        b.fly();
        b.takeOff();
        b.land();

        AirPlane a = new AirPlane();
        a.fly();
        a.takeOff();
        a.land();

        f = s;
        f.fly();
        f.land();
        f.takeOff();

        f = b ;
        f.fly();
        f.land();
        f.takeOff();

        f = a ;
        f.fly();
        f.land();
        f.takeOff();
    }

}

abstract class AbstractClass{
    //public abstract void abstractMethod() {
    //=> 추상메서드 정의 시 반드시 중괄호를 제거해야함!
    // -> Abstract methods do not specify a body

    public abstract void abstractMethod();
    // => 추상메서드를 갖는 클래스는 반드시 추상클래스로 선언되어야 한다 !

    // 추상클래스가 추가로 가질 수 있는 것
    public void normalMethod() {} // 일반 생성자
    public AbstractClass() {} // 생성자
    String member ; // 멤버변수

}
class SubClass extends AbstractClass {

    // 추상클래스를 상속받은 서브클래스는 반드시 충상메서드에 오버라이딩  필스
    // -> 바디를 갖지않는 추상메서드의 바디를 구현 하는 작업
    @Override
    public void abstractMethod() {
        // TODO Auto-generated method stub
        System.out.println("서브클래스에서 오버라이딩된 추상메서드!");
    }

    public void subClassMethod() {

        System.out.println("서브클래스에서 정의한 메서드");
    }
}

///========================================================================================
/*
 *  슈퍼맨, 새, 비행기의 공통점 : 비행 가능
 *  => 공통점을 추출하여 상위클래스로 정의하되,
 *  각 서브클래스에서 비행 기능을 반드시 구현하도록 강제성을 부여
 */

abstract class Flyer {
    // 모든 날아다니는 것들에 대한 이륙, 비행, 착륙 메서드 정의
    // -> 슈퍼클래스로 사용할 Flyer 클래스의 메서드들에는
    // 실행할 코드가 불필요하므로 추상메서드로 정의하고,
    // 추상메서드를 포함하는 Flyer 클래스를 추상클래스로 정의
    public abstract void takeOff();
    public abstract void fly();
    public abstract void land();
}

// Flyer 클래스를 상속받는 SuperMan, Bird, AirPlane 클래스 정의
class SuperMan extends Flyer{

    @Override
    public void takeOff() {
        System.out.println("SuperMan 이륙");
    }

    @Override
    public void fly() {
        System.out.println("SuperMan 비행");
    }

    @Override
    public void land() {
        System.out.println("SuperMan 착륙");
    }

}
class Bird extends Flyer{

    @Override
    public void takeOff() {
        System.out.println("Bird 이륙");
    }

    @Override
    public void fly() {
        System.out.println("Bird 비행");
    }

    @Override
    public void land() {
        System.out.println("Bird 착륙");
    }

}
class AirPlane extends Flyer{

    @Override
    public void takeOff() {
        System.out.println("AirPlane 이륙");
    }

    @Override
    public void fly() {

        System.out.println("AirPlane 비행");
    }

    @Override
    public void land() {
        System.out.println("AirPlane 착륙");
    }
}
