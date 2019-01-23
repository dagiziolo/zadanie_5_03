import java.util.Scanner;

public class RoomTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Room room1 = new Room(25, true);
        System.out.println("Podaj temperaturę pokoju");
        room1.setTemperature(scan.nextInt());

        System.out.println(room1.decrease());
//        System.out.println(room1.getTemperature()); do sprawdzeń na testach

    }
}
