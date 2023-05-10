import java.util.Arrays;
import java.util.Comparator;

public class lamda3 {
    public static void main(String[] args) {



//•   람다식 응용
        String[] str = {"this", "is", "java", "world"};
        System.out.println(Arrays.toString(str));
//–   Arrays는 Java의 내부 클래스이며,  해당 클래스의 모든 메서드는 static처리가 되어 있음.

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
//–   기본적으로 sort() 메서드는 알파벳순으로 오름차순으로 정렬됨.





/*
▸   새로운 정렬 기능 만들기
–   내부적으로 Comparator의 compare() 메서드를 사용하여,  새로운 기능을 만들고 Arrays.sort()에 전달하면 됨.
    →   자바에서는 함수만 전달할 방법이 없으므로 해당 기능을 가지는 객체를 전달해야 함.
        일회용으로 정렬 기능을 작성하려면 익명의 내부 클래스로 만들어서 사용!
 */

//•   내림차순 정렬하기
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * -1;
                //–   -1을 곱해서 내림차순으로 정렬함.
            }
        });

        System.out.println(Arrays.toString(str));
//–   내림차순 정렬 후,  world, this, java, is로 출력됨.
//–   결국 정렬을 위해 '필요했던 기능'은 Comparator가 아니라 compare()이였던 것.
//–   compare() 메서드만 있으면 되지만,
//    JAVA언어의 특성으로 인해 익명의 내부클래스를 만들고 객체화해서 전달하고 있음.
//     →   이 부분을 람다식으로 표현하면 좀 더 쉽게 표현됨.

        System.out.println("------------------------------------");


//•   람다식으로 표현하기
//–   위의 코드를 람다식으로 표현.
        Arrays.sort(str, (String o1, String o2) -> {return o1.compareTo(o2) * -1; });
        Arrays.sort(str, (o1, o2) -> o1.compareTo(o2) * -1);





    } // main
}

