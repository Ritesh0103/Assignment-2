import java.util.Scanner;

public class _19OddEvenBackInDelhi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            int carno = sc.nextInt();
            if(BackInDelhi(carno) == true)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            t--;
        }
        sc.close();
    }

    public static boolean BackInDelhi(int carno)
    {
        int evenSum = 0;
        int OddSum = 0;
        while(carno > 0)
        {
            int rem = carno % 10;
            if(rem % 2 == 0)
            {
                evenSum += rem;
            }else{
                OddSum += rem;
            }
            carno /= 10;
        }
        if(evenSum  % 4 == 0 || OddSum % 3 == 0)
        {
            return true;
        }else{
            return false;
        }
    }
}
