import java.util.*;

public class series{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int value = 0;
        int increment = 2;
        int used = 0;

        for (int i = 0; i < n; i++) {

            System.out.print(value + " ");

            value += increment;
            used++;

            if (increment == 2) {       // first increment only once
                increment = 6;
                used = 0;
            } else if (used == 2) {     // next increments twice
                increment += 4;
                used = 0;
            }
        }
    }
}