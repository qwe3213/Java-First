public class Thread2 {
    public static void main(String[] args) {



/*

▶   멀티쓰레딩 (Multi Threading)
–   하나의 프로세스 내에서 두 가지 이상의 작업(Thread)를 동시에 처리.
–   실제로 두 가지 이상의 작업을 동시에 수행하는 것은 아니며,
    CPU가 빠른 속도로 여러 작업을 번갈아가면서 수행하므로,  마치 동시에 처리되는것 처럼 느껴짐
    (= Round Robin 방식)
–   멀티쓰레딩으로 처리되는 작업 순서는 고정이 아닌 변동이며,  항상 실행 결과가 달라질 수 있음.
     →   운영체제 스케쥴링에 따라 처리되는 순서 및 횟수가 달라지기 때문.



▸   멀티쓰레딩 구현 방법
1.   Thread 클래스를 상속받는 서브클래스를 정의하는 방법.
     1 )   멀티쓰레딩 코드가 포함될 서브클래스에서 Thread 클래스 상속.
     2 )   Thread 클래스의 run() 메서드를 오버라이딩하여 멀티쓰레딩으로 처리할 코드를 기술.
     3 )   멀티쓰레디으로 구현된 클래스의 인스턴스 생성.
     4 )   생성된 인스턴스의 start() 메서드를 호출하여 멀티쓰레딩 시작.

2.   Runnable 인터페이스를 구현하는 서브클래스를 정의하는 방법.

3.   멀티쓰레딩으로 처리할 위치의 코드에서 직접 thread를 구현하는 방법.
     →   익명 구현 객체 사용→

 */





//EX1   )   멀티쓰레딩 코드가 포함될 서브클래스에서 Thread 클래스 상속받아 멀티쓰레딩 구현하기
//•   멀티쓰레딩 클래스 인스턴스 생성
        MyThread mt1 = new MyThread("★A작업★", 100000);
        MyThread mt2 = new MyThread("※B작업※", 500000);
        MyThread mt3 = new MyThread("＃C작업＃", 1000000);

//Thread t = new MyThread("★A작업★", 100000);
//–   이렇게 업캐스팅 적용하여 사용 가능.



//•   멀티쓰레딩 코드 실행 (쓰레드 시작)
//mt1.run();
//mt2.run();
//mt3.run();
//–   run() 메서드를 직접 호출 시 싱글쓰레딩으로 처리되므로 주의!
//–   반드시 run() 메서드가 아닌 start() 메서드를 호출해야 함.
        mt1.start();
        mt2.start();
        mt3.start();

    } // main

} // Ex2





//EX1   )   멀티쓰레딩 코드가 포함될 서브클래스에서 Thread 클래스 상속받아 멀티쓰레딩 구현하기
//•   멀티쓰레딩을 구현한 서브클래스 정의 (Thread 클래스 상속)
class MyThread extends Thread{
    //–   java.lang 패키지에 위치하므로 따로 import하지 않아도 됨.

    String name;
    int count;

    // 파라미터 생성자
    public MyThread(String name, int count) {
        super();
        this.name = name;
        this.count = count;
    }

    // run() 메서드 오버라이딩
    @Override
    public void run() {
        for(int i=1; i <= count; i++) {
            System.out.println(name + " : " + i);
        }
    }
}
