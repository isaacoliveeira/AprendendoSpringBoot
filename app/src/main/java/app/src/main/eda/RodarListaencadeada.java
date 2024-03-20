package app.src.main.eda;

public class RodarListaencadeada {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.Adicionar(10);
        lista.Adicionar(12);
        lista.Adicionar(8);
        lista.Adicionar(48);
        lista.Adicionar(24);
        lista.Adicionar(14);
        // lista.remover(14);
        // lista.remover(8);
        // lista.remover(10);
        lista.remover(24);
        lista.remover(12);
        //System.out.println("Removeu o valor 14");

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.Index(i).getValor());
        }

        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println("primeiro elemento: " + lista.getPrimeiro().getValor());
        System.out.println("ultimo elemento: " + lista.getUltimo().getValor());
        //System.out.println(lista.Index(0).getValor());
    }
}
