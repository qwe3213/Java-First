import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    public static void main(String[] args) {
      /*
       * Set 계열 객체를 활용하여 로또 번호 생성기 작성(정렬은 선택)
         1. 이번주 로또 1등 당첨 번호를 Set 객체 thisWeekLotto 에 저장
           => ex) "이번주 1등 당첨번호 : 7 8 11 13 15 23 출력

       * ------------------------------------------Generic 타입 <Integer> 설정
       * 2. Set 타입 객체 myLotto 생성
       * 3. 1 ~ 45 사이의 중복되지 않는 난수(로또번호) 6개를 Set 객체에 저장
       *    => ex) "나의 로또 번호 : 1 10 11 15 23 41 43 출력
         3.
         => 난수 발생 : Math.random() or Random() 클래스 활용
         => 반복문을 통해 Set 객체에 난수 저장

       */
//     Set<Integer> ThisWeekLotto = new TreeSet<Integer>();
        Set<Integer> myLotto = new TreeSet<Integer>();
        Set<Integer> myLotto2 = new TreeSet<Integer>();
        Set<Integer> myLotto3 = new TreeSet<Integer>();
//     System.out.println(myLotto);
//     ThisWeekLotto.add(7);
//     ThisWeekLotto.add(8);
//     ThisWeekLotto.add(11);
//     ThisWeekLotto.add(13);
//     ThisWeekLotto.add(15);
//     ThisWeekLotto.add(23);
//
        Random r = new Random();

        Set<Integer> ThisWeekLotto = new TreeSet<Integer>(Arrays.asList(7,8,11,13,15,23));
        System.out.println(ThisWeekLotto);
        while(true) {
            myLotto2.add((int)Math.floor(Math.random()*45+1));
            if(myLotto2.size() == 6) {
                break;
            }
        }
             System.out.println(myLotto2);

     for(int i = 0 ; true; i++) {
       myLotto3.add((int)Math.floor(Math.random()*45+1));
       if(myLotto3.size() == 6) {
         break;
       }
     }

            System.out.println(myLotto3);
           System.out.println(myLotto);

//4. 비교하여 일치하는 번호 개수 파악 1등 6개, 2등 5개, 3등 :4개, 나머지 꽝
// 카운팅 결과를 저장할 변수 선언 및 초기화
// 1등 당첨번호와 myLotto 번호를 비교
// => contains()메서드를 활용
//     내 번호에 1등 당첨번호가 있으면(true) -> 카운팅 +1
// => 반복적으로 비교 수행
//      1) 향상된 for문 사용 // for(변수 : 데이터가 저장된 객체){}
//      2) Iterator 사용
// 등수 결과 확인은 Switch - case문 활용
        int count = 0 ;
        for(int i = 1; i<=6; i++) {
            int ran = r.nextInt(45)+1;
            if(myLotto.contains(ran)){
                i--;
            }else {
                myLotto.add(ran);
                if(ThisWeekLotto.contains(ran)) {
                    count++;
                }
            }
        }
        int count1 = 0;
        Object[] ThLotto = ThisWeekLotto.toArray();
        for(int i = 0 ; i < 6; i++) {
            if(myLotto.contains(ThLotto[i])) {
                count1++;
            }
        }
        int count3 = 0;
        for(Object num : ThLotto) {
            if(myLotto.contains(num)) {
                count3++;
            }
        }
        System.out.println(count3);
        System.out.println(count1);
        String result = "";
        System.out.println(myLotto);
        System.out.println(count);

        Iterator<Integer> ite = myLotto.iterator();
        // Set 객체의 iterator() 메서드를 호출하여 Iterator(반복자) 인터페이스를
        // 구현한 객체를 얻음
        while(ite.hasNext()) {
            // 꺼내올 데이터가 있으면 true 없으면 false
            int num = ite.next(); // next() 메서드를 호출하여 요소를 리턴
            if(ThisWeekLotto.contains(num) ) {
                count++;
            }
        }

        switch (count) {
            case 0:  result = "꽝";
                System.out.println("결과 :" + result);
                break;
            case 1:  result = "꽝";
                System.out.println("결과 :" + result);
                break;
            case 2:  result = "꽝";
                System.out.println("결과 :" + result);
                break;
            case 3:  result = "꽝";
                System.out.println("결과 :" + result);
                break;
            case 4:  result = "3등";
                System.out.println("결과 :" + result);
                break;
            case 5:  result = "2등";
                System.out.println("결과 :" + result);
                break;
            case 6:  result = "1등";
                System.out.println("결과 :" + result);
                break;
        }
    }
}
