package HesapMak;
import java.util.Scanner;
public class Main {
	static int sum(int a, int b) {
		return a + b;
	}
	static int sub(int a, int b) {
		return a - b;
	}
	static int multip(int a,int b) {
		return a * b ;
	}
	static int div(int a, int b) {
		return a / b;
	}
	 
		
	
	static int Alan(int a,int b) {
		return a * b ;
	}
	static int cevre(int a, int b) {
		return 2* (a + b);
	}
	static int power(int a,int b) {
		int result= 1;
		for(int i = 1; i<= b;i++) {
			result *= a;
		}
		return result;
	}
	static int mod(int a,int b) {
		return a%b;
	}

	public static void main(String[] args) {
		
		Scanner index = new Scanner(System.in);
		int select;
		int a,b;
		
		String menu = "1- Toplama Islemi\n"
					+ "2- Cikarma Islemi\n"
					+ "3- Carpma Islemi\n"
					+ "4- Bolme Islemi\n"
					+ "5 Uslu sayi hesabı\n"
					+ "6- Mod Alma\n"
					+ "7- Dikdortgen Alan ve Cevre Hesabi\n"
					+ "8- Cikis";
		
			System.out.println(menu);
			System.out.print("Yapmak istediginiz islemi seciniz : ");
			select = index.nextInt();
			
			System.out.print("lutfen bir sayi giriniz : ");
			a = index.nextInt();
			
			System.out.print("lutfen ikinci bir sayi giriniz : ");
			b = index.nextInt();
			
			switch(select) {
				case 1:
					System.out.print("Toplama sonucu : " + sum(a,b));
					break;
				case 2:
					System.out.print("Cikarma Sonucu : " + sub(a,b));
					break;
				case 3: 
					System.out.print("Carpma sonucu : " + multip(a,b));
					break;
				case 4:
					System.out.print("Bolme sonucu : " + div(a,b));
					break;
				case 5:
					System.out.print("Us alma sonucu : " + power(a,b));
					break;
				case 6:
					System.out.print("Mod alma sonucu : " + mod(a,b));
					break;
				case 7:
					System.out.print("Dikdoortgenin Alani : " + Alan(a,b) + "Dikdortgenin cevresi : " + cevre(a,b));
					break;
				case 8:
					System.out.print("Cikis Yapildi");
					break;
				
				
			}
			
			
		
				
				
			
	}

}
