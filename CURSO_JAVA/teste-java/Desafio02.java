import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N:");
        int n = sc.nextInt();

        sc.close();

        double numerador = n;
        double denominador = 1;

        double soma = 0;

        while (numerador >= 1) {
            soma += numerador / denominador;
            numerador--;
            denominador++;
        }

        // while (denominador <= n) {
        //     soma += numerador / denominador;
        //     numerador--;
        //     denominador++;
        // }

        System.out.println("A = " + soma);
    }

}
