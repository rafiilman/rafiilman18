import java.util.Scanner;

public class LuasJajarGenjang {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("7: ");
		double a = input.nextDouble();
		System.out.println("10: ");
		double t = input.nextDouble();
		
		double luas = a * t;
		
		System.out.println("LuasJajarGenjang: " + luas);
	}
}