import java.util.Scanner;

public class _03PrintReverse {
    public static void main(String[] args) {
        int n;
        try(Scanner sc = new Scanner(System.in))
        {
            n = sc.nextInt();
        }
        System.out.println(ReverseNum(n));
    }

    public static int ReverseNum(int n)
    {
        int num = 0;
        while(n > 0)
        {
            int rem = n % 10;
            num = num * 10 + rem;
            n /= 10;
        }
        return num;
    }
}
