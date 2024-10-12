import java.util.Scanner;

public class _04BinToDec {
    public static void main(String[] args) {
        int n;
        try(Scanner sc = new Scanner(System.in))
        {
            n = sc.nextInt();
            int sum = 0;
            int mul = 1;
            while(n > 0)
            {
                int rem = n % 10;
                sum = sum + rem * mul;
                mul = mul * 2;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}
