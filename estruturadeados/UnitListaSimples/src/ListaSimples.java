public class ListaSimples<T> {

    private Celula inicio, fim;
    private int tamanho;

    public ListaSimples() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public ListaSimples(T elemento){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        this.adicionaInicio(elemento);
    
    }

    public void adicionaInicio(T elemento) {
        Celula nova = new Celula(elemento);
        if (this.tamanho == 0) {
            inicio = fim = nova;
            this.tamanho += 1;
        } else {
            nova.setProximo(inicio);
            inicio = nova;
            this.tamanho += 1;
        }
    }

    public T Recupera(int posicao) {
        
        if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");
            return null;
            
        } else if (posicao < 0 || posicao >= this.tamanho) {
            
            System.out.println("A Posição " + posicao + " é Inválida!");
            return null;
            
        } else {
            
            Iterador it = new Iterador(this.inicio);
            int i = 0;
            while (it.hasNext()) {
                if (i != posicao) {
                    it.next();
                    i++;
                } else {
                    break;
                }
            }
            
            return (T) it.getAtual().getElemento();
        }
    }
    public void adiciona (T elemento, int posicao){
        if(posicao < 0 || posicao > tamanho){
            System.out.println("Posição inválida");
            return;
        }
        Celula nova = new Celula(elemento);
        if (posicao ==  0){
            adicionaInicio(elemento);
    } else if(posicao == tamanho){
        adicionaFim(elemento);
    }else{
        Celula anterior = null;
        Iterador it  = new Iterador(inicio);
        for (int i=0 ; i < posicao; i++) {
           anterior = it.getAtual();
           it.next();

    }
    nova.setProximo(anterior.getProximo());
    anterior.setProximo(nova);
    tamanho++;
}
}
public void adicionaFim(T elemento){
    Celula anterior = null;
    Celula nova = new Celula(elemento);
    
    Iterador it = new Iterador(inicio);
    while (it.hasNext()) {
        anterior = it.getAtual();
        it.next();
    }
    anterior.setProximo(nova);
    fim = nova;
    tamanho++;
}
public boolean existeDado(T elemento) {
    @SuppressWarnings("rawtypes")
    Iterador it = new Iterador(inicio);
    while (it.hasNext()) {
        T elementoAtual = (T) it.next();
        if (elementoAtual.equals(elemento)) {
            return true; 
        }
    }
    return false; 
}

    public void removeInicio() {
        
        if (this.tamanho == 0) {
            System.out.println("A lista está vazia!");
            
        } else if (inicio == fim) {
            
            inicio = fim = null;
            this.tamanho -= 1;
            
        } else {
            
            inicio = inicio.getProximo();
            this.tamanho -= 1;
        }
    }
    
    public void remove(int posicao){
        if (this.tamanho == 0) {
            
            System.out.println("A lista está vazia!!");
            
    } else if (posicao < 0 || posicao >= this.tamanho) {
            
        System.out.println("A Posição " + posicao + " é Inválida!");
        
        
    }else if(posicao == 0) {
        removeInicio();
    }else{
        Iterador it = new Iterador(this.inicio);
        Celula anterior = null;
        int i = 0;
        while (it.hasNext() && i < posicao) {
            anterior = it.getAtual();
            it.next();
            i++;
        }
        anterior.setProximo(it.getAtual().getProximo());
        if (it.getAtual() == this.fim) {
            this.fim = anterior;
        }
        this.tamanho--;
    }
}
public void removeFim(){
    if (this.tamanho == 0) {
        System.out.println("A lista está vazia!");
        
    } else if (inicio == fim) {
        
        inicio = fim = null;
        this.tamanho -= 1;
        
    } else {
        Iterador it = new Iterador(this.inicio);
        Celula anterior = null;
        while (it.hasNext()){
            anterior = it.getAtual();
            it.next();
        }
        anterior.setProximo(null);
        fim=anterior;
        this.tamanho-=1;
    }
}
public int tamanho() {
    System.out.println(this.tamanho);
    return this.tamanho;
    
}
public void limpa(){
    this.inicio = null;
    this.fim = null;
    this.tamanho = 0;
    System.out.println( "Lista Limpa!" );

}
}


