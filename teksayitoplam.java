import java.util.Scanner;
//1'den n'ye kadar olan sayılardan tek olanların toplamını bulunuz.
public class teksayitoplam 
{
	public static void main(String[]args) 
	{
		int i,toplam,n;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz");
		n = scan.nextInt();
		
		toplam = 0;
		for(i=1;i<n;i++) 
		{
			if(i%2==1) toplam += i;			
		}
		System.out.println("1-n tek sayılar toplamı = " + toplam);
	}

}
