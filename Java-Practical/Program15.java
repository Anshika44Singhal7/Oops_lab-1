import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        int a = n % 10;
        n = n / 10;

        int b = n % 10;
        n = n / 10;

        int c = n % 10;

        sum = (a * a * a) + (b * b * b) + (c * c * c);

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
} 

