import java.util.Random;
public class Vetor {
    
    public static int[] fazerVetor(int espacos, int semente){

        int vetor[] = new int[espacos];
        Random gerador = new Random(semente);
        for (int i=0; i<espacos; i++){            
            int x = gerador.nextInt(100000);
            vetor[i] = x;            
        }
        System.out.println("Vetor feito");
        return vetor;
    }
}
