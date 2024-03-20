// import java.util.ArrayList;

// public class index {
//     public static void main(String[] args) {
//         ArrayList<Object> listaGenerica = new ArrayList<Object>();
//         // object em java é um tipo que possui todos os outros tipos

//         listaGenerica.add(10);
//         listaGenerica.add("isaac");
//         listaGenerica.add(3.14);
//         listaGenerica.add(true);

//         int contador = 4;

//         for (Object elements : listaGenerica) {
//             System.out.println("índice: " + contador + " Elemento: " + elements);
//             contador--;
//         }
//     }
// }
// import java.util.Arrays;

// public class index {

//     public static void reverseArray(int[] A, int i, int j) {
//         if (i < j) {
//             int temp = A[i];
//             A[i] = A[j];
//             A[j] = temp;

//             System.out.println("Array após troca: " + Arrays.toString(A));

//             reverseArray(A, i + 1, j - 1);
//         }
//     }

//     public static void main(String[] args) {
//         int[] array = {14, 9, 2, 8, 5, 10};
//         int i = 0;
//         int j = array.length - 1;

//         System.out.println("Array original: " + Arrays.toString(array));

//         reverseArray(array, i, j);

//         System.out.println("Array invertido: " + Arrays.toString(array));
//     }
// }

// public class index {

//     public static int LinearSum(int[] A, int n) {
//         if (n == 1) {
//             return A[0];
//         }
//         return LinearSum(A, n-1) + A[n-1];
//     }


//     public static void main(String[] args) {
//         int[] A = {4,5,12,1,4};
//         int n = A.length;

//         int result = LinearSum(A, n);
//         System.out.println("Array: ");
//         for (int i=0; i < n; i++) {
//             System.out.print("{"+A[i] +"}");
        
//         }
//         System.out.println();
//         System.out.println("Soma linear:" + result);
//     }
// }


