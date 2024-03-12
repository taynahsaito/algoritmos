public class Lista {
    private No primeiro;

    //construtor padrão
    public No getPrimeiro(){ //devolve uma ref de nó
        return primeiro;
    }

    //estamos trabalhando com referencia, faz sentido usar null
    public boolean estaVazia(){
        return primeiro == null;
    }
    
    public void insereInicio(int i){
        No novo = new No(i);
        if (!estaVazia()){
            primeiro = novo;
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }

}
