import java.util.Scanner;

public class _20IsArmstrong {
    public static void main(String args[]) {
        int n;
        try(Scanner sc = new Scanner(System.in))
        {
            n = sc.nextInt();
        }

        if(n == ArmStrongNum(n))
        {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
				
    }
    public static int ArmStrongNum(int n)
    {
        int sum = 0;
        int count = count(n);
        while(n > 0)
        {
            int rem = n % 10;
            sum += Math.pow(rem, count);
            n /= 10;
        }
        return sum;
    }

    public static int count(int n)
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
