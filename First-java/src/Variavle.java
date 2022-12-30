    public class Variavle {
        public static void main(String[] args) {
            int number; //변수를 적절히 활용하면 코드의 관리가 원횔해짐
            number = 3;
            number = 10 ;
            int ratio = 15;
            System.out.println(number);  //위에서 부터 계산하여 마지막값 출력
            System.out.println(100*ratio/100.0); //나누기 할때 100이 아니라 100.0을 한 이유는 정수끼리 나누었을때 결과값은 정수가나오고 나머지값을 버리기 때문에 뒤에 100.0을 해주어 나머지도 출력하게 함.
            System.out.println(300*ratio/100.0);
            System.out.println(1000*ratio/100.0);

            float floatSum = 0.001f+ 0.001f+0.0001f ; //자바는 실수형타입 계산할때 잘못함. 중요한 계산할때는 정수형 계산
            System.out.println(floatSum);
        }
    }
