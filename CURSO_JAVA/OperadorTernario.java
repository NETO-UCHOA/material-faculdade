import java.util.Scanner;

public class OperadorTernario {

    public static void main( String[] args){

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Idade: ");
        long idade = sc.nextInt();
        double ValorIngresso;
        
        
        if( idade <18) {

            ValorIngresso = 200;

        } else {ValorIngresso = 400;
        }



        ValorIngresso = (idade <18) ? 200 : 400;

        System.out.println("valor do ingresso: "+ ValorIngresso);


    }



}
