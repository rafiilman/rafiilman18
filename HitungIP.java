import java.util.Scanner;

public class HitungIP {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("80: ");
		double nilaimatkul1 = input.nextDouble();
		
		System.out.println("85: ");
		double nilaimatkul2 = input.nextDouble();
		
		System.out.println("75: ");
		double nilaimatkul3 = input.nextDouble();
		
		System.out.println("70: ");
		double nilaimatkul4 = input.nextDouble();
		
		double total = nilaimatkul1 + nilaimatkul2 + nilaimatkul3 + nilaimatkul4;
		double IP = total / 4.0;
		
		System.out.println("4.0: " + IP);
	}
}