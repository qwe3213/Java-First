import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("원하는 작업 번호를 입력해주세여");
            System.out.println("1. 메모 읽기");
            System.out.println("2. 새 메모");
            System.out.println("3. 종료");

            int taskNum;

            try{
                String input = scanner.nextLine();
                taskNum =  Integer.parseInt(input); // 문자를 숫자로 바꿔주기
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            if(taskNum==1){
                System.out.println("메모 파일명을 입력해주세요");
                String fileName = scanner.nextLine();

                FileInputStream inputStream = null; // 파일작성하기

                try{
                    inputStream = new FileInputStream(fileName);
                } catch (FileNotFoundException e){
                    System.out.println("파일이 존재하지 않습니다.");
                    continue;
                }
                System.out.println(fileName + "의 내용을 출력합니다.");

                Scanner reader = new Scanner(inputStream);

                while (reader.hasNextLine()){
                    System.out.println(reader.nextLine()); // 입력된것 읽어주기
                }
                System.out.println("\n"); //줄바꿈
                reader.close(); //다읽었으면 닫기
            }
            else if (taskNum == 2){
                System.out.println("저장할 메모 파일명을 입력하세요.");
                String fileName = scanner.nextLine();

                FileWriter writer = null;
                try {
                    writer = new FileWriter(fileName);
                } catch (IOException e) {
                    System.out.println("파일 생성에 실패하였습니다.");
                    continue;
                }
                System.out.println("메모할 문자열을 입력하세요");
                System.out.println("종료: 빈 줄에서 엔터 입력");

                while(true){
                    String input = scanner.nextLine();

                    if(input.equals("")){
                        break;
                    }
                    try{
                        writer.write(input);
                        writer.write("\n");
                    }catch (IOException e) {
                        System.out.println("파일에 문자열을 쓰지 못하였습니다.");
                    }
                }
                try {
                    writer.close();
                }catch (IOException e){
                    System.out.println("파일을 닫는 데 실패하였습니다.");
                }
            }
            else if( taskNum==3){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else{
                System.out.println("잘못된 번호를 입력하였습니다.");
            }
        }
    }
}
