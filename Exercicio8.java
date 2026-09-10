import javax.swing.JOptionPane;
public class Exercicio8{
static void main (String [] args){
    int numero = Integer.parseInt(
        JOptionPane.showInputDialog("Digite um inteiro"));
        StringBuilder tabuada = new StringBuilder();
        for(int i=1;i<= 10;i++){
            //7x1 =7
            //7x2=14
            tabuada
            .append(numero)
            .append("X")
             .append( i)
            .append("=")
            .append(numero * i)
                .append("\n");

        }
        javax.swing.JOptionPane.showConfirmDialog(null,tabuada.toString(),"Tabuada",JOptionPane.INFORMATION_MESSAGE);
    }
}


    

