package xox;
import java.util.Scanner;

public class Test 
{
	public static char alan[][] = new char[4][4];
	public static void main(String[] args) 
	{
		Scanner klavye = new Scanner(System.in);
		oyunAlanı o1 = new oyunAlanı();
		o1.alanYazBaslangic(Test.alan);
		Oyuncu_X oX = new Oyuncu_X();
		Oyuncu_O oO = new Oyuncu_O();
		
		
		while(true)
		{
		int oyuncuSira = 1;
		int x,y;
		System.out.print(oyuncuSira + ". oyuncunun oynayacağı x koordinatı giriniz : ");
		x = klavye.nextInt();
		System.out.print(oyuncuSira + ".oyuncunun oynayacağı y koordinatı giriniz :");
		y = klavye.nextInt();
		
		oX.oyna(x, y, Test.alan);
		o1.yaz(alan);
		if(oX.donguBreak == 1)
			break;
		oyuncuSira++;
		
		System.out.print(oyuncuSira + ". oyuncunun oynayacağı x koordinatı giriniz : ");
		x = klavye.nextInt();
		System.out.print(oyuncuSira + ".oyuncunun oynayacağı y koordinatı giriniz :");
		y = klavye.nextInt();
		
		oO.oyna(x, y, Test.alan);
		o1.yaz(Test.alan);
		if(oO.donguBreak == 1)
			break;
		}
	}

}
