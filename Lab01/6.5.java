import java.util.Scanner;

class Main {
   public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    int[] arr = new int[5];
    System.out.println("Enter elements of the array:");
    for (int i = 0; i < 5; i++){
        arr[i] = scanner.nextInt();
    }
     
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    int sum = 0;
    for (int i = 0; i < 5; i++){
        sum += arr[i];
    }

    double average = sum/5;

    System.out.println("The sum of all elements in array is: " + sum);
    System.out.println("The average value of the array is: " + average);

    scanner.close();
   } 
}
