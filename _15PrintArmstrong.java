import java.util.Scanner;

public class _15PrintArmstrong {
    public static void main(String args[]) {
        // Your Code Here
        int n,secNum;
        try(Scanner sc = new Scanner(System.in))
        {
            n = sc.nextInt();
            secNum = sc.nextInt();
        }

        for(int i = n; i <= secNum; i++)
        {
            if(i == ArmStrongNum(i))
            {
                System.out.println(i);
            }
        }
    }
    public static int ArmStrongNum(int n)
    {
        int sum = 0;
        int count = Count(n);
        while(n >0)
        {
            int rem = n % 10;
            sum += Math.pow(rem, count);
            n /= 10;
        }
        return sum;
    }

    public static int Count(int n)
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
