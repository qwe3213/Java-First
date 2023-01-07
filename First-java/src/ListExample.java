import java.util.*;

public class ListExample {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//       list.add("치킨");
//       list.add("라면");
        // list.remove(1); List의 배열의 1번째 제거;
        // list.remove("치킨") 치킨이라는 문자제거
        //boolean containChicken = list.contains("치킨"); //포함되어있으면 true, 아니면 false
        //System.out.println(containChicken);
//        System.out.println("저장할 음식 이름 입력.(종료: 0)");
//        List<String> foods = new ArrayList<>();
//        Scanner scanner =new Scanner(System.in);
//
//        while (true) {
//            String food = scanner.nextLine();
//
//            if(food.equals("0")){
//                break;
//            }
//            if(foods.contains(food)){
//                System.out.println("이미 목록에 있습니다.");
//            } else{
//                foods.add(food);
//            }
//        }
//       //  Collection.sort(foods); // foods의 배열내의 가나다 순으로 나열함
//        //Collection.reverse(foods); //거꾸로 나열됨.
//        //Collection.shuffle(foods); //랜덤으로 섞여서 나열됨
//        System.out.println(foods);
//        List<String> names = new ArrayList<>();
//        names.add("정동원");
//        names.add("김동원");
//        names.add("이동원");
//        names.add("박동원");
        //위의 코드를 간단하게 하기위해 new ArrayList<>();가아닌
        List<String> names = Arrays.asList("정동원","김동원","이동원","박동원");
        System.out.println(names);
        //이러한식으로 Arrays.asList를 사용하여 편하게 작성할수있다.
    }
}
