import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
    public static void main(String[] args) {
        Map<String,String> dictionary = new HashMap<>(); //Map함수는 Key값과 Value값의 타입을 다 설정해주고
        dictionary.put("chicken","닭");
        dictionary.put("hippo","하마");
        dictionary.remove("chicken"); // remove를사용하여 Key, Value값 모두 제거

        if(dictionary.isEmpty()){
            System.out.println("사전에 아무것도 없습니다."); //0개일시 출력
            System.exit(0);
        } else{
            System.out.println("사전에 "+dictionary.size()+"개만큼의 단어가 있습니다."); //사전내의 개수만큼 출력
        }

        // System.out.println(dictionary);
        //  System.out.println(dictionary.get("chicken")); //Value 출력
        // System.out.println(dictionary.get("book")); //null 출력
//        Scanner scanner = new Scanner(System.in);
//
//        String English = scanner.nextLine();
//        String Korean = dictionary.get(English);
//
//        if(Korean == null){
//            System.out.println("사전에 없는 단어입니다.");
//        } else{
//            System.out.println(English+"는 "+Korean+" 입니다.");
//        }
        //dictionary.keySet(); //키의 목록출력
        //dictionary.values(); //Value의 목록 출력

        Collection<String> Keys =dictionary.keySet();
        Collection<String> Values= dictionary.values();

        for(String english : Keys){
            String Korean = dictionary.get(english);
            System.out.println(Korean);
            System.out.println(english);
        }
        for(String Korean : Values){
            System.out.println(Korean);
        }
    }
}
