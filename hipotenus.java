import java.util.Scanner;
//Bir üçgenin hipotenüsünü bulan programı yazınız.
public class hipotenus 
{
	public static void main(String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1. kenari giriniz");
		int a = scan.nextInt();
		
		System.out.print("2. kenari giriniz");
		int b = scan.nextInt();
		
		double c = Math.sqrt(a*a + b*b);
		
		System.out.println("Hipotenüs : " + c);	
		
	}

}
