package easy;
import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        double nota1,nota2,media;

        nota1=Integer.parseInt(JOptionPane.showInputDialog("nota1"));
        nota2=Integer.parseInt(JOptionPane.showInputDialog("nota2"));

        media= (nota1+nota2)/2;

        if (media>5){
            System.out.println ("Aprovado");

        }
        
    
    
    if (media<5){ 
        System.out.println("Reprovado");
    }
    if (media==5) { 
        System.out.println("Exame");
    }

    }
}