import java.util.Scanner;

public class Num_10950 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();

        for (int B = 0; B < A; B++) {
            int C = scan.nextInt();
            int D = scan.nextInt();
            System.out.println(C + D);
        }
        scan.close();


    }
}
