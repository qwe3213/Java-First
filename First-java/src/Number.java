public class Number {
    public static void main(String[] args) {
        byte byteInteger = 10;
        short shortInteger=20;
        int intInteger = 30;
        long longInteger = 40;

         int sum = byteInteger+shortInteger; // byte 나 short 로 설정해두면 오류가난다.
         int sum2 = shortInteger+intInteger;
         long sum3 = intInteger+longInteger; // long타입이 들어가있을 경우에는 long으로 정해주어야된다.
    }
}
