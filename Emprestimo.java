import javax.swing.JOptionPane;
public class Emprestimo
{
   public static void main(String[] args)
   {
      double  salario,salariop;
      
      salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario bruto:"));
      salariop=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario desejado:"));
      
      JOptionPane.showMessageDialog(null, salariop <= salario*0.3?"Sim,emprestimo concedido" : "Não,emprestimo não concedido");
   }
}