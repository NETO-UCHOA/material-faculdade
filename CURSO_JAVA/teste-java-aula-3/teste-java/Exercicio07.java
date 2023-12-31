import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em reais:");
        int n = sc.nextInt();

        sc.close();

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        int resto = n;

        for (int i = 0; i < cedulas.length; i++) {
            int numNotas = resto / cedulas[i];
            resto = resto % cedulas[i];
            System.out.printf("%d nota(s) de R$ %d\n", numNotas, cedulas[i]);
        }

    }

}
