import java.util.Scanner;
// Vize notunun %40'ını , final notunun %60'ını alarak ortalama notu hesaplayan porgramı yazınız.
public class Ort 
{
	public static void main(String[] args) 
	{
		int vize,fnl;
		float ortalama;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vize :");
		vize = scan.nextInt();
		
		System.out.println("Final");
		fnl = scan.nextInt();
		
		ortalama = (float)(vize*0.4 + fnl*0.6);
		
		System.out.println("Ortalamanız = " + ortalama);
	}

}
