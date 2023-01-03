import java.util.Random;
import java.util.Scanner;

public class UpandDownGame {
    public static void main(String[] args) {
        System.out.println("0~126까지 추측한 숫자를 입력하세여");
        System.out.println("숫자를 맞춰보세요");
        Random random = new Random();
        int randomNumber = random.nextInt(126);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i<8; i++) {
            System.out.println(8 - i + "번째 기회가 남았습니다"); //몇번의 기회가 남았는지 출력
            String input = scanner.nextLine();
            int guess = Integer.parseInt(input); // 문자입력을 숫자로 변환
            if(randomNumber==guess){
                System.out.println("짝짝짝 정답입니다."); //맞춘경우
                break;
            }
            else if(randomNumber < guess){
                System.out.println("추츨한 숫자보다 작습니다"); // 랜덤넘버가 추측넘버보다 작을경우
            }else {
                System.out.println("추츨한 숫자보다 큽니다"); //나머지
            }
            if(i==7) {
                System.out.println("더이상 기회가 남지 않았습니다."); // i가 7일경우 8번의기회 다씀
            }
        }
        System.out.println("게임을 종료합니다.");

    }
}
