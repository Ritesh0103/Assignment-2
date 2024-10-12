import java.util.Scanner;

public class _17Boston {
    public static void main(String args[]) {
        long n;
        try(Scanner sc = new Scanner(System.in))
        {
            n = sc.nextLong();
        }
        if(Sum(n) == BosSum(n))
        {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

        public static long BosSum(long n)
    {
        long sum = 0;
        for(int i = 2; i < Math.sqrt(n); i++)
        {
            while(n%i == 0)
            {
                sum += Sum(i);
                n/=i;
            }
        }

        if(n > 1)
        {
            sum += Sum(n);
        }
        return sum;
    }

    public static long Sum(long n)
    {
        long sum = 0;
        while(n > 0)
        {
            int rem = (int)n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
}
