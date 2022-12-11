import java.util.Scanner;

// n'den m'ye kadar olan sayılardan 7'ye tam bölünenleri bulunuz.
public class Bolen 
{
	public static void main(String[]args) 
	{
		int i,n,m;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("baslangic sayisi:");
		n = scan.nextInt();
		
		System.out.println("bitis sayisi:");
		m = scan.nextInt();
		
		for(i=n;i<m;i++) 
		{
			if(i%7==0) System.out.print(i + "  ");
		}
	}

}
