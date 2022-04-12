/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeordenacao;

/**
 *
 * @author Jhonny
 */
public class Metodos {

    static int cont1 = 0;
    static int cont2 = 0;
    static int a = 0;
    static int c = 0;
    static int p = 0;

    static public void insertion(int[] vetor) {
        int x; 
        for (int i = 1; i < vetor.length; i++) {
            x = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > x) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
                
            }
            vetor[j + 1] = x;
        }

    }

     static public void insertionAnalise(int[] vetor) {
        int x, j;
        for (int i = 1; i < vetor.length; i++) {
            c++; a++;a++; // uma atribuição, uma soma aritimetica em I e uma comparação com o tamnho do vetor
            x = vetor[i];
            p++; a++; // um acesso ao ponteiro vetor[i] e uma atribuição a x
            j = i - 1;
            a++;a++; // uma atribuição a j e uma decrementação aritimetica
            cont1 ++; // quantidade de vezes que o laço de repetição do for esta sendo executado
            while (j >= 0 && vetor[j] > x) {
                c++;c++;p++; // duas comparações e um acesso ao ponteiro
                vetor[j + 1] = vetor[j];
                p++; p++; a++; //dois acesso aos ponteiros e uma atribuição 
                j = j - 1;
                a++; a++; // uma atribuição e uma operação aritimetica 
                vetor[j + 1] = x;
                a++; p++; // um acesso ao ponteiro e uma atribuição
                cont2++; // quantidade de vezes que o laço de repetição "while" esta sendo executado 
                
              

            }
        }
        System.out.println("Quantidade de operações aritméticas e atribuições de valores a uma variavel: " + a + "\nQuantidade de comparações : "+ c + "\nQuantidade de vezes em que o ponteiro foi acessado " +p + "\nQuantidade de vezes em que o laço FOR foi executado: " +cont1 +"\nQuantidade de vezes em que o laço WHILE foi executado: " +cont2);
         a = 0; c = 0; p = 0; cont1 = 0; cont2 = 0;
    }

    static public void selection(int[] vetor) {
        int aux, j;
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
            for ( j = i + 1; j < vetor.length; j++) {
                if(vetor[j] < vetor[menor]){
                    menor = j;
                }
                aux = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = aux; 
            }
        }
    }
    
     static public void selectionAnalise(int[] vetor) {
        int aux, j;
        for (int i = 0; i < vetor.length; i++) {
            c++; a++; a++; // uma comparação, uma atribuição e uma soma aritimetica em I 
            int menor = i; 
            a++; // uma atribuição  
            cont1++; //Quantidade de vezes em que o primeiro laço FOR esta sendo executado 
            for ( j = i + 1; j < vetor.length; j++) {
                a++; a++; c++;a++; a++; // uma atribuição e uma operação de soma aritimetica em J, uma comparação com o tamanho do vetor, e mais uma atribuição e mais uma soma aritimetica em J denovo
                cont2++; //Quantidade de vezes em que o segundo laço FOR esta sendo executado
                p++; c++; p++; // dois acessos ao ponteiro e uma comparação no IF
                if(vetor[j] < vetor[menor] ){
                    menor = j;
                    a ++; //uma atribuição 
                    
                }
                aux = vetor[i];
                a++; p++; //uma atribuição e um acesso ao ponteiro
                vetor[i] = vetor[menor];
                p++; a++; p++; // dois acessos ao ponteiro e uma atribuição
                vetor[menor] = aux; 
                p++; a++; // um acesso ao ponteiro e uma atribuição 
            }
        }
        System.out.println("Quantidade de operações aritméticas e atribuições de valores a uma variavel: " + a + "\nQuantidade de comparações : "+ c + "\nQuantidade de vezes em que o ponteiro foi acessado " +p + "\nQuantidade de vezes em que o primero laço FOR foi executado: " +cont1 +"\nQuantidade de vezes em que o segundo laço FOR foi executado: " +cont2);
        a = 0; c = 0; p = 0; cont1 =0; cont2 = 0;
    }
}
