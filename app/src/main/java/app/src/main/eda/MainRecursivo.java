package app.src.main.eda;
import java.util.Scanner;

public class MainRecursivo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        if (ehPrimo(num, 1, 0) == 2) {
            System.out.println("Eh Primo");
        } else {
            System.out.println("Nao Eh Primo");
        }
}

    public static int totalDivisor( int num, int divisor) {
        if (divisor > num) {
            return 0;
        }
        if (num % divisor == 0 ) {
            return 1 + totalDivisor(num, divisor + 1);
        }
        return totalDivisor(num, divisor + 1);
    }

    public static int ehPrimo(int num, int divisor, int contador) {
        if (divisor > num) {
            return contador;
        }
        if (num % divisor == 0) {
            contador++;
        }
        return ehPrimo(num, divisor + 1, contador);
    }
}
