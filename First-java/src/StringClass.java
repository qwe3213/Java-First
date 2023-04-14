import java.util.*;
public class StringClass {
    public static void main(String[] args) {
       /*   String 클래스
          - 문자열 데이터 처리하는 클래스
          - 리터럴을 사용하여 문자열을 직접 생성하거나(추천!)
          new 연산자를 사용한 인스턴스 생성 시 생성자에 문자열을 전달하여 생성
          -> 리터럴 사용 시 해당 문자열 존대 여부를 상수 풀에서 검사한 후
       *      중독되는 문자열이 없으면 생성하고, 중복될 경우 주소값을 리턴하므로
       *      메모리 공간 낭비가 줄어들게 됨
       *   => new 연산자 사용 시 문자열 중독 여부와 무관하게 문자열 객체 생성
       *   - 문자열 내용 비교 시 동등비교(==) 연산보다 equals() 메서드 사용
       *   - 문자열을 생성하면 String 클래스 내부적으로 char[] 로 관리됨
       *   -> 개발자의 편의를 위해 별도의 String 클래스를 만들어서 제공
       *   => 배열 형태이므로 배열 인덱스와 동일한 인덱스 번호를 사용
       *      (첫글자 인덱스 0번, 마지막 인덱스 문자열.length()-1)
            *
            *   < String 클래스의 메서드 >
            *   - 문자열 수정, 검색, 치환 등 다양한 작업을 수행하는 메서드를 제공
       *    각종 작업을 수행할 경우 수정된 데이터를 문자열로 새로 생성함
       *    => 문자열 수정이 빈번할 경우에는 메모리 낭비가 심하므로
       *     StringBuilder 또는 StringBuffer 클래스를 활용해야함
       *
               */


        String s1 = "Java Programming";
        String s2 = "     아이티윌        부산    교육센터";
        String s3 = "자바/JSP/클라우드";

        System.out.println(s1); // toString() 메서드 생략됨
        System.out.println(s1.toString()); // 저장된 문자열을 리턴
        System.out.println("========================================================");
        // lenget() : 문자열 길이 리턴
        System.out.println("s1.length : " + s1.length()); // 16
        // equals() : 문자열 비교 (대소문자 구별하여 비교)
        System.out.println("s1.equals(JAVA PROGRAMMING) : " + s1.equals("JAVA PROGRAMMING"));

        // equalseIgnoreCaes() : 문자열 비교(대소문자 구별하지 않고 비교)
        System.err.println("s1.equalsIgnoreCase(JAVA PROGRAMMING) : " + s1.equalsIgnoreCase("JAVA PROGRAMMING"));


        // charAt() : 특정 인덱스에 위치한 문자 1개 리턴
        System.out.println(s1.charAt(5)); // 5번째 char형 추출

        // substring() : 특정 범위 문자열 (= 부분 문자열) 추출
        // 1) substring(int beginIndex) : 시작 인덱스부터 끝까지 문자열 추출
        System.out.println("s1.substring(5) : " + s1.substring(5));
        // 2) substring(int beginIndex,endIndex) : 시작인덱스부터 끝인덱스까지
        System.out.println("s1.substring(5,11) : " + s1.substring(5, 11));

        // concat() : 문자열 결합 (결합연산자보다 연산속도가 빠름
        System.out.println("s1.concat(!) : " + s1.concat("!"));
        System.out.println("s1.concat(!) : " + s1 + "!");

        // indexOf() : 특정 문자 또는 문자열의 인덱스 리턴
        // => 문자열의 앞쪽부터 탐색
        // => 탐색할 문자 또는 문자열이 존재하지 않을 경우 -1 리턴
        System.out.println("s1.indexOf('a') : " + s1.indexOf('a'));
        // => 앞에서부터 문자 'a'를 탐색하여 인덱스 1 리턴

        System.out.println("s1.indexOf('x') : " + s1.indexOf('x'));
        // => 존재하지 않는 문자이므로 -1 리턴
        System.out.println("s1.indexOf('Program') : " + s1.indexOf("Program"));
        // 시작지점때의 위치
        System.out.println("s1.lastindexOf('Program') : " + s1.lastIndexOf("a"));
        // 뒤에서 부터

        // replace() : 특정 문자 또는 문자열 치환
        // -> 동일한 문자 또는 문자열이 존재할 경우 모두 치환
        System.out.println("s1.replace('a','@') : " + s1.replace('a', '@'));
        // a 대신 @
        System.out.println("s1.replace(\"a\", \"@\") : " + s1.replace("a", "@"));
        // char 형 대신 String 형으로 가

        System.out.println("s1.replace(java,'JAVA') : " + s1.replace("java", "JAVA"));

        System.out.println("s1.toUpperCase() : " + s1.toUpperCase());
        // 대문자

        System.out.println("s1.toLowerCase() : " + s1.toLowerCase());
        // 소문자

        // trim() : 문자열 앞뒤의 불필요한 공백 제거, 문자열 사이의 공백은 제거하지 않음
        System.out.println("교육기관은 " + s2.trim());

        // contains() : 문자열 포함 여부 리턴
        System.out.println("s2.contains(부산) : " + s2.contains("부산"));
        System.out.println("s2.contains(강남) : " + s2.contains("강남"));
        System.out.println("------------------------------------------------");

    }
}
