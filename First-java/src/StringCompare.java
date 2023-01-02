import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String a = "치킨";
        Scanner scanner =new Scanner(System.in);
        String b = scanner.nextLine();

        System.out.println(a==b); // 자바는 문자열을 비교할때 메모리상 저장되어있는 그 위치를 비교하기 때문에 false가 나옴
        System.out.println(a.equals(b)); // 문자열 비교할때에는 equals을 이용해야됨
    }
}
