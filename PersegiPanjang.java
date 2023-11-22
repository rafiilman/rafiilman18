import java.util.Scanner;

public class PersegiPanjang {
	public static void main(String[] args) {
		double panjang;
		double lebar;
		double luas;
		double keliling;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Input panjang: ");
		panjang = sc.nextDouble(); 
		System.out.println("Input lebar: ");
		lebar = sc.nextDouble(); 
		
		luas = panjang * lebar;
		keliling = (panjang + lebar) * 2;
		
		System.out.println("luas persegi panjang: " + luas);
		System.out.println("keliling persegi panjang: " + keliling);
	
		sc.close();
	}
}