package app.src.main.eda;

public class QuickSort {
    public static void quickSort(int[] lista, int menor, int maior) {
        if (menor < maior) {
            int pivo = partition(lista, menor, maior);
            quickSort(lista, menor, pivo - 1);
            quickSort(lista, pivo + 1, maior);
        }
    }

    public static int partition(int[] lista, int menor, int maior) {
        int x = lista[menor];
        int i = maior + 1;
        for (int j = maior; j > menor; j--) {
            if (lista[j] >= x) {
                i--;
                //int[] lista = {8, 2, 4, 9, 5, 7};
                int temp = lista[i];
                lista[i] = lista[j];
                lista[j] = temp;
            }
        }
        int temp = lista[i - 1];
        lista[i - 1] = lista[menor];
        lista[menor] = temp;
        return i - 1;
    }

    public static void main(String[] args) {
        int[] lista = {8, 2, 4, 9, 5, 7};
        int tamanho = lista.length;

        quickSort(lista, 0, tamanho - 1);

        System.out.println("Array Ordenado:");
        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}
