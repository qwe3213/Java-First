import java.util.ArrayList;
import java.util.List;

public class CollectionLoopExample {
    public static void main(String[] args) {
        List<String> foods = new ArrayList<>(); //set<String> foods = new HashSet<>();
        foods.add("치킨");
        foods.add("라면");
        foods.add("피자");
//        for(String food : foods){
//            System.out.println(food+ " 정말 맛있습니다."); //for each문으로 set과 List 둘다 사용가능하다.
//        }
        if(foods.size()==0) { //size함수는 개수를 파악할수있다. 또는 foods.isEmpty()함수를 사용하여 boolean값으로 반환하여 표현할수도있다.
            System.out.println("목록이 비어있습니다.");
        }else{
            System.out.println("총" +foods.size()+"개만큼의 개수가 있습니다.");
        }
    }
}
