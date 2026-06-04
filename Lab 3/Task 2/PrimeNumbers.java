import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int start = sc.nextInt();
        System.out.print("Enter the Last number: ");
        int end = sc.nextInt();

        ArrayList<Integer> primeList = new ArrayList<>();
        int[] primeNumbers = new int[end - start + 1];
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeNumbers[count] = i;
                primeList.add(i);
                count++;
            }
        }

        System.out.printf("Total prime numbers between %d - %d = %d\n" , start, end, count);
        System.out.println("This is from ArrayList: ");
        for (int i: primeList) {
            System.out.printf("%d ", i);
        }

        System.out.println("\nThis is from Array:");
        for (int j = 0; j < count; j++) {
            System.out.print(primeNumbers[j] + " ");
        }
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false; 
        for (int i = 3; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}