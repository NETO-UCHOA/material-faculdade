import java.util.Scanner;

public class Lista1E31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        

        System.out.println("Digite a primeira Nota: ");
        float nota1 = teclado.nextFloat();
        do {
            if (nota1 <0 || nota1>10){
                System.out.println("Nota invalida");
            }
            System.out.println("Digite a segunda nota");
        }while(nota1 <0|| nota1 >10);

        System.out.println("Digite a primeira Nota: ");
        float nota2 = teclado.nextFloat();
        do {
            if (nota2 <0 || nota2>10){
                System.out.println("Nota invalida");
            }
            System.out.println("Digite a segunda nota");
        }while(nota2 <0|| nota2 >10);

        teclado.close();
        System.out.printf("a media entre a nota %d e a nota %d é: %d",nota1, nota2,(nota1 + nota2)/2);
    
    
    
        
    
    
    }
}
