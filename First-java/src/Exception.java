public class Exception {
    public static void main(String[] args)  {


        /*
         *  예외 처리의 위임(전달)
         *   - 예외가 발생한 곳에서 try - catch 블록으로 직접 처리할 수 있지만
         *   자신이 직접 처리하지 않고 , 메서드가 호출한 곳으로 예외 위임 가능
         *   - throws 키워드를 사용
         *   - 예외 처리를 위임받은 메서드는 다시 예외처리에 대한 책임이 발생하며
         *   직접 처리하거나 또 다른 곳으로 위임 가능
         *   - 최종적으로 마지막 단계의 메서드에서는 try ~ catch 블록을 사용하여
         *   예외를 직접 처리해야함 (ex. main () 메서드)
         *   - throws 키워드를 사용하여 지정하는 예외는 1 개 또는 복수개 지정 가능
         *
         *   <예외 위임 기본 문법 >
         *   - 메서드 정의시 메서드 선언부 마지막에 throws 키워드를 쓰고
         *   뒤에 예외를 위임할 클래스명을 기술(복수개일 경우 콤마로 구분)
         *   [접근제한자] 리턴타입 메서드명([파라미터...]) throws 예외클래스명..
         *     // 예외가 발생하는 코드...
         */

// 팀장으로부터 위임받았을때, 현재 메서드가 사장(main()) 일 경우
// 더 이상 위임할 수 있는 곳이 없음. (문법적으로 throws Exception 로 해결 가능)
// => 따라서, 최종적으로 사장이 모든 예외를 처리해야 한다!

        try {
            팀장();
        } catch (Exception e) {
            System.out.println("사장이 모든 예외를 처리!");
        }



    }
    public static void 팀장() throws Exception{
// 1. 대리로 부터 위임받은 예외를 직접 처리하는 경우
//    try {
//      대리();
//    } catch (ClassNotFoundException e) {
//      e.printStackTrace();
//    } catch (RuntimeException e) {
//      e.printStackTrace();
//    }


// 2. 팀장이 위임받은 예외를 사장에게 위임하는 경우
// => RuntimeException, ClassNotFoundException 을 명시하거나
// Exception 타입으로 위임 가능
        대리();



    }

    public static void 대리() throws RuntimeException, ClassNotFoundException{
// 사원, 사원2 로부터 3개의 예외를 위임받아 처리할 때
// 1. 위임받은 대리가 직접 처리하는 경우
//
//    try {
//      사원();
//      사원2();
//    } catch (ClassNotFoundException e) {
//      System.out.println("대리가 사원의 ClassNotFoundException 예외 직접 처리");
//      e.printStackTrace();
//    } catch(ArithmeticException e) {
//       System.out.println("대리가 사원의 ArithmeticException 예외 직접 처리");
//
//    } catch(NullPointerException e) {
//      System.out.println("대리가 사원의 NullPointerException 예외 직접 처리");
//    }
//
// 2. 예외를 위임받은 대리도 팀장에게 위임하는 경우
// => 발생 가능성이 있는 예외 클래스를 모두 throws 키워드 뒤에 명시
// => 모든 클래스를 따로 명시하거나, 상위 타입으로 결합하여 명시 가능
        사원();   // ArithmeticException , NullPointerException
        사원2(); //  ClassNotFoundException

    }
    public static void 사원() throws ArithmeticException , NullPointerException{
// 예외 처리 방법
// 1. 예외가 발생한 곳에서 try ~ catch 로 직접 예외 처리
        try {
            System.out.println("사원에서 예외 발생");
            System.out.println(3/0);
        } catch (Exception e) {
            System.out.println("사원이 직접 예외 처리 !");
        }


        // 2. 메서드 호출한 곳으로 throws 키워드로 예외를 위임
        // -> 현재 사원() 메서드를 호출한 곳 (대리())으로 예외를 던짐
        // => 사원() 메서드를 선언부 마지막에 throws 키워드를 쓰고
        //   throws 뒤에 예외 클래스를 1개 또는 복수개 명시
        System.out.println("사원에서 예외 발생 ! ");
        System.out.println(3 / 0);

        String str = null;
        System.out.println(str.length());



    }
    public static void 사원2() throws ClassNotFoundException{
        System.out.println("사원2에서 예외 발생!");
        Class.forName(""); // ClassNotFoundException 발생하는 코드
// => Compile Checked Exception 이므로 예외 처리가 필수! (오류로 표시됨)
    }
}
