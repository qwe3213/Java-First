public class lamda2 {
    public static void main(String[] args) {



/*

▶   함수형 인터페이스 (Funtional interface) 또는 타겟 타입(target type)
–   람다식은 결과적으로 "인터페이스 타입의 클래스를 손쉽게 구현하는 방법"
–   반드시 하나의 abstract 메서드만 존재.
–   만약 abstract 메서드가 없거나 두 개 이상 존재한다면 람다식으로 대체 가능.
–   함수형 인터페이스 @FunctionalInterface 어노테이션 선언.

 */



        useFIMethodA(new MyFunc1() {	// 익명 구현 클래스

            @Override
            public void methodA() {
                System.out.println("익명 내부클래스 형태!");
            }

        });

        System.out.println("---------------------------------------------");

//•   line 21의 코드를 람다식으로 표현
//1.   파라미터와 리턴타입이 없는 경우 (파라미터 X 리턴타입 X)
//–   정적 메서드 useFIMethodA의 파라미터가 MyFunc1의 인터페이스 타입이므로,
//    람다식으로 만들어지는 익명 객체가 파라미터값으로 사용됨.

//표현방식1 )
//–   소괄호 안에 람다식으로 표현.
//–   파라미터가 없어도 소괄호는 생략 불가능하며 {}안에 실행문 작성.
        useFIMethodA( () -> {
            System.out.println("람다식1");
        });

//표현방식2 )
//–   실행문이 한 줄 이라면 중괄호와 실행문의 세미콜론 생략 가능.
        useFIMethodA( () -> System.out.println("람다식1") ) ;
        System.out.println("----------------------------------------------");



//2.   파라미터가 있는 람다식 (파라미터 O)
        System.out.println("(파라미터 : O)");

//표현방식1 )
        useFIMethodB( (String msg) -> {
            System.out.println("람다식1 : " + msg);
        });

//표현방식2 )
//–   파라미터 1개 실행문도 1개라면 (),  {} 모두 생략 가능.
        useFIMethodB( msg -> System.out.println("람다식2 : " + msg) );
        System.out.println("----------------------------------------------");



//3.   리턴타입이 있는 람다식 (리턴타입 O)
        System.out.println("(리턴타입 O)");

//표현방식1 )
        String result = useFIMethodC( (String msg) -> {
            return "람다식1 : " + msg;
        });
        System.out.println(result);

//표현방식2 )
//–   표현방식1의 방법을 간단하게 작성.
//–   파라미터가 1개이므로 소괄호 생략 가능,
//    바디부분에 return문 하나밖에 없으므로 중괄호 및 세미콜론 생략하여 return문 안의 표현식만 작성함.
        System.out.println(useFIMethodC( msg -> "람다식1 : " + msg ) );





    } // =========main() 메서드================================================================





    //EX1   )   파라미터와 리턴타입이 없는 경우 (파라미터 X 리턴타입 X)
    public static void useFIMethodA(MyFunc1 fi) {
        //–   매개변수로 MyFunc1의 타입을 설정.
        //–   매개변수로 인터페이스 구현 클래스,  익명 구현 클래스,  람다식이 올 수 있음.
        //    (람다식을 사용하면 내부적으로 익명 구현 클래스가 생성됨)
        fi.methodA();
    }

    //EX2   )   파라미터가 있는 람다식 (파라미터 O)
    public static void useFIMethodB(MyFunc2 fi) {
        fi.methodB("홍길동");
    }

    //EX3   )   리턴타입이 있는 람다식 (리턴타입 O)
    public static String useFIMethodC(MyFunc3 fi) {
        return fi.methodC("홍길동");
    }



} // =============Ex3 클래스====================================================================





//▸   함수형 인터페이스를 사용하는 람다식 유형
//1.   파라미터와 리턴타입이 없는 경우 (파라미터 X 리턴타입 X)
@FunctionalInterface
interface MyFunc1{

    void methodA();
//	void methodB();
    //–   함수형 인터페이스 어노테이션(@FuntionalInterface) 선언 시 에러 발생.
    //     →   함수형 인터페이스는 반드시 '하나의 추상메서드'를 가져야 함.

}



//2.   파라미터가 있는 람다식 (파라미터 O)
@FunctionalInterface
interface MyFunc2{
    void methodB(String msg);
}



//3.   리턴타입이 있는 람다식 (파라미터 O 리턴타입 O)
@FunctionalInterface
interface MyFunc3 {
    String methodC(String msg);
}
}
