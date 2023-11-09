package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;

    public ListaLigada() {
        cabeca = null;
    }

    @Override
    public boolean buscaElemento(int valor) {
        No memoria = cabeca;
        boolean bool = false;
        while(true){
            if (valor == memoria.getValor()){
                    bool = true;
                    return bool;
                }
                else if(memoria.getProximo() == null){
                    return bool;
                }
                    else{
                    No proximo = memoria.getProximo();
                    memoria = proximo;
                }
                    
            }     
        }
        
    

    @Override
    public int buscaIndice(int valor) {
        int contador = 0;
        No memoria = cabeca;
        while (true) {
            if (valor == contador) {
                int V = memoria.getValor();
                return V;
            }
            else{
                No proximo = memoria.getProximo();
                memoria = proximo;
                contador++;
            }
        }
    }

    @Override
    public int minimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minimo'");
    }

    @Override
    public int maximo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maximo'");
    }

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElemento'");
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }

    @Override
    public void insereInicio(int valor) {
        if(this.cabeca == null){
            this.cabeca = new No(valor);
        }
        else{
            No n = new No(valor);
            n.setProximo(this.cabeca);
            cabeca = n;
        }
    }

    @Override
    public void insereFim(int valor) {
        No memoria = this.cabeca;
        if(cabeca.getProximo() != null){
        while (true) {            
            if(memoria.getProximo() == null){
                No n = new No(valor);
                memoria.setProximo(n);
                return;
            }
            else{
                No proximo = memoria.getProximo();
                memoria = proximo;
            }
        }
    }
    else{
        return;
    }
        
    }
    
    @Override
    public void remove(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeIndice(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    
}
