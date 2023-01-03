import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        String[] days={"월","화","수","목","금","토","일"};
         for( String day : days){
             System.out.println( day +"요일");
         } // for-each 문
        System.out.println(days); //이상한 문자가 출력됨
        System.out.println(Arrays.toString(days)); //배열 전체를 출력하기위해서는 Arrays.toString()을 사용해야됨
     String [][] dayss = {{"월","화","수","목","금","토","일"}, //2차원 배열
                          {"월","화","수","목","금","토","일"},
                          {"월","화","수","목","금","토","일"}
       };
        System.out.println(Arrays.toString(dayss[0])); //1번째 배열
        System.out.println(Arrays.toString(dayss[1])); //2번째 배열
        System.out.println(Arrays.toString(dayss[2])); //3번째 배열
     }
}
