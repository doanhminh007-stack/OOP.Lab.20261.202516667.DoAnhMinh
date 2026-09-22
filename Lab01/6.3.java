import java.util.Scanner;

class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(n - 1 - i) + "*".repeat(2 * i + 1));
        }
    }
}
