import java.util.Scanner;

public class Kalkulator {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double angka1, angka2;
      String operator;

      System.out.print("Masukkan angka pertama: ");
      angka1 = input.nextDouble();
      System.out.print("Masukkan angka kedua: ");
      angka2 = input.nextDouble();
      System.out.print("Masukkan operator (+, -, *, /): ");
      operator = input.next();

      if (operator.equals("+")) {
         System.out.println(angka1 + angka2);
      } else if (operator.equals("-")) {
         System.out.println(angka1 - angka2);
      } else if (operator.equals("*")) {
         System.out.println(angka1 * angka2);
      } else if (operator.equals("/")) {
         System.out.println(angka1 / angka2);
      } else {
         System.out.println("Operator tidak valid");
      }
   }
}
