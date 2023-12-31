import java.util.Scanner;

public class Lista1E23 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o  valor de x: ");
        int x = teclado.nextInt();

        System.out.println("Digite Y: ");
        int y = teclado.nextInt();

        System.out.println(x>y ? 1:0);//operador ternário
        System.out.println(x==y ? 1:0);
        System.out.println(x<y ? 1:0);
        System.out.println(x!=y ? 1:0);
        System.out.println(x>=y ? 1:0);
        System.out.println(x<=y ? 1:0);
    
        



        teclado.close();
    }
}
