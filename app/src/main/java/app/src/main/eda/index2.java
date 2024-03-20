package app.src.main.eda;
import java.util.Scanner;
public class index2 {

    public static void bubbleSort(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j+1]) {
                    int temp = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Quantidade de elementos na lista: ");
        Scanner ler = new Scanner(System.in);
        
        int quantidadeNumeros = ler.nextInt();

        int[] lista = new int[quantidadeNumeros];
        

        for (int i=0; i < quantidadeNumeros; i++) {
            System.out.println("Número " + (i + 1) + ":");
            lista[i] = ler.nextInt();
        }

        bubbleSort(lista);

        for (int i = 0; i < lista.length; i++) {
            System.out.println();
            System.out.print(lista[i] + " ");
        }

    }
}