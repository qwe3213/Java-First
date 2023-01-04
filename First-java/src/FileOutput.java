import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        FileWriter writer = null;
       try{
           writer = new FileWriter("src/output01.txt",true); //덮어쓰는방식, 파일이름뒤에 true를 쓰게되면 계속 저장되면서 쓰여짐
       } catch (IOException e){
           System.out.println("파일 생성에 실패하였습니다.");
           System.exit(1);// 비정상적 종료 알리기위해 1을 씀
       }
        Scanner scanner = new Scanner(System.in);

        System.out.println("종료하고 싶으시면 입력없이 엔터를 눌러주세요");
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("종료되었습니다.");
                break;
            }

            try {
              //  writer.write("치킨은 살 안쪄요\n");
               // writer.write("살은 내가쪄요\n");
                writer.write(input); //내가 입력한 것도 파일에 쓰여지게 하기.

            } catch (IOException e) {
                System.out.println("파일에 데이터를 쓰는 데에 실패하였습니다.");
                System.exit(2);
            }
        }
        try {
            writer.close(); //파일을 다사용하고 해주어야함.
        } catch (IOException e){
            System.out.println("파일 닫기에 실패하셨습니다");
        }
    }
}
