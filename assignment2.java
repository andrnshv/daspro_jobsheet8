import java.util.Scanner;

public class assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         while (true) {
            System.out.print("Enter the name of Polytechnic (or type 'exit' to stop): ");
            String polytechnic = sc.nextLine();

            if (polytechnic.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Name of Polytechnic: " + polytechnic);

            System.out.println("Sport: Badminton");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Athlete " + j + ", name: ");
                String name = sc.nextLine();
            }
            System.out.println("Sport: Table Tennis");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Athlete " + j + ", name: ");
                String name = sc.nextLine();
            }
            System.out.println("Sport: Basketball");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Athlete " + j + ", name: ");
                String name = sc.nextLine();
            }
            System.out.println("Sport: Volleyball");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Athlete " + j + ", name: ");
                String name = sc.nextLine();
            }
            System.out.println();
        }
        sc.close();
    }
}
