import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
//        int month =5;
//        switch (month){
//            case 1:
//                System.out.println("January");  //month가 1일경우 출력
//                break; //break를 걸지않으면 밑에 코드까지 출력
//            case 2:
//                System.out.println("February");  //month가 2일경우 출력
//                break;
//            case 5:
//                System.out.println("May");  //month가 5일경우 출력
//                break;
//            default:
//                System.out.println("일치하는 값이 없습니다.");
//
//
//        }
        System.out.println("메뉴 번호를 입력해 주세요");
        System.out.println("1. 치킨 ");
        System.out.println("2. 순대국");
        System.out.println("3. 라면");
        Scanner scanner = new Scanner(System.in);
        int menuNumber; //입력번호값 설정
        try{
            menuNumber = scanner.nextInt(); //번호를 입력할시 저장
        } catch(Exception e){
           menuNumber= -1;
        }
        switch (menuNumber){

            case 1:
                System.out.println("치킨은 2만원입니다.");
                break;
            case 2:
                System.out.println("순대국은 1만원입니다.");
                break;
            case 3:
                System.out.println("라면은 2천원입니다.");
                break;
            default:
                System.out.println("올바른 메뉴의 번호를 입력해 주세요");
                break;
        }
    }
}
