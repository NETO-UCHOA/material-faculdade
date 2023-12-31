import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do vendedor:");
        String nome = sc.nextLine();

        System.out.println("Digite o salário fixo dele:");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite o total de vendas:");
        double totalVendas = sc.nextDouble();

        sc.close();

        double totalReceber = salarioFixo + 0.15 * totalVendas;

        System.out.printf("%s deve receber o total de R$ %.2f", nome, totalReceber);
    }

}