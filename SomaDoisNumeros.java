import javax.swing.JOptionPane;
public class SomaDoisNumeros
{
   public static void main(String[] args)
   {
      int n1=Integer.parseInt(JOptionPane.showInputDialog("\nDigite um n�mero inteiro:"));
      int n2=Integer.parseInt(JOptionPane.showInputDialog("\nDigite o segundo n�mero inteiro:"));
      
      int soma=n1+n2;
      
      if(soma>10)
      {
         JOptionPane.showMessageDialog(null,"\nResultado:"+soma,"Resposta:",JOptionPane.PLAIN_MESSAGE);
      }
   }
      
}