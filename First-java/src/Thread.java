public class Thread {

    public static void main(String[] args) {
        NoThread nt1 = new NoThread("★A작업★", 100000);
        NoThread nt2 = new NoThread("※B작업※", 500000);
        NoThread nt3 = new NoThread("＃C작업＃", 1000000);

        nt1.run();
//–   A작업이 100만번 실행이 끝나면 ...
        nt2.run();
        nt3.run();

    }

}

class NoThread {
    String name;
    int count;

    public NoThread(String name, int count) {
        super();
        this.name = name;
        this.count = count;
    }

    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(name + " : " + i);
        }

    }
}
