import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        int numero3 = sc.nextInt();

        sc.close();

        // busca pelo maior número
        int maior = retornarMaiorNumero(numero1, numero2, numero3);

        System.out.println("MAIOR = " + maior);

        // busca pelo menor número
        int menor = retornarMenorNumero(numero1, numero2, numero3);

        System.out.println("MENOR = " + menor);
    }

    public static int retornarMenorNumero(int num1, int num2, int num3) {
        int menor = num1;

        if (num2 < num1) {
            menor = num2;
        }

        if (num3 < num2 && num3 < num1) {
            menor = num3;
        }

        return menor;
    }

    public static int retornarMaiorNumero(int num1, int num2, int num3) {
        int maior = num1;

        if (num2 > num1) {
            maior = num2;
        }

        if (num3 > num2 && num3 > num1) {
            maior = num3;
        }

        return maior;
    }

}
