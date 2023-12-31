import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;

        try {
            do {
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("NOTA INVÁLIDA!");
                }
                System.out.println("Digite a primeira nota:");
                nota1 = sc.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            do {
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("NOTA INVÁLIDA!");
                }
                System.out.println("Digite a segunda nota:");
                nota2 = sc.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            sc.close();

            double media = (nota1 + nota2) / 2;

            System.out.printf("MÉDIA = %.2f", media);
        } catch (InputMismatchException exception) {
            System.out.println("ENTRADA NÃO BATE COM O ESPERADO (UM NÚMERO)!");
        }
    }

}
