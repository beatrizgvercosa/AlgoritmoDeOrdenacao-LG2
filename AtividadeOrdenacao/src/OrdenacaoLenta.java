public class OrdenacaoLenta {

   //BLUBLE SORT*********************************
       
        public static int[] bubleSort(int[] v) 
        {
          
          for(int i = 0; i < v.length - 1; i++)
           {
            for(int j = 0; j < v.length - 1 - i; j++)
             {
              if(v[j] > v[j + 1]) {
                int aux = v[j];
                v[j] = v[j + 1];
                v[j + 1] = aux;
              }
            }
          }
          return v;
        }

//SELECTION SORT*********************************

        public static int[] selectionSort(int[] v){  
          for (int i = 0; i < v.length - 1; i++)  
          {  
              int comparado = i;  
              for (int j = i + 1; j < v.length; j++){  
                  if (v[j] < v[comparado]){  
                      comparado = j; 
                  }  
              }  
              int menorNumero = v[comparado];   
              v[comparado] = v[i];  
              v[i] = menorNumero;  
          }
          return v;  
      } 

//INSERCTION SORT*********************************

      public static int[] inserctionSort(int v[])
      {
          int n = v.length;
          for (int i = 1; i < n; ++i) {
              int key = v[i];
              int j = i - 1; 
             
              while (j >= 0 && v[j] > key) {
                  v[j + 1] = v[j];
                  j = j - 1;
              }
              v[j + 1] = key;
          }
          return v;
      }

       


      }