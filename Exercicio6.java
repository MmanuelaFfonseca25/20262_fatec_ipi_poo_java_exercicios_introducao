
import java.util.Scanner;
public class Exercicio6{
public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um valor de 1 a 7");
    //função de inpspeção
    int numero = leitor.nextInt();

    switch(numero){
        case 1: System.out.println("Segunda");
        case 2: System.out.println("Terça-feira");
        case 3: System.out.println("Quarta-feira");
        case 4: System.out.println("Quinta-feira");
        case 5: System.out.println("Sexta-feira");
        default: System.out.println("Opção invalida");
    
    }
     System.out.println("Até mais");
     leitor.close();

}
}