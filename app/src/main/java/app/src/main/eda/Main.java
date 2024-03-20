package app.src.main.eda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] estados = new String[10];
        estados[0] = "AC"; 
        estados[1] = "PB"; 
        estados[2] = "CE"; 
        estados[3] = "PR"; 
        estados[4] = "BH"; 
        estados[5] = "BA"; 
        estados[6] = "SP"; 
        estados[7] = "RJ"; 
        estados[8] = "MG"; 
        estados[9] = "ES"; 

        for (int i=0; i < estados.length; i++) {
            System.out.println("Estados " + i + " : " + estados[i]);
        }

        boolean encontrou = false;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual Estado Você Deseja buscar? ");
        String buscaEstado = ler.nextLine();
 
        for (int i = 0; i < estados.length; i++) {
            String elemento = estados[i];
            if (elemento.equalsIgnoreCase(buscaEstado)) {
                encontrou = true;
                break;
            }
        }
        if (encontrou == true) {
            System.out.println("Estado encontrado");
        } else {
            System.out.println("Estado não encontrado");
        }
    }
}
