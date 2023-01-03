import java.util.Random;

public class function {
    public static void main(String[] args) {
        Random random = new Random(); // random() 실행
        int randomNumber = random.nextInt(256); //256 밑의 숫자 랜덤하게 설정
        //System.out.println(randomNumber);
        System.out.println("지금 무슨 생각을 하고있는지 맞춰보겠습니다.");
        try{
            Thread.sleep(3000); //3초 설정
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("치킨"); // 3초뒤
    }
}
