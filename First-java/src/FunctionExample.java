public class FunctionExample {
    public static void main(String[] args) {
        // void의 역할 : 메소드가 되돌려주는 값, 즉 반환값의 자료형을 명시한다. void는 메소드가 아무 값도 되돌려주지 않을때에 사용합니다.
        // main : 지금 살펴보고 있는 메소드를 main 매소드라고 부르는 이유
        sayHello();
        sayHelloTo("chicken");
        printSum(3,4);
        int result = sum(2,4);
        System.out.println(result);

        int[] sumAndProduct = addAndMultiply(3,4);
        System.out.println("sum:"+sumAndProduct[0]);
        System.out.println("product:"+ sumAndProduct[1]);
        sayhola("바보");
    }
    public static void sayHello() {
        System.out.println("hello");
    }
    public static void sayHelloTo(String name){
        System.out.println("Hello, "+name);
    }
    public static void printSum(int a, int b){
        System.out.println(a + "+" +b +"="+(a+b));
    }
    public static int sum(int a, int b){
        return a+b;
                //메소드에서 값을 반환하기 위해서는 return을 사용, 그리고 void 대신에 정수값을 리턴할것이 때문에 int를 작성
    }
    public static int[] addAndMultiply(int a, int b){
        int sum = a+b;
        int product = a*b;

        int[] result ={sum,product};
        return result;
    }
    public static void sayhola(String name){
        if(name.equals("바보")){
            System.out.println("바르고 고운말을 부탁드립니다.");
        }else{
            System.out.println(name+"안녕하세요");
        }
    }
}
