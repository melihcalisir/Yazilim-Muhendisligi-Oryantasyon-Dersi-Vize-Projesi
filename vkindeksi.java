import java.util.Scanner;
//Vücut kitle indeksini hesaplayan programı yazınız.
public class vkindeksi 
{
	public static void main(String []args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz");
		double boy = scan.nextDouble();
		
		System.out.print("Lutfen kilonuzu giriniz");
		double kilo = scan.nextDouble();
		
		double indeks = kilo / (boy*boy);
		System.out.println("Vucut kitle indeksiniz = " + indeks);
		
		
		
	}

}
