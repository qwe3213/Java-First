import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Set;
public class Map2 {
    public static void main(String[] args) {
        /*
         *  Map 계열
         *  - 키(key) 와 값(value) 을 한 쌍으로 갖는 자료구조
         *   => 키와 값을 한 쌍으로 갖는 Map.Entry 타입 객체로 관리됨
         *  - 키는 중복 불가, 값은 중복 가능
         *  -> 키는 Set 타입으로 관리됨
         *   - 대표적인 구현체 클래스 : HashMap, Hashtable, Properties, TreeMap
         *   - toString() 메서드가 오버라이딩 되어 있음
         *   - 전화번호부, 가격표 등 한 쌍의 데이터를 매핑하는 구조에 활용
         *
         *
         */

        Map map = new HashMap();

        // put(Object key, Object value) : 키(key)에 해당하는 데이터 (value)추가
        map.put(1, "자바");
        map.put(2, "JSP");
        map.put(3, "클라우드");
        System.out.println("map 객체의 모든 엔트리 : " + map);

        // 키는 중복이 불가능하므로 존재하는 키르르 지정할 경우 값을 덮어씀
        // => 제거되는 데이터가 리턴됨
//      map.put(3,"Spring Framework");
//      System.out.println("map 객체의 모든 엔트리 : " + map);
        System.out.println("3을 키로 갖는 값 추가 : " +map.put(3, "Spring Framework"));
        System.out.println("map 객체의 모든 엔트리 : " + map);

        // 키는 중복이 불가능하지만, 값은 중복이 가능함
        System.out.println("4를 키로 갖는 Spring Framework 값 추가 : " + map.put(4,"Spring Framework"));
        System.out.println("map 객체의 모든 엔트리 : " + map);

        // Object get(Object key) : key 에 해당하는 값 리턴(없을 경우 null)
        System.out.println("정수 2에 해당하는 키의 데이터 :" + map.get(2));
        System.out.println("정수 2에 해당하는 키의 데이터 :" + map.get("2"));

        // Set keySet() : Map 객체 내의 모든 키 리턴 -> Set 타입 객체로 리턴
        Set keySet = map.keySet();
        System.out.println("모든 키 : " + keySet);

        // Colection values() : Map 객체 내의 모든 값 리턴
        // List valueList = (List) map.values(); // 주의! 직접 다운캐스팅 불가!
        List valueList = new ArrayList(map.values()); // 객체 생성 파라미터로 전달
        System.out.println("모든 값 : " + valueList);

        // Map 객체 크기만큼 반복문을 사용하면서 차례대로 요소 접근 불가
        // -> 대신 KeySet(),values() 결과를 사용하여 반복 가능함
        //   Iterator ite = map.iterator(); // 반복자 사용 불가
        for(Object o : keySet) {
            System.out.println(map.get(o));
        }
        // entrySet() : 키-값 을 한쌍으로 갖는 엔트리 객체를 Set 타입으로 리턴
        Set entrySet = map.entrySet();
        System.out.println(entrySet);

        // 제네릭 타입으로 <키의 타입, 값의 타입> 형태 지정
        Map<String, String> map2 = new HashMap<String,String>();

        // 전화번호부의 경우 전화번호가 키로, 이름이 값으로 사용됨
        map2.put("010-1234-5678","홍길동");
        map2.put("010-3333-3333","홍길동");
        map2.put("010-3333-4444","이순신");
        map2.put("010-3333-4444","강감찬");
        // -> 키로 사용되는 전화번호가 동일하므로 이름을 덮어씀
        System.out.println(map2);

        // containsValue() : 특정 값을 탐색
        System.out.println("홍길동이라는 이름이 존재합니까 ? " + map2.containsValue("홍길동"));
        System.out.println("이순신이라는 이름이 존재합니까 ? " + map2.containsValue("이순신"));
        System.out.println("010-1234-5678 전화번호가 존재합니까? " + map2.containsKey("010-1234-5678"));
    }

}
