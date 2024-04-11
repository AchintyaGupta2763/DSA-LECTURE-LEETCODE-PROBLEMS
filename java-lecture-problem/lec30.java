import java.util.Scanner;

public class lec30 {
   public lec30() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();

      for(int var3 = 0; var3 < var2; ++var3) {
         for(int var4 = 0; var4 <= var3; ++var4) {
            System.out.print("*");
         }

         System.out.print("\n");
      }

   }
}