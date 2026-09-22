import java.util.Scanner;

class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter a number: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if(b == 0) {
                System.out.println("The equation has no solution.");
            } else {
                System.out.println("The equation has infinitely many solutions.");
            }
        } else {
            System.out.println("The equation has one solution:" + " x = " + (-b / a));
        }

        scanner.close();
    }
}


class SystemLinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double a1_1 = scanner.nextDouble();

        System.out.print("Enter a number: ");
        double a1_2 = scanner.nextDouble();

        System.out.print("Enter a number: ");
        double a2_1 = scanner.nextDouble();

        System.out.print("Enter a number: ");
        double a2_2 = scanner.nextDouble();

        System.out.print("Enter a number: ");
        double b1_1 = scanner.nextDouble();

        System.out.print("Enter a number: ");
        double b1_2 = scanner.nextDouble();

        double determinant = a1_1 * a2_2 - a1_2 * a2_1;
        double determinantX = b1_1 * a2_2 - b1_2 * a1_2;
        double determinantY = a1_1 * b1_2 - a2_1 * b1_1;
        
        double x = determinantX / determinant;
        double y = determinantY / determinant;
        if (determinant == 0) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println("The equation has one solution:" + " x = " + x + ", y = " + y);
        }
        scanner.close();
    }
}

class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter a number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter a number: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("The equation has no real solutions.");
        } else if (discriminant == 0) {
            System.out.println("The equation has one real solution:" + " x = " + (-b / (2 * a)));
        } else {
            double k = Math.sqrt(discriminant);
            System.out.println("The equation has two real solutions:" + " x1 = " + (-b + k) / (2 * a) + ", x2 = " + (-b - k) / (2 * a));
        }
        scanner.close();
    }
}
        