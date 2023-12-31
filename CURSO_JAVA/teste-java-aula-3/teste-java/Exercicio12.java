import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo do animal:");
        String tipo = sc.nextLine();

        System.out.println("Digite a espécie:");
        String especie = sc.nextLine();

        System.out.println("Digite do que esse animal se alimenta:");
        String alimento = sc.nextLine();

        sc.close();

        if (tipo.equalsIgnoreCase("vertebrado")) {
            if (especie.equalsIgnoreCase("ave")) {
                if (alimento.equalsIgnoreCase("carnivoro")) {
                    System.out.println("Águia");
                } else if (alimento.equalsIgnoreCase("onivoro")) {
                    System.out.println("Pomba");
                } else {
                    System.out.println("Alimento inválido!");
                }
            } else if (especie.equalsIgnoreCase("mamifero")) {
                if (alimento.equalsIgnoreCase("herbivoro")) {
                    System.out.println("Vaca");
                } else if (alimento.equalsIgnoreCase("onivoro")) {
                    System.out.println("Homem");
                } else {
                    System.out.println("Alimento inválido!");
                }
            } else {
                System.out.println("Espécie inválida!");
            }
        } else if (tipo.equalsIgnoreCase("invertebrado")) {
            if (especie.equalsIgnoreCase("inseto")) {
                if (alimento.equalsIgnoreCase("hematofago")) {
                    System.out.println("Pulga");
                } else if (alimento.equalsIgnoreCase("herbivoro")) {
                    System.out.println("Lagarta");
                } else {
                    System.out.println("Alimento inválido!");
                }
            } else if (especie.equalsIgnoreCase("anelideo")) {
                if (alimento.equalsIgnoreCase("hematofago")) {
                    System.out.println("Sanguessuga");
                } else if (alimento.equalsIgnoreCase("onivoro")) {
                    System.out.println("Minhoca");
                } else {
                    System.out.println("Alimento inválido!");
                }
            } else {
                System.out.println("Espécie inválida!");
            }
        } else {
            System.out.println("Tipo inválido!");
        }
    }

}
