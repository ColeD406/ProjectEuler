import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by ColeDoty on December 2, 2016.
 */
public class Euler2 {

    public static void main(String[] args) {
        Euler2 m = new Euler2();
        System.out.print("Generate fibonacci numbers up to how many times: ");
        Scanner in = new Scanner(System.in);
        int z = in.nextInt();
        m.findNum(z);
    }

    public void findNum(int oNum) {
        int[] array = new int[oNum];
        int a = 1;
        int b = 0;

        for (int i = 0; i < oNum; i++) {
            if (a < 4000000) {
                a = a + b;
                b = a - b;
                if (a % 2 == 0) {
                    array[i] = a;
                    int sum = IntStream.of(array).sum();
                    System.out.println("Iterations: " + i + "          Sum of Evens " + sum);
                }
            } else {
                return;
            }
        }
    }
}
