import java.util.Scanner;

public class _01SumOfEvenOddPlace
{
    public static void main(String args[]) {
        int n;
        try(Scanner sc = new Scanner(System.in)){
        n = sc.nextInt();
        }
        if(n > 0 && n < 1000000000)
        {
            int count = 1;
            int EvenSum = 0;
            int OddSum = 0;
            while(n > 0)
            {
                int rem = n % 10;
                if(count%2 != 0)
                {
                    OddSum += rem;
                }else{
                    EvenSum += rem;
                }
                count++;
                n /= 10;
            }
            System.out.println(OddSum);
            System.out.println(EvenSum);
        }
    }
}