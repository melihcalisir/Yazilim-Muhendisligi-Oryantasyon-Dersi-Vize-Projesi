import java.util.Scanner;
//Girilen bir sayının faktöriyelini hesaplayan programı yazınız.
public class Faktoriyel 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int carpim = 1;
		
		for(int i=1;i<=sayi;i++) 
		{
			carpim*=i;
		}
		System.out.println("Faktoriyel degeriniz = " + carpim);
	}

}
