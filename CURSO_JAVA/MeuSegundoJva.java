import java.util.Scanner;

public class MeuSegundoJva {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
         System.out.println("Idade: ");
        long idade = sc.nextInt();
         System.out.println("Altura: ");
        double altura = sc.nextDouble();

        sc.close();
        
        System.out.println("Ola, "+nome);
        System.out.println("Você tem "+ idade);
        System.out.printf("você tem %d anos \n", idade);
        System.out.printf("você tem %.2d de altura\n", altura);

        if(idade > 18);{

            System.out.println("Você é maior de idade");
        }



    }

}

    

