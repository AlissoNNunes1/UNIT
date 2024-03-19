public class ListaDupla<T> {

    private Celula inicio, fim;
    private int tamanho;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public ListaDupla(T elemento){
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
            this.inicio.setAnterior(nova);
            this.inicio = nova;
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
        
        if (posicao ==  0){
            adicionaInicio(elemento);
    } else if(posicao == tamanho){
        adicionaFim(elemento);
    }else{
        Celula nova = new Celula(elemento);
  
        Iterador it  = new Iterador(inicio);
        for (int i=0 ; i < posicao-1; i++) {
           
           it.next();

    }
    Celula anterior = it.getAtual();
    nova.setProximo(anterior.getProximo());
    nova.setAnterior(anterior);
    anterior.getProximo().setAnterior(nova);
    anterior.setProximo(nova);
    tamanho++;
}
}
public void adicionaFim(T elemento){
    if (this.tamanho ==0){
        this.adicionaInicio(elemento);
    }else{
    Celula nova = new Celula(elemento);
    this.fim.setProximo(nova);
    nova.setAnterior(fim);
    this.fim = nova;
    this.tamanho++;
}
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
        fim = null; 
    } else {
        inicio = inicio.getProximo();
        if (inicio != null) {
            inicio.setAnterior(null); 
        } else {
            fim = null; 
        }
        this.tamanho--;
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
        Celula atual = it.getAtual();
        anterior.setProximo(atual.getProximo());
        atual.getProximo().setAnterior(anterior);
        this.tamanho--;
    }
}
public void removeFim(){
    if (this.tamanho == 0) {
        System.out.println("A lista está vazia!");
        
    } else if (inicio == fim) {
        
        inicio = fim = null;
        this.tamanho -= 1;
        
    }else if (this.tamanho == 1) {
        this.removeInicio();
    } else {
        Celula penultima = fim.getAnterior();
        penultima.setProximo(null);
        fim = penultima;
        this.tamanho--;

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


