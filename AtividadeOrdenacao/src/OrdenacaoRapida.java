public class OrdenacaoRapida {
    
    //SHELL SORT ************************************
   
    public static int[] shellSort(int v[]) {
        int n = v.length;
    
        for (int j = n / 2; j > 0; j /= 2) {
            for (int i = j; i < n; i++) {
                int key = v[i];
                int x = i;
                while (x >= j && v[x - j] > key) {
                    v[x] = v[x - j];
                    x -= j;
                }
                v[x] = key;
            }
        }
        return v;
    }

    //MERGE SORT ************************************

    public static int[] mergeSort(int[] v) {        
        int elementos = 1;        
        int inicio, meio, fim;
        
        
        while(elementos < v.length) {
          
          inicio = 0;
          
         
          while(inicio + elementos < v.length) {
           
            meio = inicio + elementos;
            
            fim = inicio + 2 * elementos;
            
            
            if(fim > v.length)
              fim = v.length;
            
           
            intercala(v, inicio, meio, fim);
            
          
            inicio = fim;
          }
          
         
          elementos = elementos * 2;
        }
        return v;
      }



      //método para MergeSort
      private static void intercala(int[] vetor, int inicio, int meio, int fim) {
        
        int novoVetor[] = new int[fim - inicio];
       
        int i = inicio;
       
        int m = meio;
     
        int pos = 0;
        
       
        while(i < meio && m < fim) {
          
          if(vetor[i] <= vetor[m]) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        
          } else {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
          }
        }
        
      
        while(i < meio) {
          novoVetor[pos] = vetor[i];
          pos = pos + 1;
          i = i + 1;
        }
        
      
        while(m < fim) {
          novoVetor[pos] = vetor[m];
          pos = pos + 1;
          m = m + 1;
        }        
      
        for(pos = 0, i = inicio; i < fim; i++, pos++) {
          vetor[i] = novoVetor[pos];
        }
      }

//MERGE SORT ************************************
public static int[] quickSort(int[] vetor) {
    vetor = ordenacaoquicksort(vetor, 0, vetor.length - 1);
    return vetor;

}
private static int[] ordenacaoquicksort(int[] vetor, int inicio, int fim) {
    if(fim > inicio) {
      
      int indexPivo = dividir(vetor, inicio, fim);     
      ordenacaoquicksort(vetor, inicio, indexPivo - 1);      
      ordenacaoquicksort(vetor, indexPivo + 1, fim);
      
    }
    return vetor;
  }


  private static int dividir(int[] vetor, int inicio, int fim) {
    int pivo, pontEsq, pontDir = fim;
    pontEsq = inicio + 1;
    pivo = vetor[inicio];

    while(pontEsq <= pontDir) {
     
      while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
        pontEsq++;
      }

      
      while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
        pontDir--;
      }
      
      if(pontEsq < pontDir) {
        trocar(vetor, pontDir, pontEsq);
        pontEsq++;
        pontDir--;
      }
    }

    trocar(vetor, inicio, pontDir);
    return pontDir;
  }

  private static void trocar(int[] vetor, int i, int j) {
    int temp = vetor[i];
    vetor[i] = vetor[j];
    vetor[j] = temp;
  }
}
    