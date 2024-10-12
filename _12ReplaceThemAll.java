import java.util.Scanner;

public class _12ReplaceThemAll {
    public static void main(String args[]) {
        long n;
        try(Scanner sc = new Scanner(System.in)){
            n = sc.nextLong();
        }
        System.out.println(Replace(n));
    }
    public static long Replace(long n)
    {
        long sum = 0;
        int pow = 0;
        if(n == 0)
        {
            return 5;
        }
        while(n > 0)
        {
            int rem = (int)(n % 10);
            if(rem == 0)
            {
                rem = 5;
            }
            sum += rem * Math.pow(10, pow);
            pow++;
            n /= 10;
        }
        return sum;
    }
}
