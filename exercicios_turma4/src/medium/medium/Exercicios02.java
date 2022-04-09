package medium;

import javax.swing.JOptionPane;

public class Exercicios02 {
    public static void main(String[] args) {
       double valorInvestimento, taxaJuros = 0.05, valorJuros, i = 1, valorTotal;
       valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("valor do investimento"));
       valorTotal =  valorInvestimento;

       while (i<+10) {
           valorTotal = (valorTotal*taxaJuros) + valorInvestimento;
           i++;           
       }
       valorJuros = valorTotal - valorInvestimento;

       System.out.println("você investiu:" +valorInvestimento);
       System.out.println("Rendeu:" +valorJuros + "de Juros");
       System.out.println("O valor total são :" +valorTotal);




    }
    
}
