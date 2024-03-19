public class Celula {

    private Celula proximo;
    private Object elemento;
    private Celula anterior;

    public Celula() {
    }

    public Celula(Object elemento) {
        this.elemento = elemento;
    }

    public Celula(Celula proximo, Object elemento,Celula anterior) {
        this.proximo = proximo;
        this.elemento = elemento;
        this.anterior = anterior;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo; 
    }
    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }
    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

}