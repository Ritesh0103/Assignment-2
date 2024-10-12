import java.util.Scanner;

public class _10GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int Dividend = sc.nextInt();
		int Divisor = sc.nextInt();
		
		while(Dividend % Divisor != 0)
		{
			int rem = Dividend % Divisor;
			Dividend = Divisor;
			Divisor = rem;
		}
		System.out.println(Divisor);
		sc.close();
    }
}
