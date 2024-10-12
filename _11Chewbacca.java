import java.util.Scanner;

public class _11Chewbacca {
    public static void main(String args[]) {
        long n;
        try(Scanner sc = new Scanner(System.in))
        {
            n = sc.nextLong();
        }
        System.out.println(Chewbacca(n));
    }

        public static long Chewbacca(long n)
    {
        long sum = 0;
        long pow = 0;
        int count = Count(n);
        while(n > 0)
        {
            long rem = n % 10;
            if(pow != count-1 && rem >= 5)
            {
                rem = 9-rem;
            }else if(pow == count-1 && rem != 9 && rem >= 5)
            {
                rem = 9-rem;
            }
            sum += rem*Math.pow(10 , pow);
            pow++;
            n /= 10;
        }
        return sum;
    }
    public static int Count(long n)
    {
        int count = 0;
        while(n > 0)
        {
            count++;
            n /= 10;
        }
        return count;
    }
}
