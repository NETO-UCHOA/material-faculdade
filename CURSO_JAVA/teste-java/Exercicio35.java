public class Exercicio35 {
    
    public static void main(String[] args) {
        double numerador = 1;
        double denominador = 1;
        
        double soma = 0;

        while (numerador <= 39) {
            soma += numerador/denominador;
            numerador+=2;
            denominador*=2;
        }

        System.out.println("S = " + soma);
    }

}
