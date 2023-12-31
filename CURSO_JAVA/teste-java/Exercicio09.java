import java.util.Scanner;

public class Exercicio09 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a duração do evento em segundos:");
        int duracaoEvento = sc.nextInt();

        sc.close();

        int horas = duracaoEvento / 3600;

        int resto = duracaoEvento % 3600;

        int minutos = resto / 60;

        int segundos = resto % 60;

        System.out.printf("HH:MM:SS = %02d:%02d:%02d", horas, minutos, segundos);
    }

}
