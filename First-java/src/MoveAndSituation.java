import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MoveAndSituation {
    public static int[] rooms ={0,1,2,3};
    public static int[][] links = {{1,2,3},{2,3,0},{3,0,1},{0,1,2}};

    public static String BAT ="Bat";
    public static String PIT ="Pit";
    public static String WUMPUS ="Wumpus";
    public static String NOTHING="Nothing";
    public static String[] hazards = {NOTHING,BAT,PIT,WUMPUS};
    public  static int currentRoom =  0 ;
    //메서드를 분리하기위해서 멤버변수로 선언.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("지금"+ currentRoom+"번 방에 있습니다.");

            int[] nextRooms = links[currentRoom];

            System.out.println("다음 번호 중에서 이동할 방 번호를 입력해주세요");
            System.out.println(Arrays.toString(nextRooms));

            int roomNumber =scanner.nextInt();

            move(roomNumber);
        }
    }
    private static void move(int room){
        currentRoom = room;

        String hazardInRoom = hazards[currentRoom];

        if(hazardInRoom.equals(WUMPUS)){
            System.out.println("움퍼스에게 잡아먹혔습니다.");
        }
        //현재 방에 움퍼스가 있는 경우 , game over
        else if(hazardInRoom.equals(PIT)){
            System.out.println("구덩이에 빠졌습니다.");
        }
        //현재 방에 구덩이가 있는 경우 ,game over
        else if(hazardInRoom.equals(BAT)){
            Random random = new Random();
            do{
                currentRoom = random.nextInt(rooms.length); //방의 개수중 하나를 선택해서 옮겨줌
            } while (hazards[currentRoom].equals(BAT)); //만약 다시 BAT인방으로 옮겨졌을시 다시 옮겨줘야됨.

            hazards[room] =NOTHING; //박쥐가 있는 방에서 다른방으로 옮겨졌으므로 박쥐였던방은 없앤다

            while (true){
                int newBatRoom = random.nextInt(rooms.length);

                if(newBatRoom == currentRoom){
                    continue;
                }
                if(hazards[newBatRoom].equals(NOTHING)){
                    hazards[newBatRoom] = BAT;   //박쥐를 빈방으로 옮김
                    break;
                }
            }
            move(currentRoom);
        }
    }
}
