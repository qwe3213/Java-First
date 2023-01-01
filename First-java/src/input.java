import java.util.Scanner; //Scanner을 가져와서 쓰겠다는 뜻

public class input {
    public static void main(String[] args) {
        Scanner scanner; //변수선언
        scanner = new Scanner(System.in); // 새 값을 생성하기 위한 키워드 타입명  +() , new키워드를 사용하여 Scanner타입값 생성
        // String input = scanner.nextLine(); //nextLine은 문자열타입을 반환하므로 선언
        //System.out.println(input);

   // 키보드로부터 띄워쓰기 단어로 입력받기

//        String inputs = scanner.next(); //띄워쓰기하여 문자열 입력시 맨앞 단어만 출력
//        String inputs1 = scanner.next();
//        String inputs2= scanner.next();
//        String inputs3 = scanner.next();
//        System.out.println(inputs);
//        System.out.println(inputs1);
//        System.out.println(inputs2);
//        System.out.println(inputs3);
        //띄워쓰기 하여 입력된 문자열 첫번째 단어부터 4개 출략

        //키보드로부터 입받은 숫자 사용하기

        System.out.println("숫자를 입력해 주세여");
        String intInput = scanner.nextLine();
        //System.out.println(intInput+1); //문자열 출력이됨
        //int intValue = Integer.parseInt(intInput); //숫자로 변형시켜줌
        //System.out.println(intValue+1);
        //예외 출력하기
        try{
            int intValue = Integer.parseInt(intInput);
            System.out.println(intValue+1);
        } catch (Exception e){
            System.out.println("숫자만을 입력해 주세요");
        }
    }
}
