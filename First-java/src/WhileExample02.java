import java.util.Scanner;

public class WhileExample02 {
    public static void main(String[] args) {
        String password = "abc123";
        Scanner scanner = new Scanner(System.in);

        System.out.println("비밀번호를 입력해 주세요");
        String input = scanner.nextLine(); //개행을 기준으로 열을 읽음

//        while (input.equals(password)!=true){ //같지않을때 반복
//            System.out.println("올바른 비밀번호를 입력해 주세요");
//            input = scanner.nextLine(); //다시 입력하게 만들기
//        }
//
//             do {
//                 System.out.println("올바른 비밀번호를 입력해 주세요");
//                 input = scanner.nextLine();  //실행하고
//                } while (input.equals(password)!=true) ; // true일시 밑에값 출력 아닐시 do로 다시반복
//          System.out.println("올바른 비밀번호를 입력했습니다.");  // do while 문
        while(true){
            System.out.println("올바른 비밀번호를 입력해 주세요");
            input = scanner.nextLine();
            if(input.equals(password)){
                System.out.println("올바른 비밀번호를 입력하셨습니다.");
                break;
            }
        }
    }
}
