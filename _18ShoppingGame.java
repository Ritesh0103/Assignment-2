import java.util.Scanner;

public class _18ShoppingGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int m = sc.nextInt(); // Ayush
			int n = sc.nextInt(); // Harshit
			int ayush = 0;
			int harshit = 0;
			int phone = 1;
			
			while(true)
			{
				ayush += phone;
				if(ayush > m)
				{
					System.out.println("Harshit");
					break;
				}
				phone++;
				harshit += phone;
				if(harshit > n)
				{
					System.out.println("Aayush");
					break;
				}
				phone++;
			}
			t--;
		}
		sc.close();
    }
}
