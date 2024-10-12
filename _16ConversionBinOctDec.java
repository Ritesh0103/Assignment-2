import java.util.Scanner;

public class _16ConversionBinOctDec {
    public static void main(String args[]) {
        int sb , db , sn;
        try(Scanner sc = new Scanner(System.in))
        {
            sb = sc.nextInt();
            db = sc.nextInt();
            sn = sc.nextInt();
        }
        System.out.println(Convert(sb, db, sn));
    }
    public static int Convert(int sb , int db , int sn)
    {
        if(sb != 10)
        {
            sn = Convert_to_tens(sb ,10 , sn);
            sb = 10;
        }
        int sum = 0;
        int mul = 1;
        while(sn > 0)
        {
            int rem = sn % db;
            sum += rem * mul;
            mul *= sb;
            sn /= db;
        }
        return sum;
    }
    public static int Convert_to_tens(int sb ,int db ,  int sn)
    {
        int sum = 0;
        int mul = 1;
        while(sn > 0)
        {
            int rem = sn % db;
            sum += rem * mul;
            mul *= sb;
            sn /= db;
        }
        return sum;
    }
}
