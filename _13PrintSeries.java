import java.util.Scanner;

public class _13PrintSeries {
    public static void main(String args[]) {
        int n1 , n2;
        try(Scanner sc = new Scanner(System.in))
        {
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        }
        PrintSeries(n1, n2);
    }

    public static void PrintSeries(int n1  , int n2)
    {
        int i = 1, j= 1;
        while(j <= n1)
        {
            int x = 3*i+2;
            if(x % n2 != 0)
            {
                System.out.println(x);
                j++;
            }
            i++;
        }
    }
}
