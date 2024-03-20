package app.src.main.eda;

public class CountingSort {
    public static void countingSort(int[] arr) {
        // Determinar o range dos elementos
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            //{4, 2, 2, 8, 3, 3, 1};
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int range = max - min + 1;
        
        // Criar o array de contagem e inicializá-lo com zeros
        int[] count = new int[range];
        
        // Contar as ocorrências de cada elemento
        for (int num : arr) {
            count[num - min]++;
        }
        
        // Modificar o array de contagem para conter as posições corretas
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }
        
        // Criar o array de saída
        int[] output = new int[arr.length];
        
        // Preencher o array de saída na ordem correta
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        
        // Copiar o array ordenado para o array original
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        
        // Exibir o array ordenado
        System.out.print("Array ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
