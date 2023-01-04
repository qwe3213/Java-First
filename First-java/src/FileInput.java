import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
      try{
           inputStream = new FileInputStream("src/acronym.txt"); // chicken 파일을 불러옴
          //inputStream =new FileInputStream("src/chicken.txt");
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      }
//        Scanner scanner = new Scanner(inputStream);
//        String Line = scanner.nextLine(); // 1줄만 읽어옴
//        System.out.println(Line);
//        String Line2 = scanner.nextLine(); //2번째줄 읽어옴
//        System.out.println(Line2);
      //  String Line33 = scanner.nextLine(); //2번째줄 읽어옴
       // System.out.println(Line33); //3번째 줄은 없기에 오류가 뜸
        Scanner scanner = new Scanner(inputStream);

        while(scanner.hasNextLine()){
            String Line = scanner.nextLine();
            System.out.println(Line);
        } // 입력값에 다음줄이 있는지 없는지 보고 ture인지 false인지 확인하는 함수

    }
}
