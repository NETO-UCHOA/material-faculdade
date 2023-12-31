import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o consumo de água em m³:");
        int consumo = sc.nextInt();         // 120

        sc.close();

        int valorPagar = 7;

        int diferenca = 0;

        if (consumo > 100) {
            diferenca = consumo - 100;      // 20
            valorPagar += diferenca * 5;
            consumo -= diferenca;           // 120 - 20 = 100
        }

        if (consumo > 30 && consumo <= 100) {
            diferenca = consumo - 30;       // 100 - 30 = 70
            valorPagar += diferenca * 2;
            consumo -= diferenca;           // 100 - 70 = 30
        }

        if (consumo > 10 && consumo <= 30) {
            diferenca = consumo - 10;       // 30 - 10 = 20 m3
            valorPagar += diferenca * 1;
            consumo -= diferenca;           // 30 - 20 = 10 m3
        }

        System.out.println("Valor a pagar: R$ " + valorPagar);
    }
}