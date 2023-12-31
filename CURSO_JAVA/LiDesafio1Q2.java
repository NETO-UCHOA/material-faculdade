import java.util.Scanner;

public class LiDesafio1Q2 {
    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o  valor de n: ");
        double n = teclado.nextDouble();
        double denuminador = 1;
        double numerador = n;
        double a = 0;

        while(denuminador <=n){

            a += numerador/denuminador;
            numerador --;
            denuminador ++;
        }

        System.out.println(a);
        

        teclado.close();

    }
}
