import java.util.Scanner;

public class _14SimpleInput {
    static int sum = 0;
    public static void main(String args[]) {
        int n;
        try(Scanner sc = new Scanner(System.in))
        {
            while(true)
            {
                n = sc.nextInt();
                CumSum(n);
                if(sum < 0)
                {
                    break;
                }else{
                    System.out.println(n);
                }
            }
        }
    }
    public static void CumSum(int n)
    {
        sum += n; 
    }
}
