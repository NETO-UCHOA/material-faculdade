import java.util.Scanner;

public class Exercicio15b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número (menor que 46):");
        int numero = sc.nextInt();

        sc.close();

        if (numero < 46) {
            int atual = 0;
            int proxima = 1;

            while (atual < numero) {
                System.out.print(atual + " ");

                int aux = atual;
                atual = proxima;
                proxima = aux + atual;
            }
        } else {
            System.out.println("Número inválido! Tente novamente.");
        }

    }

}
