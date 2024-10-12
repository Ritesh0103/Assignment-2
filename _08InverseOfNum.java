import java.util.Scanner;

public class _08InverseOfNum {
    public static void main(String[] args) {
        int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int sum = 0;
		int place = 1;
		while(n > 0)
		{
			int rem = n % 10;
			sum += place * Math.pow(10 , rem -1);
			n /= 10;
			place++;
		}
		System.out.println(sum);
        sc.close();
    }
}
