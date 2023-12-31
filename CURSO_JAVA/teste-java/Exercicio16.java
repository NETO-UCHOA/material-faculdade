import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a população do país A:");
        double popA = sc.nextDouble();

        System.out.println("Digite a população do país B:");
        double popB = sc.nextDouble();

        sc.close();

        if (popA > popB) {
            System.out.println("População do país A já é maior que a de B!");
            return;
        } 
        
        int numAnos = 0;

        while (popA <= popB) {
            popA = 1.03*popA;
            popB = 1.015*popB;
            numAnos++;
        }
        
        System.out.println(numAnos + " anos.");
    }

}
