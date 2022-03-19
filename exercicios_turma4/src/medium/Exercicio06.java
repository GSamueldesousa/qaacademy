package medium;

public class Exercicio06 {
    public static void main(String[] args) {
         int fatorial=5,i;
         i = fatorial;
     while (i>1) {
         fatorial= fatorial * (i-1);
         i--;
         
     }
     System.out.println("o fatorial do número digitado é   "  + fatorial);
       
    }
    
}