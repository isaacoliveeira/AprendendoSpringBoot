package app.src.main.eda;

public class ListaEncadeada {
    private Nodo primeiro;
    private Nodo ultimo;
    private int tamanho;


    public ListaEncadeada() {
        this.tamanho = 0;
    }

    public Nodo getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Nodo primeiro) {
        this.primeiro = primeiro;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void Adicionar(int valor) {
        Nodo elemento = new Nodo(valor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = elemento;
            this.ultimo = elemento;  
        } else {
            this.ultimo.setProximoElemento(elemento);
            this.ultimo = elemento;
        }
        tamanho++;
    }

    public void remover(int valor) {
        Nodo anterior = null;
        Nodo atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor() == valor) {
                if (this.tamanho == 0) {
                    this.primeiro = null;
                    this.ultimo = null;
                } else if (atual == primeiro) {
                    this.primeiro = atual.getProximoElemento();
                    atual.setProximoElemento(null);
                } else if (atual == ultimo) {
                    ultimo = anterior;
                } else {
                    anterior.setProximoElemento(atual.getProximoElemento());
                    atual = null;
                }
                this.tamanho--;  
                break;
            } 
            anterior = atual;
            atual = atual.getProximoElemento();
        }
    }

    public Nodo Index(int posicao) {
        Nodo atual = this.primeiro;
        for ( int i=0; i < posicao; i++) {
            if (atual.getProximoElemento() != null) {
                atual = atual.getProximoElemento();
            }
        }
        return atual; 
    }
    
}


