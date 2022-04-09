package medium;

public class Exercicios07 {
    public static void main(String[] args) {

        int [] vetorFibonacci;
        vetorFibonacci = new int [10];

        int i = 2;

        vetorFibonacci [0] = 0;
        vetorFibonacci [1] = 1;

        while (i<=9) {
            
            vetorFibonacci [1] = vetorFibonacci [i=1] + vetorFibonacci [ i-2];
            
            i++;
        
        }

        i= 0;

        while (i<=9) {

            System.out.println(vetorFibonacci [i]);

            i++;
            
        }



    }
}
