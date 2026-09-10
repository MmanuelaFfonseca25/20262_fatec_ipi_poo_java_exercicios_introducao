  import java.util.Scanner;
  public class Exercicio9{
    
  public  static void main ( String [] args){
    var leitor = new Scanner(System.in);
    int opcao;
    var menu= "1-Somar\n2-Multiplicar\n0-Sair";
    do{
      System.out.println(menu);
      opcao = leitor.nextInt();
      if(opcao == 1 || opcao == 2){
        System.out.println( "Digite o valor de 1");
        var a = leitor.nextInt();
        System.out.println("Digite valor 2");
        var b = leitor.nextInt();
        if(opcao==1){ 
          System.out.printf("%d + %d = %d", a, b , a + b);
        }
        else{
          System.out.printf("%d * %d = %d", a, b , a*b);
        }
        
  
        


      }
      
    }while(opcao != 0);
   leitor.close();
  }
  }
  