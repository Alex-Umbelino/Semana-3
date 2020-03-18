import javax.swing.JOptionPane;
public class SomaMenos5
{
   public static void main(String[] args)
   {
      double n1,n2;
      n1=Double.parseDouble(JOptionPane.showInputDialog("\nDigite um número inteiro:"));
      n2=Double.parseDouble(JOptionPane.showInputDialog("\nDigite o segundo número inteiro:"));
      
      double soma=n1+n2;
      
      if(soma<=20)
      { soma=soma-5;
         JOptionPane.showMessageDialog(null,"\nResultado:"+soma,"Resposta:",JOptionPane.PLAIN_MESSAGE);
      }
   }
      
}