package app.src.main.eda;
public class testeIndex1 {
    public static void main(String[] args) {
        index1 lista1 = new index1(19, "isaac", "LDR");
        index1 lista2 = new index1(17, "pedro", "HOPE" );

        // System.out.printf("Nome: " + lista1.getNome() + " idade: " + lista1.getIdade());
        // System.out.println();
        // System.out.printf("Nome: " + lista2.getNome() + " idade: " + lista2.getIdade());
        System.out.println(lista1.toString());
    }
}
