import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args){

        String[] opcoesTamanho = {"10.000", "30.000", "90.000", "270.000", "810.000", "2.430.000", "65.610.000"};
        int escolhaTamanho = JOptionPane.showOptionDialog(null, "Qual o tamanho do array?", "Escolha um botão.", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesTamanho, opcoesTamanho[0]);
        int tamanhoArray=0;
        escolhaTamanho+=1;
        switch (escolhaTamanho) {
            case 1: 
            tamanhoArray=10000;
            break;
            case 2:
            tamanhoArray=30000;
            break;
            case 3:
            tamanhoArray=90000;
            break;
            case 4:
            tamanhoArray=270000;
            break;
            case 5:
            tamanhoArray=810000;
            break;
            case 6:
            tamanhoArray=2430000;
            break;
            case 7:
            tamanhoArray=65610000;
            break;
        }

        String[] opcoesSemente = {"13", "21", "34", "55", "89", "144"};
        int escolhaSemente = JOptionPane.showOptionDialog(null, "Qual semente para criação do array?", "Escolha um botão.", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesSemente, opcoesSemente[0]);
       int semente=0;
       escolhaSemente +=1;
        switch (escolhaSemente) {
            case 1: 
            semente=13;            
            break;
            case 2:
            semente=21;           
            break;
            case 3:
            semente=34;
            break;
            case 4:
            semente=55;
            break;
            case 5:
            semente=89;
            break;
            case 6:
            semente=144;
            break;            
        }
        int vetor[] = Vetor.fazerVetor(tamanhoArray, semente);

        String[] opcoesSort = {"BubleSort", "SelectionSort", "InsertionSort", "ShellSort", "MergeSort", "QuickSort"};
        int escolhaSort = JOptionPane.showOptionDialog(null, "Como você quer organizar este array?", "Escolha um botão.", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesSort, opcoesSort[0]);
        escolhaSort += 1;

        long tempoInicial = System.currentTimeMillis();

        switch (escolhaSort){
            case 1: vetor = OrdenacaoLenta.bubleSort(vetor);            
            case 2: vetor =OrdenacaoLenta.selectionSort(vetor);             
            case 3: vetor = OrdenacaoLenta.inserctionSort(vetor); break;
            case 4: vetor = OrdenacaoRapida.shellSort(vetor); break;
            case 5: vetor = OrdenacaoRapida.mergeSort(vetor); break;
            case 6: vetor = OrdenacaoRapida.quickSort(vetor); break;
        }    
        
        long tempo = System.currentTimeMillis() - tempoInicial;
        



       

        System.out.println("O programa ordenou em " + tempo+" milissegundos");


       int escolhaExibir = JOptionPane.showConfirmDialog(null, "Você quer exibir o vetor ordenado?");
        if (escolhaExibir == 0){       
            for (int i=0; i<=vetor.length-1;i++)
            {
            System.out.println(vetor[i]);
        }
    }
    else
    System.out.println ("Programa finalizado");

    }
}