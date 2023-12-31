import java.util.Scanner;

public class Exercicio23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x:");
        int x = sc.nextInt();

        System.out.println("Digite o valor de y:");
        int y = sc.nextInt();

        sc.close();

        System.out.println(x > y ? 1 : 0);
        System.out.println(x == y ? 1 : 0);
        System.out.println(x < y ? 1 : 0);
        System.out.println(x != y ? 1 : 0);
        System.out.println(x >= y ? 1 : 0);
        System.out.println(x <= y ? 1 : 0);
    }

}
