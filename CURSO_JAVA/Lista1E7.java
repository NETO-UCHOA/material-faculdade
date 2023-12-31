import java.util.Scanner;

public class Lista1E7 {
    
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor: ");
int n = sc.nextInt();



sc.close();


int numeroNotas100 = n /100;
int resto100 = n % 100;



System.out.printf("notas de 100:\n" + numeroNotas100);
System.out.printf("\nresta:\n" + resto100);

}





}
