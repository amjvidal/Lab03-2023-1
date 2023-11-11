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
        if (cabeca == null){
            return bool;
        }
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
        if (cabeca == null){
            return Integer.MAX_VALUE;
        }
        
        else {
            int min = cabeca.getValor();
            No memoria = cabeca.getProximo();
            while (memoria != null) {
                if (memoria.getValor() < min) {
                    min = memoria.getValor();
                }
                memoria = memoria.getProximo();
            }
            return min;
        }
    }

    @Override
    public int maximo() {
        int maximo = cabeca.getValor();
        No memoria = cabeca;
        while (memoria.getProximo() != null) {
            if (memoria.getValor() >= maximo) {
                maximo = memoria.getValor();
            }
            No proximo = memoria.getProximo();
            memoria = proximo;
        }
        return maximo;
    }

    @Override
    public int predecessor(int valor) {
        int nulo = 0;
        if (cabeca == null || cabeca.getValor() == valor) {
            return nulo;
        } else {
            No memoria = cabeca;
            while (memoria.getProximo() != null && memoria.getProximo().getValor() != valor) {
                memoria = memoria.getProximo();
            }
            return memoria.getProximo() != null ? memoria.getValor() : null;
        }
    }

    @Override
    public int sucessor(int valor) {
        int nulo = 0;
        if (cabeca == null) {
            return nulo;
        } else {
            No memoria = cabeca;
            while (memoria != null && memoria.getValor() != valor) {
                memoria = memoria.getProximo();
            }
            return memoria != null && memoria.getProximo() != null ? memoria.getProximo().getValor() : null;
        }
    }
    

    @Override
    public void insereElemento(int valor) {
        if(this.cabeca == null){
            this.cabeca = new No(valor);
        }
        else{
            No memoria = this.cabeca;
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
    }
    

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        int contador = 0;
        No memoria = cabeca;
        if (cabeca == null) {
            return; }

        if (cabeca.getValor() == buscaIndice) {
        No n = new No(valor);
        n.setProximo(cabeca);
        cabeca = n;
        return;
        }

        while (memoria.getProximo() != null && memoria.getProximo().getValor() != buscaIndice) {
        memoria = memoria.getProximo();
        }

        if (memoria.getProximo() != null) {
        No n = new No(valor);
        n.setProximo(memoria.getProximo());
        memoria.setProximo(n); 
        } 
        else {}
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
        if(this.cabeca == null){
            this.cabeca = new No(valor);
        }
        else{
            No memoria = this.cabeca;
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
    }
    
    @Override
    public void remove(int valor) {
        No memoria = cabeca;
        if (cabeca == null) {
            return; }

        if (cabeca.getValor() == valor) {
        cabeca = cabeca.getProximo(); 
        return;
        }

        while (memoria.getProximo() != null && memoria.getProximo().getValor() != valor) {
        memoria = memoria.getProximo();
        }

        if (memoria.getProximo() != null) {
        memoria.setProximo(memoria.getProximo().getProximo()); 
        } 
        else {}
    }

    @Override
    public void removeIndice(int indice) {
        int contador = 0;
        No memoria = cabeca;
        if (cabeca == null) {
            return; }
    }

    @Override
    public void removeInicio() {
        if (cabeca == null) {
            return; }
        else{
            cabeca = cabeca.getProximo();
        }
    }

    @Override
    public void removeFim() {
        No memoria = cabeca;
        if (cabeca == null) {
            return; }

        if (cabeca.getProximo() == null) {
        cabeca = null; 
        return;
        }

        while (memoria.getProximo().getProximo() != null) {
        memoria = memoria.getProximo();
        }

        if (memoria.getProximo() != null) {
        memoria.setProximo(null); 
        } 
        else {}
    }
    
}
