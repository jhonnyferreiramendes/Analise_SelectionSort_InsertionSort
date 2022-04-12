/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeordenacao;

import java.util.Arrays;

/*static public void insertion(int[] vetor) {
        int x, j;
        for (int i = 1; i < vetor.length; i++) {
            x = vetor[i];
            j = i - 1;
            while ((j >= 0) && vetor[j] > x) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
                vetor[j + 1] = x;
            }
             */

public class AnaliseAssintotica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int vetorA[] = {1,5,7,8,9}; //melhor caso
       int vetorB[] = {9,8,7,5,1}; //pior caso
       int vetorC[] = {5,7,6,9,1}; //caso médio
                      
       System.out.println("************* INSERTION SORT *****************");
       
       Metodos.insertionAnalise(vetorA);
       System.out.println("Melhor caso: {1,5,7,8,9} ");
       System.out.println("Resultado: Vetor A  melhor caso: " + Arrays.toString(vetorA));
       System.out.println("--------------------------------------------------------------");
       
       Metodos.insertionAnalise(vetorB);
       System.out.println("Pior caso: {9,8,7,5,1} ");
       System.out.println("Resultado: Vetor B: pior caso: " + Arrays.toString(vetorB));
       System.out.println("--------------------------------------------------------------");
       
       Metodos.insertionAnalise(vetorC);
       System.out.println("Caso médio: {5,7,6,9,1} ");
       System.out.println("Resultado: Vetor C: caso médio: " + Arrays.toString(vetorC));
       System.out.println("--------------------------------------------------------------");
       
       System.out.println("***************************************************************");
        System.out.println("--------------------------------------------------------------");
       
       System.out.println("************* SELECTION SORT *****************");
       
       Metodos.selectionAnalise(vetorA);
       System.out.println("Melhor caso: {1,5,7,8,9} ");
       System.out.println("Resultado: Vetor A melhor caso: " + Arrays.toString(vetorA));
       System.out.println("--------------------------------------------------------------");
       
       Metodos.selectionAnalise(vetorB);
       System.out.println("Pior caso: {9,8,7,5,1} ");
       System.out.println("Resultado: Vetor B: pior caso: " + Arrays.toString(vetorB));
       System.out.println("--------------------------------------------------------------");
       
       Metodos.selectionAnalise(vetorC);
       System.out.println("Caso médio: {5,7,6,9,1} ");
       System.out.println("Resultado: Vetor C: caso médio: " + Arrays.toString(vetorC));
       System.out.println("--------------------------------------------------------------"); 
    }
    
}
