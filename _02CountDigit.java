import java.util.Scanner;

public class _02CountDigit {
    public static void main(String args[]) {
        int n;
        int digit;
        try(Scanner sc = new Scanner(System.in))
        {
            n = sc.nextInt();
            digit = sc.nextInt();
        }
        System.out.println(CountDig(n , digit));
    }
    public static int CountDig(int n, int digit) {
        int count = 0;
        while(n > 0)
        {
            int rem = n % 10;
            if(rem == digit)
            {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
