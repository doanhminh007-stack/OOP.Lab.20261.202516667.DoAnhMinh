import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        System.out.print("Enter a number: ");
        double number2 = scanner.nextDouble();
        
        System.out.println("The sum is: " + (number + number2));
        System.out.println("The difference is: " + (number - number2));
        System.out.println("The product is: " + (number * number2));
        System.out.println("The quotient is: " + (number / number2));
        
        scanner.close();
    }

}
