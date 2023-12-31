import java.util.Scanner;

public class Lista1E22 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o consumo em m³: ");
        int consumo = teclado.nextInt();

        teclado.close();

        double custoTotal = 0;
        double franquia = 10; // Franquia inclusa na assinatura

        if (consumo <= franquia) {
            custoTotal = 7; // Valor da assinatura
        } else if (consumo <= 30) {
            custoTotal = 7 + (consumo - franquia) * 1;
        } else if (consumo <= 100) {
            custoTotal = 7 + (30 - franquia) * 1 + (consumo - 30) * 2;
        } else {
            custoTotal = 7 + (30 - franquia) * 1 + (100 - 30) * 2 + (consumo - 100) * 5;
        }

        System.out.println(custoTotal);


        }
        

    }
}
