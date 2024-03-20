package app.src.main.eda;
// public class TesteOrdenacao {
//     public static void insertionSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 1; i < n; ++i) {
//             int key = arr[i];        
//             int j = i - 1; //j sempre sera um valor abaixo de i;
//             //int[] arr = {1,12,5,3,2};
//             while (j >= 0 && arr[j] < key) {
//                 arr[j + 1] = arr[j];
//                 j--;
//                 // Imprime a saída toda vez que o loop while for executado
//                 System.out.println("Iteração do while:");
//                 for (int k = 0; k < arr.length; ++k)
//                     System.out.print(arr[k] + " ");
//                 System.out.println(); // Nova linha para separar as iterações
//             }
//             arr[j + 1] = key;
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,12,5,3,2};
//         insertionSort(arr);
//         System.out.println("Array ordenado:");
//         for (int i = 0; i < arr.length; ++i)
//             System.out.print(arr[i] + " ");

//     }
// }

// public class TesteOrdenacao {
//     public static void bubbleSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] < arr[j + 1]) {
//                     // Troca os elementos se estiverem na ordem errada
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     //int[] arr = {15,8,10,7,9};
//                     System.out.println("Iteração do while:");
//                     for (int k = 0; k < arr.length; ++k) 
//                         System.out.print(arr[k] + " ");

//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {15,8,10,7,9};
//         System.out.println("Array antes da ordenação:");
//         printArray(arr);

//         bubbleSort(arr);

//         System.out.println("\nArray após a ordenação:");
//         printArray(arr);
//     }

//     // Função auxiliar para imprimir um array
//     public static void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }


// public class TesteOrdenacao {
    
//     public static void selectionSort(int[] arr) {
//         int n = arr.length;
//         // Percorre todos os elementos do array
//         for (int i = 0; i < n - 1; i++) {
//             // Encontra o índice do menor elemento restante
//             int Index = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[Index] > arr[j]) {
//                     Index = j;
//                     //int[] arr = {1,2,3,10,5};
//                 }
//             }
//             // Troca o menor elemento encontrado com o elemento na posição atual
//             int temp = arr[Index];
//             arr[Index] = arr[i];
//             arr[i] = temp;
//             System.out.println();
//             for (int k = 0; k < arr.length; ++k) 
//                 System.out.print(arr[k] + " ");

//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1,2,7,10,5};
//         selectionSort(arr);
//         System.out.println("Array ordenado:");
//         for (int i = 0; i < arr.length; ++i)
//             System.out.print(arr[i] + " ");
//     }
// }

import java.util.Arrays;

public class TesteOrdenacao {
    
    public static int[] mergesort(int[] a) {
        if (a.length == 1) 
            return a;
        
        int middle = a.length / 2;
        int[] l1 = Arrays.copyOfRange(a, 0, middle);

        int[] l2 = Arrays.copyOfRange(a, middle, a.length);
        
        System.out.println("Metade a esqueda: " + Arrays.toString(l1));
        int[] sorted_l1 = mergesort(l1);
        System.out.println("Metade a direita: " + Arrays.toString(l2));
        int[] sorted_l2 = mergesort(l2);
        
        return merge(sorted_l1, sorted_l2);
    }

    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                c[k++] = b[j++];
            } else {
                c[k++] = a[i++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }

        System.out.println("Merged array: " + Arrays.toString(c));
        return c;
    }

    public static void main(String[] args) {
        int[] arr = {1,11,13,5,6,7,8,9};
        
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        arr = mergesort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
