import java.util.Scanner;
//Gidilen km verisine göre taksimetre tutarını hesaplayan porgramı yazınız.
//Taksimetrenin açılış ücreti 10 tldir.
//Taksimetrede km başına 8.5 tl alınacaktır.
//40 tl altındaki ücretler için yine 40 tl alınacaktır.
public class Taksimetre 
{
	public static void main(String[]args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("km verisini giriniz");
		double km = scan.nextDouble();
		
		double price = 10 + km*8.5;
		
		if(price<40) price = 40;
		
		System.out.println("Taksimetre tutarı = " + price);
		
		
	}

}
