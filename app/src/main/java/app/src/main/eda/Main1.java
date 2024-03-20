package app.src.main.eda;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int divisor = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        for (int i=1; i < num + 1; i++) {
            if (num % i == 0) {
                divisor++;
            }
        }
        if (divisor == 2) {
            System.out.println("eh primo");
        } else {
            System.out.println("nao eh primo");
        }
    }
}
