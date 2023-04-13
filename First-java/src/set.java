import java.util.HashSet;
import java.util.Set;
public class set {
    public static void main(String[] args) {
        /*
         * Collection Framework (컬렉션 프레임워크)
         * - 컴퓨터 시스템에서 데이터를 효율적으로 저장 및 관리하는 방법
         *  = 자료구조 라고함
         *  => 자료구조를 자바에서 구현하여 제공하는 클래스들의 모음(API)
         *  - Set, List, Map 인터페이스 계열로 구분됨
         *   => Set 과 List 는 공통적으로 Collection 인터페이스를 상속받으므로
         *      제공되는 메서드가 거의 동일함
         * - 각 인터페이스들의 구현체 클래스를 사용하여 데이터를 관리함
         * - java.util 패키지에 컬렉션 프레임워크 API 들이 제공됨
         * - toString() 메서드가 오버라이딩 되어 있음
         * - 모든 데이터는 객체 형태로 관리되며, 기본 데이터타입일 경우
         *   Wrapper 클래스 타입으로 오토 박싱이 일어남
         *
         *  1. Set 계열
         *  - 저장 순서 유지 X, 데이터 중복 허용 X
         *   -> 주머니에 공을 무작위로 집어넣는 것과 유사한 구조로
         *      데이터의 저장되는 순서 유지 및 중복이 불가능한 구조
         *      => 매우 효율적인 중복 제거 수단으로 사용 가능
         *  - 인덱스를 사용하지 않음
         *  - 구현체 클래스 : HashSet, TreeSet 등
         *
         *
         */

        // HashSet 객체 생성
//    HashSet set = new HashSet();


        // set 인터페이스 규현체이므로 업캐스팅 활용하여 주로 사용
        Set set = new HashSet(); // HashSet -> Set 업캐스팅

        // Set 계열 메서드 사용
        // 1. boolean isEmpty() : 컬렉션 객체가 비어있는지 여부 리턴
        System.out.println("set 객체가 비어있는가? : " + set.isEmpty());

        // 2. int size() : 컬렉션 객체에 저장된 요소 (데이터, 객체) 개수 리턴
        System.out.println("set 객체의 저장된 요소 개수? : " + set.size()+"개");

        // 3. boolean add(Object o) : 컬렉션 객체에 요소(o, 데이터)를 추가
        // => 파라미터가 Object 타입이므로 모든 타입 데이터 추가 가능(기본형, 객체)
        // -> 리턴타입이 boolean 이므로 요소 추가 성공 여부 리턴(중복 시 추가 X)
        set.add(1);  // int -> Integer -> Object 로 변환되어 저장됨
        set.add("TWO"); // String -> Object 로 변환
        set.add(3.14); // double형 -> Double -> Object 로 변환되어 저장됨
        System.out.println("set 객체가 비어있는가? : " + set.isEmpty());
        System.out.println("set 객체의 저장된 요소 개수? : " + set.size()+"개");

        // toString() 메서드가 오버라이딩 되어 있으므로 출력때문에 사용 가능(생략 가능)
        System.out.println("set 객체의 모든 요소 출력 : " + set);

        System.out.println("실수 3.14 추가 가능하나? : " + set.add(3.14));
        // 중복 불가 , false
        System.out.println("set 객체의 저장된 요소 개수? : " + set.size()+"개");


    }
}
