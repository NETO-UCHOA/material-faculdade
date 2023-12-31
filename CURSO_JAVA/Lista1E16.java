import java.util.Scanner;


public class Lista1E16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a população  A: ");
        double popA = sc.nextDouble();

         System.out.println("digite a população BA: ");
        double popB = sc.nextDouble();

        sc.close();

        if (popA > popB) {
            System.out.println("Pop  A ja é maior que  pop B");
            
            return;
        }

        
        int numeroAnos = 0;

        while (popA <= popB){

            popA = 1.03*popA;
            popB = 1.015*popB;
            numeroAnos++;

        }

        System.out.println(numeroAnos);


    }



    
}
