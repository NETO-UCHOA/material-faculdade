import java.util.Scanner;

public class MeuPrimeiroCodigoJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        sc.close();

        int numero = (int) altura; // casting

        System.out.println("Número: " + numero);
        
        System.out.printf("Olá, %s!\n", nome);
        System.out.printf("Você tem %d anos e %.2f de altura!\n", idade, altura);
    
        if (idade < 18) {
            System.out.println("Você é menor de idade!");
        } else if (idade == 18) {
            System.out.println("Agora você já pode ser preso!");
        } else {
            System.out.println("Você é maior de idade!");
        }

        // inicialização
        int contador = 0;

              // critério de parada
        while (contador < idade) {
            System.out.println(contador);

            // atualização do contador
            contador++;
        }

        for (int i = 0; i < idade; i++) {
            System.out.println(i);
        }
    
    }
    
}
