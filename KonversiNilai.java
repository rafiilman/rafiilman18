import java.util.Scanner;
  
class KonversiNilai {
  public static void main(String args[]){
      
    char nilai;
    Scanner input = new Scanner(System.in);
      
    System.out.print("Input Nilai Anda = ");
    nilai = input.next().charAt(0);
      
    if (nilai == '4' ) {
      System.out.println("A");
    }
    else if (nilai == '3' ) {
      System.out.println("B");
    }
    else if (nilai == '2' ) {
      System.out.println("C");
    }
    else if (nilai == '1' ) {
      System.out.println("D");
    }
    else if (nilai == '0' ) {
      System.out.println("E");
    }
    else {
      System.out.println("Maaf, konversi nilai tidak diketahui");
    }
     
  }
}