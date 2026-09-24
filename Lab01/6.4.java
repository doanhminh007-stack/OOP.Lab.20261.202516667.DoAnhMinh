import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        String month = scanner.nextLine().toLowerCase();


        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        switch (month) {
            case "january", "jan.", "jan", "1", "march", "mar.", "mar", "3", "may", "5", "july", "jul.", "jul", "7", "august", 
            "aug.", "aug", "8", "october", "oct.", "oct", "10", "december", "dec.", "dec", "12":
                System.out.println("31");
                break;
            case "february", "feb.", "feb", "2":
                if (isLeapYear) {
                    System.out.println("29"); // February in a leap year
                } else {
                    System.out.println("28"); // Simplified for non-leap years
                }
                break;
            case "april", "apr.", "apr", "4", "june", "jun.", "jun", "6", "september", "sep.", "sep", "9", "november", "nov.", "nov", "11":
                System.out.println("30");
                break;

            default:
                System.out.println("Invalid month name.");
        }
    }
    
}
