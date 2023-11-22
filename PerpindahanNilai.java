public class PerpindahanNilai {
	public static void main(String[] args) {
		int A = 30;
		int B = 41;
		int temp;
		
		System.out.println("Sebelum pertukaran:");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		
		temp = A;
		A = B;
		B = temp;
		
		System.out.println("Setelah pertukaran:");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
	}
}