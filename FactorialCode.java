import java.util.Scanner;

public class FactorialCode {
     public static void main(String[] args) {
          Scanner inangka = new Scanner(System.in);

          System.out.println("\n======================\nFACTORIAL CALCULATION\n======================");
          while(true){
          System.out.println("Masukan angka anda");
          int num = inangka.nextInt();
         int a = 1;

          if(num == 0){
               System.out.println("\nPerkalian faktorial dari "+num+" adalah: 1" );
               System.out.println("Hasil perkalian faktorial dari "+num+" adalah: 1\n");
               break;
          }else{
            
               for(int i = 1; i <= num; i++){
                    a = a * i;
               }

               System.out.println("\nPerkalian faktorial dari " + num + " adalah: ");


               for(int j = num; j >= 1 ; j--){
               System.out.print(j);
               if (j != 1){
                    System.out.print("x");
               }
          }

               System.out.println("\nPerkalian faktorial dari "+ num + " adalah: "+a+"\n");
               
          }
     }
}
}
