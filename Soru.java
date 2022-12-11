import java.util.Scanner;
//{Kullanıcıdan alınan 3 sayıdan en büyüğünü bulan programı yazınız.
public class Soru
{
	public static void main(String []args) 
	{
		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. sayi");
		a = scan.nextInt();
		
		System.out.println("2. sayi");
		b = scan.nextInt();
		
		System.out.println("3. sayi");
		c = scan.nextInt();
		
		if(a>b && a>c) System.out.println("en buyuk sayi = " + a);
		else if(b>a && b>c) System.out.println("en buyuk sayi= " + b);
		else if(c>a && c>b) System.out.println("en buyuk sayi = " + c);
		
		
	}

}
