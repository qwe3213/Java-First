import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> myFavoriteFoods = new HashSet<>();
        myFavoriteFoods.add("치킨");
        myFavoriteFoods.add("라면");
        myFavoriteFoods.add("치킨");
        System.out.println(myFavoriteFoods); //Set함수는 중복을 허락하지않는다.
    }
}
