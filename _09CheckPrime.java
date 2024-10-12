import java.util.Scanner;

public class _09CheckPrime {
    public static void main(String[] args) {
        int n;
        int count = 0;
        try(Scanner sc = new Scanner(System.in))
        {
            n = sc.nextInt();
            for(int i = 2; i < n;i++)
            {
                if(n % i == 0)
                {
                    count++;
                    break;
                }
            }   
            if(count > 0)
            {
                System.out.println("Not Prime");
            }else{
                System.out.println("Prime");
            }
        }
    }
}
