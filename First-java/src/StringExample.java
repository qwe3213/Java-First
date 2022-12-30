public class StringExample {
    public static void main(String[] args) {
        System.out.println("나는 문자열"); //겹따옴표는 문자열
        System.out.println('난'); //홑따옴표는 문자 -> 한글자밖에 입력이안됨
        System.out.println("안녕 나는 \"자바\"야."); //문자열 내에 따옴표를 표시하기위한 방법
        System.out.println("치킨은 살 안쪄요. \n살은 내가 쪄요");

        String chicken = "치킨은 살 안쪄요"; // 문자열 사용할때 String을 사용하여 출력
        String me = " 살은 내가 쪄요"; // 문자열 사용할때 String을 사용하여 출력
        String chickenAndMe = chicken+me; //문자열 합쳐서 출력하기
        int length = me.length(); //me 의 길이수 표현 정수형 변수로 설정해야됨.
        String replace = me.replaceAll("내가", "치킨이"); //repalceAll함수 실행시켜보기 -> repalceAll함수는 첫번째로 쓴 문자열을 두번째로 쓴 문자열로 대체하는 함수
        String birthday = "1999/02/21";
        String year = birthday.substring(0,4); //substring함수를 사용하여 0~4번쨰 값을 출력
        String day = birthday.substring(8);//substring함수를 사용하여 8번째 값부터 출력
        System.out.println(day);

    }
 }

