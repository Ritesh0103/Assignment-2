import java.util.Scanner;

public class _07ConvFtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minFah = sc.nextInt();
        int maxFah = sc.nextInt();
        int interval = sc.nextInt();
        for(int i = minFah ; i <= maxFah ; i+=interval)
        {
            int Cel = 0;
            Cel = (int)((i - 32)*(5.0/9)); 
            System.out.println(i+" "+Cel);
        }
        sc.close();
    }
}
