package app.src.main.eda;
import java.util.Scanner;
public class index2Recursivo {
    
    public static void mergeSort(int[] arr) {
        if (arr == null) {
            return;
        }
        if (arr.length > 1) {
            int mid = arr.length / 2;
            
            // Divide o array em duas metades
            int[] left = new int[mid];
            for (int i = 0; i < mid; i++) {
                left[i] = arr[i];
            }
            
            int[] right = new int[arr.length - mid];
            for (int i = mid; i < arr.length; i++) {
                right[i - mid] = arr[i];
            }
            
            // Ordena cada metade recursivamente
            mergeSort(left);
            mergeSort(right);
            
            // Combina as duas metades ordenadas
            merge(arr, left, right);
        }
    }
    
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        System.out.println("Quantidade de elementos na lista: ");
        Scanner ler = new Scanner(System.in);
        
        int quantidadeNumeros = ler.nextInt();

        int[] lista = new int[quantidadeNumeros];

        System.out.println("Digite os elementos da lista: ");
        for (int i = 0; i < quantidadeNumeros; i++) {
            lista[i] = ler.nextInt();

        }
        
        mergeSort(lista);
        System.out.println("Array ordenado:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}
