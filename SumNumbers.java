import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumNumbers = 0;

        for (int i = 1; i <= n ; i ++) {
            int number = Integer.parseInt(scanner.nextLine());
            sumNumbers += number;
        }
        System.out.println(sumNumbers);
    }
}
