import java.util.Scanner;

public class assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input N value (min. 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.print("minimal N value must be 3");
            return;
        }

        for(int i = 0; i < N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();

        for (int i=0; i<N-2; i++) {
            System.out.print(N + " ");
            for (int j=0; j<N-2; j++) {
                System.out.print("  ");
            }
            System.out.println(N);
        }

        for (int i=0;i< N; i++) {
            System.out.print(N + " ");
        }
        System.out.println();

        sc.close();
    }
}