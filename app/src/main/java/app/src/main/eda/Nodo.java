package app.src.main.eda;
public class Nodo {
    private int valor;
    private Nodo proximoElemento;

    public Nodo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getProximoElemento() {
        return proximoElemento;
    }

    public void setProximoElemento(Nodo proximoElemento) {
        this.proximoElemento = proximoElemento;
    }
}
