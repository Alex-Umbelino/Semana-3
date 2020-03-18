import javax.swing.JOptionPane;
public class RaizOuQuadrado
{
   public static void main(String[ ] args)
   {
      double numero,saida;
      numero=Double.parseDouble(JOptionPane.showInputDialog("Digte um número:"));
      
      if (numero>0)
      { saida=Math.pow(numero,0.5);
        
        JOptionPane.showMessageDialog(null,"Resultado: "+numero+" temos: "+saida,"Resposta:",JOptionPane.PLAIN_MESSAGE);
      }
      else
      {
       saida=Math.pow(numero,2);
       
       JOptionPane.showMessageDialog(null,"Resultado: "+numero+" temos: "+saida,"Resposta:",JOptionPane.PLAIN_MESSAGE);
      }
   }
}