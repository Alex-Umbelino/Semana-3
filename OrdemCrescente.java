///Algoritmo para deixar em modo crescente.

import javax.swing.*;

public class OrdemCrescente
{
   public static void main ( String args [] ) 
   {
      int a [] = new int [3];
      int n = a.length;
      int b [] = new int [n];
      int m = 0;
      int i;

      // Uma ordenação por seleção:
      int j,jMax,aux;
      
      for(i=0;i<n;i=i+1)
      {
         a[i]=Integer.parseInt(JOptionPane.showInputDialog("\nDigite o "+(i+1)+" número inteiro:"));
      
      }
      
      

      // cópia
      for(i=0;i<n;i++)
      {
        b[i]=a[i];
      }
      	
      
		m=n;
      

      for(i=n-1;i>0;i=i-1)
      {
      	jMax=0;
         for(j=1;j<=i;j=j+1)
         {
         	if(b[j]>b[jMax])
            {
              jMax=j;
            }
            	
           aux=b[i];
           b[i]=b[jMax];
           b[jMax]=aux;
         }     
      }

      String saida = "Resposta:\n";

      for (i = 0; i < m; i=i+1)
      {
         saida = saida + b[i] + " ";
      }
         

      JOptionPane.showMessageDialog(null,saida,"Ordem Crescente:", JOptionPane.PLAIN_MESSAGE);

      System.exit (0);
   }
}

