import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a renda do homem:");
        double rendaHomem = sc.nextDouble();

        System.out.println("Digite a renda da mulher:");
        double rendaMulher = sc.nextDouble();

        sc.close();

        double rendaConjunta = rendaHomem + rendaMulher;

        double aliquota;

        if (rendaConjunta <= 900) {
            aliquota = 0;
        } else if (rendaConjunta > 900 && rendaConjunta <= 1500) {
            aliquota = 0.10;
        } else if (rendaConjunta > 1500 && rendaConjunta <= 2500) {
            aliquota = 0.15;
        } else {
            aliquota = 0.25;
        }

        double imposto = rendaConjunta * aliquota;

        double rendaLiquida = rendaConjunta - imposto;

        System.out.println("RENDA CONJUNTA: " + rendaConjunta);
        System.out.printf("ALÍQUOTA: %d%%\n", (int) (aliquota*100));
        System.out.println("IMPOSTO: " + imposto);
        System.out.println("RENDA LÍQUIDA: " + rendaLiquida);

    }

}
