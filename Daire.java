import java.util.Scanner;
//Yarıçap değeri girilen bir dairenin alan ve çevresini bulunuz.
public class Daire 
{
	public static void main(String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dairenin yaricap degerini giriniz");
		int r = scan.nextInt();
		
		double alan = Math.PI * r*r;
		double cevre = 2* Math.PI *r;
		
		System.out.println("Dairenin alanı = " + alan);
		System.out.println("Dairenin cevresi = " + cevre);
	}

}
