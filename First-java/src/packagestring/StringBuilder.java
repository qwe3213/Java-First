package packagestring;

import java.io.IOException;

public class StringBuilder {
    public static void main(String[] args){

        /*
         *  StringBuffer 와 StringBuilder
         *  - String클래스는 한 번 생성되면 그 내부의 문자열이 변경되지 않음
         *  - String클래스를 사용하여 문자열을 계속 연결하거나 변경하는 프로그램을
         *    작성하면 메모리 낭비가 심함
         *  - 이 때, StringBuffer 와 StringBuilder를 활용하면 문자열 변경하거나 연결 가능
         *  - 두 클래스는 크게 차이는 없으며
         *    쓰레드가 동작하는 멀티쓰레드 프로그램이라면 문자열의 안전한 변경을 보장하는
         *    StringBuffer 를 사용하고,
         *    쓰레드가 동작하지 않는 프로그램이라면 실행 속도가 좀 더 빠른
         *    StringBuilder를 사용한다.
         */
        String str = new String("java");
        System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
//     // 인스턴스가 처음 생성됐을 때 메모리 주소 : 1130478920
       System.out.println(str);

       str = str + "and";
       System.out.println("str 문자열 주소 : " + System.identityHashCode(str));
      // => "java and"의 문자열을 갖는 메모리 영역이 새로 생성되었음 주소 다름!


        StringBuilder buffer = new StringBuilder(str);
        System.out.println("str 문자열 주소 : " + System.identityHashCode(buffer));
        str = buffer.toString();
        System.out.println("새로 만들어진 str 문자열 주소 " + System.identityHashCode(str));
        System.out.println(buffer);
        buffer.append("end");
        // buffer에 end 더하기
         System.out.println(buffer);
         System.out.println("str 문자열 주소 : " + System.identityHashCode(buffer));
        // 주소변경 없음!

//       // toString() 을 통해 String 클래스로 변환
//       str = buffer.toString();
//       System.out.println(str);
//       System.out.println("새로 만들어진 str 문자열 주소 " + System.identityHashCode(str));
    }

}
